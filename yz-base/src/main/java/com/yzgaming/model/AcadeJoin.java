/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 奖武堂加入表
 * @version 1.0
 * @author
 */
public class AcadeJoin implements Serializable {

	// 主键
	private Integer id;
	// 讲武堂ID
	private Integer acadeId;
	// 奖武堂名称
	private String acadeName;
	// 用户ID
	private Integer userId;
	// 用户名称
	private String userName;
	// 加入时间
	private Date joinTime;
	// 剩余金额
	private Long surplusAmount;
	// 加入单号
	private String joinNo;
	// 加入 类型
	private Integer joinType;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setAcadeId(Integer value) {
		this.acadeId = value;
	}
	
	public Integer getAcadeId() {
		return this.acadeId;
	}
	
	public void setAcadeName(String value) {
		this.acadeName = value;
	}
	
	public String getAcadeName() {
		return this.acadeName;
	}
	
	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setJoinTime(Date value) {
		this.joinTime = value;
	}
	
	public Date getJoinTime() {
		return this.joinTime;
	}
	
	public void setSurplusAmount(Long value) {
		this.surplusAmount = value;
	}
	
	public Long getSurplusAmount() {
		return this.surplusAmount;
	}
	
	public void setJoinNo(String value) {
		this.joinNo = value;
	}
	
	public String getJoinNo() {
		return this.joinNo;
	}
	
	public void setJoinType(Integer value) {
		this.joinType = value;
	}
	
	public Integer getJoinType() {
		return this.joinType;
	}
	
}
