/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.model.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * @version 1.0
 * @author
 */
public class UserInfo implements Serializable {

	// id

	private Long id;
	// 用户名
	private String userName;
	// 登录密码
	private String userPassword;
	// 手机号
	//@Pattern(regexp="^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$", message="手机号格式不正确")
	private String userMobile;
	// 来自哪里(1,PC客户端，2APP,3微信端)
	private Integer userComing;
	// 加入时间
	private Date joinTime;
	// lastLoginTime
	private Date lastLoginTime;
	// lastLoginIp
	private String lastLoginIp;
	// 最后登录类型(1，PC客户端，2安卓APP,3IosAPP,4,微信端)
	private Integer lastLoginType;
		
	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserPassword(String value) {
		this.userPassword = value;
	}
	
	public String getUserPassword() {
		return this.userPassword;
	}
	
	public void setUserMobile(String value) {
		this.userMobile = value;
	}
	
	public String getUserMobile() {
		return this.userMobile;
	}
	
	public void setUserComing(Integer value) {
		this.userComing = value;
	}
	
	public Integer getUserComing() {
		return this.userComing;
	}
	
	public void setJoinTime(Date value) {
		this.joinTime = value;
	}
	
	public Date getJoinTime() {
		return this.joinTime;
	}
	
	public void setLastLoginTime(Date value) {
		this.lastLoginTime = value;
	}
	
	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}
	
	public void setLastLoginIp(String value) {
		this.lastLoginIp = value;
	}
	
	public String getLastLoginIp() {
		return this.lastLoginIp;
	}
	
	public void setLastLoginType(Integer value) {
		this.lastLoginType = value;
	}
	
	public Integer getLastLoginType() {
		return this.lastLoginType;
	}
	
}
