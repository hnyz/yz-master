/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.MilitaryAcademy;

@Repository
public interface MilitaryAcademyMapper {
    
    MilitaryAcademy getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<MilitaryAcademy> listPage(Map<String, Object> params);
    
    int insert(MilitaryAcademy militaryAcademy);
    
    int update(MilitaryAcademy militaryAcademy);
    
    int deleteById(Integer id);
}