/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yzgaming.model.user.UserInfo;

@Repository
public interface UserInfoMapper {
    
    UserInfo getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<UserInfo> listPage(Map<String, Object> params);
    
    int insert(UserInfo userInfo);
    
    int update(UserInfo userInfo);
    
    int deleteById(Integer id);

    UserInfo getBymobile(String mobile);

    void updateIntegral(Integer userId,Integer integral);

    void updateVolume(@Param("userId") Integer userId, @Param("volume") Integer volume);
}