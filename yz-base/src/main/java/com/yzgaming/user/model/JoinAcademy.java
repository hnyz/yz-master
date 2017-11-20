/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 讲武堂入学表
 * @version 1.0
 * @author
 */
public class JoinAcademy implements Serializable {

	// 自增ID
	private Integer id;
	// 用户ID
	private Integer userId;
	// 武堂ID
	private Integer academyId;
	// 加入时间
	private Date joinTime;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setAcademyId(Integer value) {
		this.academyId = value;
	}
	
	public Integer getAcademyId() {
		return this.academyId;
	}
	
	public void setJoinTime(Date value) {
		this.joinTime = value;
	}
	
	public Date getJoinTime() {
		return this.joinTime;
	}
	
}
