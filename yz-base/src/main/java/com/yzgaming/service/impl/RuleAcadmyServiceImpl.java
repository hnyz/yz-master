/*
 * 文 件 名:  RuleAcadmyServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.yzgaming.service.RuleAcadmyService;
import com.yzgaming.model.RuleAcadmy;
import com.yzgaming.dao.mysql.RuleAcadmyMapper;

/**
 * <一句话功能简述>
 */
@Service
public class RuleAcadmyServiceImpl implements RuleAcadmyService {
	
    @Autowired
    private RuleAcadmyMapper ruleAcadmyMapper;
    
    @Transactional
	public int add(RuleAcadmy ruleAcadmy) {
		if(null == ruleAcadmy){
			return 0;
		}
        int rows = ruleAcadmyMapper.insert(ruleAcadmy);
        return rows;
	}

    
    @Transactional
    public int update(RuleAcadmy ruleAcadmy) {
		if(null == ruleAcadmy){
			return 0;
		}
        int rows = ruleAcadmyMapper.update(ruleAcadmy);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = ruleAcadmyMapper.deleteById(id);
        return rows;
    }
    
    
    public RuleAcadmy getById(Integer id) {
		if(null == id){
			return null;
		}
		RuleAcadmy ruleAcadmy = ruleAcadmyMapper.getById(id);
		//
        return ruleAcadmy;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = ruleAcadmyMapper.countBy(params);
		return rows;
	}
	
	public List<RuleAcadmy> listPage(Map<String, Object> params){
		List<RuleAcadmy> lists = ruleAcadmyMapper.listPage(params);
		
		return lists;
	}
}
