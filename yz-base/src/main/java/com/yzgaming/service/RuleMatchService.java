/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.RuleMatch;

/**
 * @version 1.0
 * @author 
 */
public interface RuleMatchService {
	
	public int add(RuleMatch ruleMatch);

	public int update(RuleMatch ruleMatch);
    
	public int delete(Integer id);

	public RuleMatch getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<RuleMatch> listPage(Map<String, Object> params);

}
