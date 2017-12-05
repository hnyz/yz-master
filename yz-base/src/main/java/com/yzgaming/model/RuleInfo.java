/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 规则表
 * @version 1.0
 * @author
 */
public class RuleInfo implements Serializable {

	// 主键
	private Integer id;
	// 规则名称
	private String ruleName;
	// 规则值
	private String ruleValue;
	//规则字段
	private String ruleField;
	// 规则类型（10比赛规则，20奖励规则  ） 
	private Integer ruleType;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setRuleName(String value) {
		this.ruleName = value;
	}
	
	public String getRuleName() {
		return this.ruleName;
	}
	
	public void setRuleValue(String value) {
		this.ruleValue = value;
	}
	
	public String getRuleValue() {
		return this.ruleValue;
	}

	public String getRuleField() {
		return ruleField;
	}

	public void setRuleField(String ruleField) {
		this.ruleField = ruleField;
	}

	public void setRuleType(Integer value) {
		this.ruleType = value;
	}
	
	public Integer getRuleType() {
		return this.ruleType;
	}
	
}
