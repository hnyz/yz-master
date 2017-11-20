/*
 * 文 件 名:  BannerImageServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.user.service.BannerImageService;
import com.yzgaming.user.model.BannerImage;
import com.yzgaming.user.dao.mysql.BannerImageMapper;

/**
 * <一句话功能简述>
 */
@Service
public class BannerImageServiceImpl implements BannerImageService {
	
    @Autowired
    private BannerImageMapper bannerImageMapper;
    
    @Transactional
	public int add(BannerImage bannerImage) {
		if(null == bannerImage){
			return 0;
		}
        int rows = bannerImageMapper.insert(bannerImage);
        return rows;
	}

    
    @Transactional
    public int update(BannerImage bannerImage) {
		if(null == bannerImage){
			return 0;
		}
        int rows = bannerImageMapper.update(bannerImage);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = bannerImageMapper.deleteById(id);
        return rows;
    }
    
    
    public BannerImage getById(Integer id) {
		if(null == id){
			return null;
		}
		BannerImage bannerImage = bannerImageMapper.getById(id);
		//
        return bannerImage;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = bannerImageMapper.countBy(params);
		return rows;
	}
	
	public List<BannerImage> listPage(Map<String, Object> params){
		List<BannerImage> lists = bannerImageMapper.listPage(params);
		
		return lists;
	}
}
