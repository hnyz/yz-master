/*
 * 文 件 名:  AcadeJoinServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.yzgaming.service.AcadeJoinService;
import com.yzgaming.model.AcadeJoin;
import com.yzgaming.dao.mysql.AcadeJoinMapper;

/**
 * <一句话功能简述>
 */
@Service
public class AcadeJoinServiceImpl implements AcadeJoinService {
	
    @Autowired
    private AcadeJoinMapper acadeJoinMapper;
    
    @Transactional
	public int add(AcadeJoin acadeJoin) {
		if(null == acadeJoin){
			return 0;
		}
        int rows = acadeJoinMapper.insert(acadeJoin);
        return rows;
	}

    
    @Transactional
    public int update(AcadeJoin acadeJoin) {
		if(null == acadeJoin){
			return 0;
		}
        int rows = acadeJoinMapper.update(acadeJoin);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = acadeJoinMapper.deleteById(id);
        return rows;
    }
    
    
    public AcadeJoin getById(Integer id) {
		if(null == id){
			return null;
		}
		AcadeJoin acadeJoin = acadeJoinMapper.getById(id);
		//
        return acadeJoin;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = acadeJoinMapper.countBy(params);
		return rows;
	}
	
	public List<AcadeJoin> listPage(Map<String, Object> params){
		List<AcadeJoin> lists = acadeJoinMapper.listPage(params);
		
		return lists;
	}
}
