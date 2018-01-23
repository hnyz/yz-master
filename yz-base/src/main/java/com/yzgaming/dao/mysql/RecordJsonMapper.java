/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.RecordJson;

@Repository
public interface RecordJsonMapper {
    
    RecordJson getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<RecordJson> listPage(Map<String, Object> params);
    
    int insert(RecordJson recordJson);
    
    int update(RecordJson recordJson);
    
    int deleteById(Integer id);
}