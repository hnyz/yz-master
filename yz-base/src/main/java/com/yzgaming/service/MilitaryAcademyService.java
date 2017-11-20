/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.MilitaryAcademy;

/**
 * @version 1.0
 * @author 
 */
public interface MilitaryAcademyService {
	
	public int add(MilitaryAcademy militaryAcademy);

	public int update(MilitaryAcademy militaryAcademy);
    
	public int delete(Integer id);

	public MilitaryAcademy getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<MilitaryAcademy> listPage(Map<String, Object> params);

}
