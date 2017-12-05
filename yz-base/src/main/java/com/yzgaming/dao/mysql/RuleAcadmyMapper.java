/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.RuleAcadmy;

@Repository
public interface RuleAcadmyMapper {
    
    RuleAcadmy getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<RuleAcadmy> listPage(Map<String, Object> params);
    
    int insert(RuleAcadmy ruleAcadmy);
    
    int update(RuleAcadmy ruleAcadmy);
    
    int deleteById(Integer id);
}