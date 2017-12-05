/*
 * 文 件 名:  SignMatchServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.yzgaming.dao.mysql.MatchInfoMapper;
import com.yzgaming.dao.mysql.user.UserInfoMapper;
import com.yzgaming.model.MatchInfo;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.util.common.ClientExceptionEnum;
import com.yzgaming.util.common.NumberConstant;
import com.yzgaming.util.common.YZException;
import com.yzgaming.vo.match.MatchInfoVO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.service.SignMatchService;
import com.yzgaming.model.SignMatch;
import com.yzgaming.dao.mysql.SignMatchMapper;

/**
 * <一句话功能简述>
 */
@Service
public class SignMatchServiceImpl implements SignMatchService {
	
    @Autowired
    private SignMatchMapper signMatchMapper;
    @Autowired
	private MatchInfoMapper matchInfoMapper;
    @Autowired
	private UserInfoMapper userInfoMapper;
    
    @Transactional
	public int add(SignMatch signMatch) {
		if(null == signMatch){
			return 0;
		}
        int rows = signMatchMapper.insert(signMatch);
        return rows;
	}

    
    @Transactional
    public int update(SignMatch signMatch) {
		if(null == signMatch){
			return 0;
		}
        int rows = signMatchMapper.update(signMatch);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = signMatchMapper.deleteById(id);
        return rows;
    }
    
    
    public SignMatch getById(Integer id) {
		if(null == id){
			return null;
		}
		SignMatch signMatch = signMatchMapper.getById(id);
		//
        return signMatch;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = signMatchMapper.countBy(params);
		return rows;
	}
	
	public List<SignMatch> listPage(Map<String, Object> params){
		List<SignMatch> lists = signMatchMapper.listPage(params);
		
		return lists;
	}

	@Override
	@Transactional
	public int signNewMatch(UserInfo userInfo, MatchInfoVO matchInfoVO) throws YZException {
		//检测用户剩余易币是否充足
		Integer userVolume = userInfo.getUserVolume();
		MatchInfo matchInfo = matchInfoMapper.getById(matchInfoVO.getId());
		if(matchInfo.getSignFee()>userVolume){
			throw new YZException(ClientExceptionEnum.VOLUME_INSUFFICIENT.getCode(),ClientExceptionEnum.VOLUME_INSUFFICIENT.getMessage());
		}
		//检查赛事是否进行中
		if(matchInfo.getEndState()== NumberConstant.TWO){
           //抛赛事已被关闭
			throw new YZException(ClientExceptionEnum.MATCH_CLOSE.getCode(),ClientExceptionEnum.MATCH_CLOSE.getMessage());

		}
		//检查赛事是否过期
		if(matchInfo.getMatchEndTime().getTime()<new Date().getTime()){
          //抛赛事已经过期
		  throw new YZException(ClientExceptionEnum.MATCH_OVERDUE.getCode(),ClientExceptionEnum.MATCH_OVERDUE.getMessage());
		}
		//执行报名
		SignMatch sign=new SignMatch();
		sign.setUserId(Integer.parseInt(userInfo.getId().toString()));
		sign.setUserName(userInfo.getUserName());
		sign.setMatchId(matchInfo.getId());
		sign.setMatchName(matchInfo.getMatchName());
		sign.setSignTime(new Date());
		sign.setSignState(NumberConstant.ONE);
		signMatchMapper.insert(sign);
		//扣除用户点卷
		userInfoMapper.updateVolume(Integer.parseInt(userInfo.getId().toString()),-(matchInfo.getSignFee()));
		//记录点卷日志

		//赠送积分

		//写积分日志

		return 0;
	}
}
