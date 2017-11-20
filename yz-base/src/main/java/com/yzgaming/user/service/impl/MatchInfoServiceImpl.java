/*
 * 文 件 名:  MatchInfoServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.user.service.MatchInfoService;
import com.yzgaming.user.model.MatchInfo;
import com.yzgaming.user.dao.mysql.MatchInfoMapper;

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
}
