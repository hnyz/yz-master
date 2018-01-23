/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.service;

import java.util.List;
import java.util.Map;


import com.yzgaming.model.RecordInfo;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.util.common.YZException;
import com.yzgaming.vo.match.MatchSignNumVO;

/**
 * @version 1.0
 * @author 
 */
public interface RecordInfoService {
	
	public int add(RecordInfo recordInfo);

	public int update(RecordInfo recordInfo);
    
	public int delete(Integer id);

	public RecordInfo getById(Integer id);

	public Integer countBy(Map<String, Object> params);

	public List<RecordInfo> listPage(Map<String, Object> params);

	public List<MatchSignNumVO> uploadRecord(UserInfo userInfo, String uploadString )throws YZException;

}
