/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.AcadeJoin;

@Repository
public interface AcadeJoinMapper {
    
    AcadeJoin getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<AcadeJoin> listPage(Map<String, Object> params);
    
    int insert(AcadeJoin acadeJoin);
    
    int update(AcadeJoin acadeJoin);
    
    int deleteById(Integer id);
}