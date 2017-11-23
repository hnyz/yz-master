/*
 * 文 件 名:  UserInfoServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl.user;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.yzgaming.dao.redis.api.RedisBaseDAO;
import com.yzgaming.util.common.MD5Util;
import com.yzgaming.util.common.YZException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.yzgaming.service.user.UserInfoService;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.dao.mysql.user.UserInfoMapper;

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
	public UserInfo loginBymobile(String mobile,String passWord) throws YZException {
		UserInfo userInfo=userInfoMapper.getBymobile(mobile);
		if (userInfo == null ||  //未注册
				!userInfo.getUserPassword().equals(passWord)){
             throw new YZException("用户名或密码错误","4001");
		}
		return  userInfoMapper.getBymobile(mobile);
	}

	@Override
	public UserInfo register(String mobile) {
		UserInfo userInfo=new UserInfo();
		userInfo.setJoinTime(new Date());
		userInfo.setUserComing(3);
		userInfo.setUserMobile(mobile);
		userInfo.setUserName(mobile);
		userInfoMapper.insert(userInfo);

		return userInfo;
	}
}
