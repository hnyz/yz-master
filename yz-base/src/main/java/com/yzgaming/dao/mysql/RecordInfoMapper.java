/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.RecordInfo;

@Repository
public interface RecordInfoMapper {
    
    RecordInfo getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<RecordInfo> listPage(Map<String, Object> params);
    
    int insert(RecordInfo recordInfo);
    
    int update(RecordInfo recordInfo);
    
    int deleteById(Integer id);


}