/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.RuleInfo;

/**
 * @version 1.0
 * @author 
 */
public interface RuleInfoService {
	
	public int add(RuleInfo ruleInfo);

	public int update(RuleInfo ruleInfo);
    
	public int delete(Integer id);

	public RuleInfo getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<RuleInfo> listPage(Map<String, Object> params);

}
