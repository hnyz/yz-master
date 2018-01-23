/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yzgaming.model.SignMatch;

@Repository
public interface SignMatchMapper {
    
    SignMatch getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<SignMatch> listPage(Map<String, Object> params);
    
    int insert(SignMatch signMatch);
    
    int update(SignMatch signMatch);
    
    int deleteById(Integer id);

    SignMatch getByMatchAndUser(Integer userId,Integer matchId);

    List<SignMatch> getByUser(@Param("userId") Long userId);
}