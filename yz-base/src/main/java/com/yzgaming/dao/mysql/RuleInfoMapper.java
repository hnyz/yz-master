/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.RuleInfo;

@Repository
public interface RuleInfoMapper {
    
    RuleInfo getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<RuleInfo> listPage(Map<String, Object> params);
    
    int insert(RuleInfo ruleInfo);
    
    int update(RuleInfo ruleInfo);
    
    int deleteById(Integer id);
}