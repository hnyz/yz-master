/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.PayLog;

@Repository
public interface PayLogMapper {
    
    PayLog getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<PayLog> listPage(Map<String, Object> params);
    
    int insert(PayLog payLog);
    
    int update(PayLog payLog);
    
    int deleteById(Integer id);
}