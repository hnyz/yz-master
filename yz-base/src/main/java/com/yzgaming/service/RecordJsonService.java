/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.RecordJson;

/**
 * @version 1.0
 * @author 
 */
public interface RecordJsonService {
	
	public int add(RecordJson recordJson);

	public int update(RecordJson recordJson);
    
	public int delete(Integer id);

	public RecordJson getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<RecordJson> listPage(Map<String, Object> params);

}
