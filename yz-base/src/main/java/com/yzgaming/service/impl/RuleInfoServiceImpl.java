/*
 * 文 件 名:  RuleInfoServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.yzgaming.service.RuleInfoService;
import com.yzgaming.model.RuleInfo;
import com.yzgaming.dao.mysql.RuleInfoMapper;

/**
 * <一句话功能简述>
 */
@Service
public class RuleInfoServiceImpl implements RuleInfoService {
	
    @Autowired
    private RuleInfoMapper ruleInfoMapper;
    
    @Transactional
	public int add(RuleInfo ruleInfo) {
		if(null == ruleInfo){
			return 0;
		}
        int rows = ruleInfoMapper.insert(ruleInfo);
        return rows;
	}

    
    @Transactional
    public int update(RuleInfo ruleInfo) {
		if(null == ruleInfo){
			return 0;
		}
        int rows = ruleInfoMapper.update(ruleInfo);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = ruleInfoMapper.deleteById(id);
        return rows;
    }
    
    
    public RuleInfo getById(Integer id) {
		if(null == id){
			return null;
		}
		RuleInfo ruleInfo = ruleInfoMapper.getById(id);
		//
        return ruleInfo;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = ruleInfoMapper.countBy(params);
		return rows;
	}
	
	public List<RuleInfo> listPage(Map<String, Object> params){
		List<RuleInfo> lists = ruleInfoMapper.listPage(params);
		
		return lists;
	}
}
