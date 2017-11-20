/*
 * 文 件 名:  MilitaryAcademyServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.service.MilitaryAcademyService;
import com.yzgaming.model.MilitaryAcademy;
import com.yzgaming.dao.mysql.MilitaryAcademyMapper;

/**
 * <一句话功能简述>
 */
@Service
public class MilitaryAcademyServiceImpl implements MilitaryAcademyService {
	
    @Autowired
    private MilitaryAcademyMapper militaryAcademyMapper;
    
    @Transactional
	public int add(MilitaryAcademy militaryAcademy) {
		if(null == militaryAcademy){
			return 0;
		}
        int rows = militaryAcademyMapper.insert(militaryAcademy);
        return rows;
	}

    
    @Transactional
    public int update(MilitaryAcademy militaryAcademy) {
		if(null == militaryAcademy){
			return 0;
		}
        int rows = militaryAcademyMapper.update(militaryAcademy);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = militaryAcademyMapper.deleteById(id);
        return rows;
    }
    
    
    public MilitaryAcademy getById(Integer id) {
		if(null == id){
			return null;
		}
		MilitaryAcademy militaryAcademy = militaryAcademyMapper.getById(id);
		//
        return militaryAcademy;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = militaryAcademyMapper.countBy(params);
		return rows;
	}
	
	public List<MilitaryAcademy> listPage(Map<String, Object> params){
		List<MilitaryAcademy> lists = militaryAcademyMapper.listPage(params);
		
		return lists;
	}
}
