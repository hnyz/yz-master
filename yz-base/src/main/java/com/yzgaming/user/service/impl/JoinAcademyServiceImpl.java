/*
 * 文 件 名:  JoinAcademyServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.user.service.JoinAcademyService;
import com.yzgaming.user.model.JoinAcademy;
import com.yzgaming.user.dao.mysql.JoinAcademyMapper;

/**
 * <一句话功能简述>
 */
@Service
public class JoinAcademyServiceImpl implements JoinAcademyService {
	
    @Autowired
    private JoinAcademyMapper joinAcademyMapper;
    
    @Transactional
	public int add(JoinAcademy joinAcademy) {
		if(null == joinAcademy){
			return 0;
		}
        int rows = joinAcademyMapper.insert(joinAcademy);
        return rows;
	}

    
    @Transactional
    public int update(JoinAcademy joinAcademy) {
		if(null == joinAcademy){
			return 0;
		}
        int rows = joinAcademyMapper.update(joinAcademy);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = joinAcademyMapper.deleteById(id);
        return rows;
    }
    
    
    public JoinAcademy getById(Integer id) {
		if(null == id){
			return null;
		}
		JoinAcademy joinAcademy = joinAcademyMapper.getById(id);
		//
        return joinAcademy;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = joinAcademyMapper.countBy(params);
		return rows;
	}
	
	public List<JoinAcademy> listPage(Map<String, Object> params){
		List<JoinAcademy> lists = joinAcademyMapper.listPage(params);
		
		return lists;
	}
}
