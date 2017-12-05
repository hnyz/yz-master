/*
 * 文 件 名:  RuleMatchServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;

import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.service.RuleMatchService;
import com.yzgaming.model.RuleMatch;
import com.yzgaming.dao.mysql.RuleMatchMapper;

/**
 * <一句话功能简述>
 */
@Service
public class RuleMatchServiceImpl implements RuleMatchService {
	
    @Autowired
    private RuleMatchMapper ruleMatchMapper;
    
    @Transactional
	public int add(RuleMatch ruleMatch) {
		if(null == ruleMatch){
			return 0;
		}
        int rows = ruleMatchMapper.insert(ruleMatch);
        return rows;
	}

    
    @Transactional
    public int update(RuleMatch ruleMatch) {
		if(null == ruleMatch){
			return 0;
		}
        int rows = ruleMatchMapper.update(ruleMatch);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = ruleMatchMapper.deleteById(id);
        return rows;
    }
    
    
    public RuleMatch getById(Integer id) {
		if(null == id){
			return null;
		}
		RuleMatch ruleMatch = ruleMatchMapper.getById(id);
		//
        return ruleMatch;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = ruleMatchMapper.countBy(params);
		return rows;
	}
	
	public List<RuleMatch> listPage(Map<String, Object> params){
		List<RuleMatch> lists = ruleMatchMapper.listPage(params);
		
		return lists;
	}
}
