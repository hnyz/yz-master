/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 支付日志表
 * @version 1.0
 * @author
 */
public class PayLog implements Serializable {

	// id
	private Integer id;
	// 订单号
	private String orderNo;
	// 支付类型
	private Integer payType;
	// 付款时间
	private Date payTime;
	// 付款描述
	private String payRemak;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setOrderNo(String value) {
		this.orderNo = value;
	}
	
	public String getOrderNo() {
		return this.orderNo;
	}
	
	public void setPayType(Integer value) {
		this.payType = value;
	}
	
	public Integer getPayType() {
		return this.payType;
	}
	
	public void setPayTime(Date value) {
		this.payTime = value;
	}
	
	public Date getPayTime() {
		return this.payTime;
	}
	
	public void setPayRemak(String value) {
		this.payRemak = value;
	}
	
	public String getPayRemak() {
		return this.payRemak;
	}
	
}
