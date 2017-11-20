/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yzgaming.model.PrizeNotice;

@Repository
public interface PrizeNoticeMapper {
    
    PrizeNotice getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<PrizeNotice> listPage(Map<String, Object> params);
    
    int insert(PrizeNotice prizeNotice);
    
    int update(PrizeNotice prizeNotice);
    
    int deleteById(Integer id);
}