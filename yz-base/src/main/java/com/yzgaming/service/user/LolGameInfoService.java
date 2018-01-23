/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service.user;

import com.yzgaming.model.user.LolGameInfo;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.util.common.YZException;

import java.util.List;
import java.util.Map;


/**
 * @version 1.0
 * @author 
 */
public interface LolGameInfoService {
	
	public int add(LolGameInfo lolGameInfo);

	public int update(LolGameInfo lolGameInfo);
    
	public int delete(Integer id);

	public LolGameInfo getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<LolGameInfo> listPage(Map<String, Object> params);

	public LolGameInfo bindingLolGame(UserInfo userInfo, LolGameInfo gameInfo) throws YZException;

}
