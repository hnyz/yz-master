/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service.user;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.user.UserInfo;

/**
 * @version 1.0
 * @author 
 */
public interface UserInfoService {
	
	public int add(UserInfo userInfo);

	public int update(UserInfo userInfo);
    
	public int delete(Integer id);

	public UserInfo getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<UserInfo> listPage(Map<String, Object> params);

	public UserInfo loginByPass(String mobile);

}
