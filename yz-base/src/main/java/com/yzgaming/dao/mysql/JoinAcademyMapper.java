/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.JoinAcademy;

@Repository
public interface JoinAcademyMapper {
    
    JoinAcademy getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<JoinAcademy> listPage(Map<String, Object> params);
    
    int insert(JoinAcademy joinAcademy);
    
    int update(JoinAcademy joinAcademy);
    
    int deleteById(Integer id);
}