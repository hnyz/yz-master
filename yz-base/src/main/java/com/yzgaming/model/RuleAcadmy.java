/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 规则与奖武堂关系表
 * @version 1.0
 * @author
 */
public class RuleAcadmy implements Serializable {

	// id
	private Integer id;
	// 规则ID
	private Integer ruleId;
	// 奖武堂ID
	private Integer acadeId;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setRuleId(Integer value) {
		this.ruleId = value;
	}
	
	public Integer getRuleId() {
		return this.ruleId;
	}
	
	public void setAcadeId(Integer value) {
		this.acadeId = value;
	}
	
	public Integer getAcadeId() {
		return this.acadeId;
	}
	
}
