/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.user.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.user.model.MatchInfo;

/**
 * @version 1.0
 * @author 
 */
public interface MatchInfoService {
	
	public int add(MatchInfo matchInfo);

	public int update(MatchInfo matchInfo);
    
	public int delete(Integer id);

	public MatchInfo getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<MatchInfo> listPage(Map<String, Object> params);

}
