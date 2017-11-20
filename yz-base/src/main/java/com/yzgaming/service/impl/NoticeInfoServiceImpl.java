/*
 * 文 件 名:  NoticeInfoServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.service.NoticeInfoService;
import com.yzgaming.model.NoticeInfo;
import com.yzgaming.dao.mysql.NoticeInfoMapper;

/**
 * <一句话功能简述>
 */
@Service
public class NoticeInfoServiceImpl implements NoticeInfoService {
	
    @Autowired
    private NoticeInfoMapper noticeInfoMapper;
    
    @Transactional
	public int add(NoticeInfo noticeInfo) {
		if(null == noticeInfo){
			return 0;
		}
        int rows = noticeInfoMapper.insert(noticeInfo);
        return rows;
	}

    
    @Transactional
    public int update(NoticeInfo noticeInfo) {
		if(null == noticeInfo){
			return 0;
		}
        int rows = noticeInfoMapper.update(noticeInfo);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = noticeInfoMapper.deleteById(id);
        return rows;
    }
    
    
    public NoticeInfo getById(Integer id) {
		if(null == id){
			return null;
		}
		NoticeInfo noticeInfo = noticeInfoMapper.getById(id);
		//
        return noticeInfo;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = noticeInfoMapper.countBy(params);
		return rows;
	}
	
	public List<NoticeInfo> listPage(Map<String, Object> params){
		List<NoticeInfo> lists = noticeInfoMapper.listPage(params);
		
		return lists;
	}
}
