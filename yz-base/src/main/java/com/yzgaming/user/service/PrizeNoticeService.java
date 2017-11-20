/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.user.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.user.model.PrizeNotice;

/**
 * @version 1.0
 * @author 
 */
public interface PrizeNoticeService {
	
	public int add(PrizeNotice prizeNotice);

	public int update(PrizeNotice prizeNotice);
    
	public int delete(Integer id);

	public PrizeNotice getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<PrizeNotice> listPage(Map<String, Object> params);

}
