/*
 * 文 件 名:  PrizeNoticeServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.service.PrizeNoticeService;
import com.yzgaming.model.PrizeNotice;
import com.yzgaming.dao.mysql.PrizeNoticeMapper;

/**
 * <一句话功能简述>
 */
@Service
public class PrizeNoticeServiceImpl implements PrizeNoticeService {
	
    @Autowired
    private PrizeNoticeMapper prizeNoticeMapper;
    
    @Transactional
	public int add(PrizeNotice prizeNotice) {
		if(null == prizeNotice){
			return 0;
		}
        int rows = prizeNoticeMapper.insert(prizeNotice);
        return rows;
	}

    
    @Transactional
    public int update(PrizeNotice prizeNotice) {
		if(null == prizeNotice){
			return 0;
		}
        int rows = prizeNoticeMapper.update(prizeNotice);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = prizeNoticeMapper.deleteById(id);
        return rows;
    }
    
    
    public PrizeNotice getById(Integer id) {
		if(null == id){
			return null;
		}
		PrizeNotice prizeNotice = prizeNoticeMapper.getById(id);
		//
        return prizeNotice;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = prizeNoticeMapper.countBy(params);
		return rows;
	}
	
	public List<PrizeNotice> listPage(Map<String, Object> params){
		List<PrizeNotice> lists = prizeNoticeMapper.listPage(params);
		
		return lists;
	}
}
