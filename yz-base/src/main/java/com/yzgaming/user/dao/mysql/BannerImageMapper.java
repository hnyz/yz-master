/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.user.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.user.model.BannerImage;

@Repository
public interface BannerImageMapper {
    
    BannerImage getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<BannerImage> listPage(Map<String, Object> params);
    
    int insert(BannerImage bannerImage);
    
    int update(BannerImage bannerImage);
    
    int deleteById(Integer id);
}