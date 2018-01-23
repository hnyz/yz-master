/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.MatchInfo;
import com.yzgaming.model.user.UserInfo;

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

    public void signMatch(UserInfo userInfo,Integer matchId);
}
