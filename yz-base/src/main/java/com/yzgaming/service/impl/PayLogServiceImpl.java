/*
 * 文 件 名:  PayLogServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;

import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.service.PayLogService;
import com.yzgaming.model.PayLog;
import com.yzgaming.dao.mysql.PayLogMapper;

/**
 * <一句话功能简述>
 */
@Service
public class PayLogServiceImpl implements PayLogService {
	
    @Autowired
    private PayLogMapper payLogMapper;
    
    @Transactional
	public int add(PayLog payLog) {
		if(null == payLog){
			return 0;
		}
        int rows = payLogMapper.insert(payLog);
        return rows;
	}

    
    @Transactional
    public int update(PayLog payLog) {
		if(null == payLog){
			return 0;
		}
        int rows = payLogMapper.update(payLog);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = payLogMapper.deleteById(id);
        return rows;
    }
    
    
    public PayLog getById(Integer id) {
		if(null == id){
			return null;
		}
		PayLog payLog = payLogMapper.getById(id);
		//
        return payLog;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = payLogMapper.countBy(params);
		return rows;
	}
	
	public List<PayLog> listPage(Map<String, Object> params){
		List<PayLog> lists = payLogMapper.listPage(params);
		
		return lists;
	}
}
