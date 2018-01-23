/*
 * 文 件 名:  UserInfoServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl.user;

import java.util.*;

import com.yzgaming.dao.mysql.MatchInfoMapper;
import com.yzgaming.dao.mysql.RecordInfoMapper;
import com.yzgaming.dao.mysql.SignMatchMapper;
import com.yzgaming.dao.mysql.SignRecordMapper;
import com.yzgaming.dao.mysql.user.LolGameInfoMapper;
import com.yzgaming.dao.redis.api.RedisBaseDAO;
import com.yzgaming.model.MatchInfo;
import com.yzgaming.model.SignMatch;
import com.yzgaming.model.SignRecord;
import com.yzgaming.model.user.LolGameInfo;
import com.yzgaming.util.common.MD5Util;
import com.yzgaming.util.common.QueryConditionMap;
import com.yzgaming.util.common.YZException;
import com.yzgaming.util.enmu.GameInfoCode;
import com.yzgaming.vo.VerificationRecordVO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.service.user.UserInfoService;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.dao.mysql.user.UserInfoMapper;

/**
 * <一句话功能简述>
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
	
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
	private RedisBaseDAO redisBaseDAO;
	@Autowired
	private LolGameInfoMapper lolGameInfoMapper;
	@Autowired
	private SignMatchMapper signMatchMapper;
	@Autowired
	private RecordInfoMapper recordInfoMapper;
	@Autowired
	private SignRecordMapper signRecordMapper;
	@Autowired
	private MatchInfoMapper matchInfoMapper;
    @Transactional
	public int add(UserInfo userInfo) {
		if(null == userInfo){
			return 0;
		}
		userInfo.setUserPassword(MD5Util.MD5(userInfo.getUserPassword()));
		userInfo.setJoinTime(new Date());

        int rows = userInfoMapper.insert(userInfo);
        return rows;
	}

    
    @Transactional
    public int update(UserInfo userInfo) {
		if(null == userInfo){
			return 0;
		}
        int rows = userInfoMapper.update(userInfo);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = userInfoMapper.deleteById(id);
        return rows;
    }
    
    
    public UserInfo getById(Integer id) {
		if(null == id){
			return null;
		}
		UserInfo userInfo = userInfoMapper.getById(id);
		//
        return userInfo;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = userInfoMapper.countBy(params);
		return rows;
	}
	
	public List<UserInfo> listPage(Map<String, Object> params){
		List<UserInfo> lists = userInfoMapper.listPage(params);
		
		return lists;
	}

	@Override
	public UserInfo loginBymobile(String mobile,String passWord) throws YZException {
		UserInfo userInfo=userInfoMapper.getBymobile(mobile);
		if (userInfo == null ||  //未注册
				!userInfo.getUserPassword().equals(passWord)){
             throw new YZException(4001,"用户名或密码错误");
		}
		return  userInfo;
	}

	@Override
	public UserInfo register(String mobile) {
		UserInfo userInfo=new UserInfo();
		userInfo.setJoinTime(new Date());
		userInfo.setUserComing(3);
		userInfo.setUserMobile(mobile);
		userInfo.setUserName(mobile);
		userInfoMapper.insert(userInfo);

		return userInfo;
	}

	@Override
	public LolGameInfo existenceLolgameInfo(UserInfo  userInfo) throws YZException {
		LolGameInfo gameInfo = lolGameInfoMapper.getByUserId(userInfo.getId().intValue());
        if(gameInfo==null){
        	throw new YZException(GameInfoCode.NOT_GAMEINFO.getCode(),GameInfoCode.NOT_GAMEINFO.getMessage());
		}
		return gameInfo;
	}

	@Override
	public VerificationRecordVO verificationLolgameInfo(UserInfo userInfo,String gameUin) throws YZException {
		LolGameInfo gameInfo = lolGameInfoMapper.getByUserId(userInfo.getId().intValue());
		//有没有绑定游戏账户
		if(gameInfo==null){
			throw new YZException(GameInfoCode.NOT_GAMEINFO.getCode(),GameInfoCode.NOT_GAMEINFO.getMessage());
		}
		//使用的游戏账户是否匹配
		if(!gameInfo.getGameUin().equals(gameUin)){
			String message=GameInfoCode.NOT_THIS_GAMEINFO.getMessage()+"请使用"+gameInfo.getGameName()+"("+gameInfo.getGameAreaName()+")进行游戏";
			throw new YZException(GameInfoCode.NOT_THIS_GAMEINFO.getCode(),message);
		}
		//游戏账户是否报名
		List<SignMatch> signMatchs = signMatchMapper.getByUser(userInfo.getId());
		if (signMatchs==null||signMatchs.size()==0){
			throw new  YZException(GameInfoCode.NO_MATCH_SIGN.getCode(),GameInfoCode.NO_MATCH_SIGN.getMessage());
		}
		//报名的赛事是否还需要几场比赛(查战绩表)
        Integer  countAmount=0;
		VerificationRecordVO resultVO=new VerificationRecordVO();
		for (SignMatch sm:signMatchs){
			Map<String, Object> resultMap=new HashMap<String, Object>();
			QueryConditionMap params = QueryConditionMap.newInstance();
			SignRecord signRecord=new SignRecord();
			signRecord.setSignId(sm.getId());
			params.setCondition(signRecord);
			int countRecord = signRecordMapper.countBy(params);
			MatchInfo matchInfo=matchInfoMapper.getById(sm.getMatchId());
			countAmount+=matchInfo.getPlayNum()-countRecord;
			resultMap.put("matchName",matchInfo.getMatchName());
			resultMap.put("count",matchInfo.getPlayNum()-countRecord);
			resultVO.getMatchMap().add(resultMap);
		}
		resultVO.setCountAmount(countAmount);
		return resultVO;
	}
}
