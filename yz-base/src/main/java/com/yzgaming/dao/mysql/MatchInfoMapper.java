/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.MatchInfo;

@Repository
public interface MatchInfoMapper {
    
    MatchInfo getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<MatchInfo> listPage(Map<String, Object> params);
    
    int insert(MatchInfo matchInfo);
    
    int update(MatchInfo matchInfo);
    
    int deleteById(Integer id);
}