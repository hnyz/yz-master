/*
 * 文 件 名:  RecordJsonServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.service.RecordJsonService;
import com.yzgaming.model.RecordJson;
import com.yzgaming.dao.mysql.RecordJsonMapper;

/**
 * <一句话功能简述>
 */
@Service
public class RecordJsonServiceImpl implements RecordJsonService {
	
    @Autowired
    private RecordJsonMapper recordJsonMapper;
    
    @Transactional
	public int add(RecordJson recordJson) {
		if(null == recordJson){
			return 0;
		}
        int rows = recordJsonMapper.insert(recordJson);
        return rows;
	}

    
    @Transactional
    public int update(RecordJson recordJson) {
		if(null == recordJson){
			return 0;
		}
        int rows = recordJsonMapper.update(recordJson);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = recordJsonMapper.deleteById(id);
        return rows;
    }
    
    
    public RecordJson getById(Integer id) {
		if(null == id){
			return null;
		}
		RecordJson recordJson = recordJsonMapper.getById(id);
		//
        return recordJson;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = recordJsonMapper.countBy(params);
		return rows;
	}
	
	public List<RecordJson> listPage(Map<String, Object> params){
		List<RecordJson> lists = recordJsonMapper.listPage(params);
		
		return lists;
	}
}
