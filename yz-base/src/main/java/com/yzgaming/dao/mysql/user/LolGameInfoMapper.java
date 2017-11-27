/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql.user;

import java.util.List;
import java.util.Map;

import com.yzgaming.model.user.LolGameInfo;
import org.springframework.stereotype.Repository;



@Repository
public interface LolGameInfoMapper {
    
    LolGameInfo getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<LolGameInfo> listPage(Map<String, Object> params);
    
    int insert(LolGameInfo lolGameInfo);
    
    int update(LolGameInfo lolGameInfo);
    
    int deleteById(Integer id);

    LolGameInfo getByUserId(Integer userId);
}