/*
 * 文 件 名:  UserInfoServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.user.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.yzgaming.user.dao.redis.api.RedisBaseDAO;
import com.yzgaming.util.common.MD5Util;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.user.service.UserInfoService;
import com.yzgaming.user.model.UserInfo;
import com.yzgaming.user.dao.mysql.UserInfoMapper;

/**
 * <一句话功能简述>
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
	
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
	private RedisBaseDAO redisBaseDAO;
    @Transactional
	public int add(UserInfo userInfo) {
		if(null == userInfo){
			return 0;
		}
		userInfo.setUserPassword(MD5Util.MD5(userInfo.getUserPassword()));
		userInfo.setJoinTime(new Date());

        int rows = userInfoMapper.insert(userInfo);
        return rows;
	}

    
    @Transactional
    public int update(UserInfo userInfo) {
		if(null == userInfo){
			return 0;
		}
        int rows = userInfoMapper.update(userInfo);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = userInfoMapper.deleteById(id);
        return rows;
    }
    
    
    public UserInfo getById(Integer id) {
		if(null == id){
			return null;
		}
		UserInfo userInfo = userInfoMapper.getById(id);
		//
        return userInfo;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = userInfoMapper.countBy(params);
		return rows;
	}
	
	public List<UserInfo> listPage(Map<String, Object> params){
		List<UserInfo> lists = userInfoMapper.listPage(params);
		
		return lists;
	}

	@Override
	public UserInfo loginByPass(String mobile, String passWord) {
		passWord= MD5Util.MD5(passWord);
		UserInfo userInfo=userInfoMapper.getByPassWord(mobile,passWord);
		if(userInfo!=null){
			//生成32位TOKEN,并保存到REDIS
			String token=UUID.randomUUID().toString().replace("-", "");
			redisBaseDAO.saveObject(token,userInfo.getUserMobile());
		}
		return null;
	}
}
