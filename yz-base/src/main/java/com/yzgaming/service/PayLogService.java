/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.PayLog;

/**
 * @version 1.0
 * @author 
 */
public interface PayLogService {
	
	public int add(PayLog payLog);

	public int update(PayLog payLog);
    
	public int delete(Integer id);

	public PayLog getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<PayLog> listPage(Map<String, Object> params);

}
