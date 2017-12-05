/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.model;

import java.io.Serializable;
import java.util.Date;

/**
 * SignMatch
 * @version 1.0
 * @author
 */
public class SignMatch implements Serializable {

	// 主键
	private Integer id;
	// 赛事ID
	private Integer matchId;
	// 赛事名称
	private String matchName;
	// 用户ID
	private Integer userId;
	// 用户名
	private String userName;
	// 报名时间
	private Date signTime;
	// 报名状态
	private Integer signState;
	// 报名单号
	private String orderNo;
	// 微信订单号
	private String wxOrderNo;
	// 支付宝单号
	private String aliPayNo;
	// 支付状态
	private Integer payState;
	// 支付类型（10支付宝，20微信，30易卷）
	private Integer signType;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setMatchId(Integer value) {
		this.matchId = value;
	}
	
	public Integer getMatchId() {
		return this.matchId;
	}
	
	public void setMatchName(String value) {
		this.matchName = value;
	}
	
	public String getMatchName() {
		return this.matchName;
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
	
	public void setSignTime(Date value) {
		this.signTime = value;
	}
	
	public Date getSignTime() {
		return this.signTime;
	}
	
	public void setSignState(Integer value) {
		this.signState = value;
	}
	
	public Integer getSignState() {
		return this.signState;
	}
	
	public void setOrderNo(String value) {
		this.orderNo = value;
	}
	
	public String getOrderNo() {
		return this.orderNo;
	}
	
	public void setWxOrderNo(String value) {
		this.wxOrderNo = value;
	}
	
	public String getWxOrderNo() {
		return this.wxOrderNo;
	}
	
	public void setAliPayNo(String value) {
		this.aliPayNo = value;
	}
	
	public String getAliPayNo() {
		return this.aliPayNo;
	}
	
	public void setPayState(Integer value) {
		this.payState = value;
	}
	
	public Integer getPayState() {
		return this.payState;
	}
	
	public void setSignType(Integer value) {
		this.signType = value;
	}
	
	public Integer getSignType() {
		return this.signType;
	}
	
}
