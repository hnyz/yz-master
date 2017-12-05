/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.SignMatch;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.util.common.YZException;
import com.yzgaming.vo.match.MatchInfoVO;

/**
 * @version 1.0
 * @author 
 */
public interface SignMatchService {
	
	public int add(SignMatch signMatch);

	public int update(SignMatch signMatch);
    
	public int delete(Integer id);

	public SignMatch getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<SignMatch> listPage(Map<String, Object> params);

	public int signNewMatch(UserInfo userInfo, MatchInfoVO matchInfoVO)throws YZException;



}
