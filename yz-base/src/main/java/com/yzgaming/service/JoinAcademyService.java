/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.JoinAcademy;

/**
 * @version 1.0
 * @author 
 */
public interface JoinAcademyService {
	
	public int add(JoinAcademy joinAcademy);

	public int update(JoinAcademy joinAcademy);
    
	public int delete(Integer id);

	public JoinAcademy getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<JoinAcademy> listPage(Map<String, Object> params);

}
