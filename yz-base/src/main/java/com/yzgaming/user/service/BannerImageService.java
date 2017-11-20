/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.user.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.user.model.BannerImage;

/**
 * @version 1.0
 * @author 
 */
public interface BannerImageService {
	
	public int add(BannerImage bannerImage);

	public int update(BannerImage bannerImage);
    
	public int delete(Integer id);

	public BannerImage getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<BannerImage> listPage(Map<String, Object> params);

}
