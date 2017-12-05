/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.LolGame;

@Repository
public interface LolGameMapper {
    
    LolGame getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<LolGame> listPage(Map<String, Object> params);
    
    int insert(LolGame lolGame);
    
    int update(LolGame lolGame);
    
    int deleteById(Integer id);
}