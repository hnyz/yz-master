/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.NoticeInfo;

@Repository
public interface NoticeInfoMapper {
    
    NoticeInfo getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<NoticeInfo> listPage(Map<String, Object> params);
    
    int insert(NoticeInfo noticeInfo);
    
    int update(NoticeInfo noticeInfo);
    
    int deleteById(Integer id);
}