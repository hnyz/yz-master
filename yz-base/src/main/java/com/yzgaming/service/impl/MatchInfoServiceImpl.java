/*
 * 文 件 名:  MatchInfoServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;

import java.util.List;
import java.util.Map;

import com.yzgaming.model.user.UserInfo;
import com.yzgaming.util.common.YZException;
import com.yzgaming.util.enmu.GameInfoCode;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.service.MatchInfoService;
import com.yzgaming.model.MatchInfo;
import com.yzgaming.dao.mysql.MatchInfoMapper;

/**
 * <一句话功能简述>
 */
@Service
public class MatchInfoServiceImpl implements MatchInfoService {
	
    @Autowired
    private MatchInfoMapper matchInfoMapper;
    
    @Transactional
	public int add(MatchInfo matchInfo) {
		if(null == matchInfo){
			return 0;
		}
        int rows = matchInfoMapper.insert(matchInfo);
        return rows;
	}

    
    @Transactional
    public int update(MatchInfo matchInfo) {
		if(null == matchInfo){
			return 0;
		}
        int rows = matchInfoMapper.update(matchInfo);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = matchInfoMapper.deleteById(id);
        return rows;
    }
    
    
    public MatchInfo getById(Integer id) {
		if(null == id){
			return null;
		}
		MatchInfo matchInfo = matchInfoMapper.getById(id);
		//
        return matchInfo;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = matchInfoMapper.countBy(params);
		return rows;
	}
	
	public List<MatchInfo> listPage(Map<String, Object> params){
		List<MatchInfo> lists = matchInfoMapper.listPage(params);
		
		return lists;
	}

	@Override
	@Transactional
	public void signMatch(UserInfo userInfo, Integer matchId) throws YZException {
		//获取赛事信息
		MatchInfo match = matchInfoMapper.getById(matchId);
		Integer userVolume = userInfo.getUserVolume();
		if(match.getBonusAmount()>userVolume){
			//点卷不足
			throw new YZException(GameInfoCode.INSUFFICIENT_VOLUME.getCode(),GameInfoCode.INSUFFICIENT_VOLUME.getMessage());
		}

	}
}
