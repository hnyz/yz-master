/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.RuleMatch;

@Repository
public interface RuleMatchMapper {
    
    RuleMatch getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<RuleMatch> listPage(Map<String, Object> params);
    
    int insert(RuleMatch ruleMatch);
    
    int update(RuleMatch ruleMatch);
    
    int deleteById(Integer id);
}