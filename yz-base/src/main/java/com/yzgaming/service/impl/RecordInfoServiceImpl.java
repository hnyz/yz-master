/*
 * 文 件 名:  RecordInfoServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;

import java.util.*;

import com.yzgaming.dao.mysql.*;
import com.yzgaming.dao.redis.api.RedisBaseDAO;
import com.yzgaming.model.MatchInfo;
import com.yzgaming.model.RecordJson;
import com.yzgaming.model.SignRecord;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.util.common.*;
import com.yzgaming.vo.acade.AcadeJoinVO;
import com.yzgaming.vo.match.MatchSignNumVO;
import com.yzgaming.vo.match.SignMatchVO;
import com.yzgaming.vo.record.RecordVO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.yzgaming.service.RecordInfoService;
import com.yzgaming.model.RecordInfo;
import org.springframework.web.bind.annotation.RequestParam;
import sun.util.resources.cldr.si.LocaleNames_si;

/**
 * <一句话功能简述>
 */
@Service
public class RecordInfoServiceImpl implements RecordInfoService {
	
    @Autowired
    private RecordInfoMapper recordInfoMapper;
    @Autowired
	private RecordJsonMapper recordJsonMapper;
    @Autowired
	private MatchInfoMapper matchInfoMapper;
    @Autowired
	private SignRecordMapper signRecordMapper;
    @Autowired
	private RedisBaseDAO redisBaseDAO;
    @Autowired
	private MilitaryAcademyMapper militaryAcademyMapper;
    
    @Transactional
	public int add(RecordInfo recordInfo) {
		if(null == recordInfo){
			return 0;
		}
        int rows = recordInfoMapper.insert(recordInfo);
        return rows;
	}

    
    @Transactional
    public int update(RecordInfo recordInfo) {
		if(null == recordInfo){
			return 0;
		}
        int rows = recordInfoMapper.update(recordInfo);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = recordInfoMapper.deleteById(id);
        return rows;
    }
    
    
    public RecordInfo getById(Integer id) {
		if(null == id){
			return null;
		}
		RecordInfo recordInfo = recordInfoMapper.getById(id);
		//
        return recordInfo;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = recordInfoMapper.countBy(params);
		return rows;
	}
	
	public List<RecordInfo> listPage(Map<String, Object> params){
		List<RecordInfo> lists = recordInfoMapper.listPage(params);
		
		return lists;
	}

	/**
	 * 上传战绩
	 * @param userInfo
	 * @param uploadString
	 * @return
	 * @throws YZException
	 */
	@Override
	public List<MatchSignNumVO> uploadRecord(UserInfo userInfo, String uploadString) throws YZException{
		//数据解密
		int userId = userInfo.getId().intValue();
		List<MatchSignNumVO>  matchSignNumList=new ArrayList<MatchSignNumVO>();
		String recordString = null;
		try {
			recordString = AESUtil.Decrypt(uploadString, PropertyUtil.getProperty("RECORDPWD"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//数据转换
		RecordVO recordVO = (RecordVO) JsonHelper.toObject(recordString, RecordVO.class);
		RecordInfo recordInfo = recordVO.getRecordInfo();
		RecordJson recordJson = recordVO.getRecordJson();
		long recordTime = recordInfo.getEndTime().getTime();
		//验证参数
		if (recordTime>new Date().getTime()){
			throw new YZException(400,"参数不合法");
		}
		//TODO 赛事部分的战绩开始
		//获取用户参加了并且有效的赛事
		List<SignMatchVO> SignMatchs = matchInfoMapper.getByEndState(userId, NumberConstant.ONE);
		//还需要战绩的赛事
        List<SignMatchVO>  accord=new ArrayList<SignMatchVO>();
		for(SignMatchVO match:SignMatchs){
           if(match.getMatchEndTime().getTime()<recordTime||match.getMatchStartTime().getTime()>recordTime){
			   if(match.getPlayNum()>match.getCountSign()){
				   //还需要战绩
				   accord.add(match);
			   }
		   }
		}
		if(accord.size()>0){
			//保存战绩
			recordInfoMapper.insert(recordInfo);
			//保存10人JSON数据
			recordJsonMapper.insert(recordJson);
			//批量保存战绩与报名的关系
			List<SignRecord> signRecords=new ArrayList<SignRecord>();
			for (SignMatchVO signMatchVO:accord){
				MatchSignNumVO signNumVO=new MatchSignNumVO();
				SignRecord signRecord=new SignRecord();
				signRecord.setSignId(signMatchVO.getSignId());
				signRecord.setRecordId(recordInfo.getId());
				signRecords.add(signRecord);
				Integer countSign = signMatchVO.getCountSign()-signMatchVO.getPlayNum();//保存之前的战绩数
				signNumVO.setMatchId(signMatchVO.getMatchId());
				signNumVO.setMatchName(signMatchVO.getMatchName());
				signNumVO.setRecordCount(countSign-NumberConstant.ONE);
				matchSignNumList.add(signNumVO);
			}
			signRecordMapper.batchSave(signRecords);
			//新增或修改排行榜Score[key为赛事ID,value为userId,score为整数位前2位是杀人数量，第345位为KDA,小数位为比赛时长 ]
			Double score=MathematicsUtil.getScore(recordInfo.getKillNum(),recordInfo.getRecordKda(),recordInfo.getTimeLong());
			redisBaseDAO.setZSet(recordInfo.getMatchId().toString(),userId,score);

		}
		//TODO 赛事部分的战绩结束，奖武堂部分的战绩开始
		//获取用户加入的有效的计划
		List<AcadeJoinVO> AcadeJoinList = militaryAcademyMapper.getByUserJoin(userId);
		//获取今天还没有获奖记录的

		return matchSignNumList;
	}
}
