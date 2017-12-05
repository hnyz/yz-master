/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 规则与赛事关系表
 * @version 1.0
 * @author
 */
public class RuleMatch implements Serializable {

	// 主键 
	private Integer id;
	// 规则ID
	private Integer ruleId;
	// 赛事ID
	private Integer macthId;
		
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
	
	public void setMacthId(Integer value) {
		this.macthId = value;
	}
	
	public Integer getMacthId() {
		return this.macthId;
	}
	
}
