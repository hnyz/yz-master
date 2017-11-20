/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.NoticeInfo;

/**
 * @version 1.0
 * @author 
 */
public interface NoticeInfoService {
	
	public int add(NoticeInfo noticeInfo);

	public int update(NoticeInfo noticeInfo);
    
	public int delete(Integer id);

	public NoticeInfo getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<NoticeInfo> listPage(Map<String, Object> params);

}
