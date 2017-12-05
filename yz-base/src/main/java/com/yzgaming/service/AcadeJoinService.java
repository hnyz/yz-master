/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import com.yzgaming.model.AcadeJoin;

import java.util.List;
import java.util.Map;




/**
 * @version 1.0
 * @author 
 */
public interface AcadeJoinService {
	
	public int add(AcadeJoin acadeJoin);

	public int update(AcadeJoin acadeJoin);
    
	public int delete(Integer id);

	public AcadeJoin getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<AcadeJoin> listPage(Map<String, Object> params);

}
