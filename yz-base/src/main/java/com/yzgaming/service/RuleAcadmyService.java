/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.RuleAcadmy;

/**
 * @version 1.0
 * @author 
 */
public interface RuleAcadmyService {
	
	public int add(RuleAcadmy ruleAcadmy);

	public int update(RuleAcadmy ruleAcadmy);
    
	public int delete(Integer id);

	public RuleAcadmy getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<RuleAcadmy> listPage(Map<String, Object> params);

}
