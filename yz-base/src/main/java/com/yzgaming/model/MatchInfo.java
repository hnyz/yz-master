/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 赛事主表
 * @version 1.0
 * @author
 */
public class MatchInfo implements Serializable {

	// 自增ID
	private Integer id;
	// 赛事名称
	private String matchName;
	// 赛事标题
	private String matchTitle;
	// 报名费用
	private Integer signFee;
	// 总奖金
	private Integer bonusAmount;
	// 赛事开始时间
	private Date matchStartTime;
	// 赛事结束时间
	private Date matchEndTime;
	// 手动结束开关(1,开启，2，结束)
	private Integer endState;
	// 比赛规则说明
	private String matchRuleText;
	// 奖励规则说明
	private String matchRewardText;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setMatchName(String value) {
		this.matchName = value;
	}
	
	public String getMatchName() {
		return this.matchName;
	}
	
	public void setMatchTitle(String value) {
		this.matchTitle = value;
	}
	
	public String getMatchTitle() {
		return this.matchTitle;
	}
	
	public void setSignFee(Integer value) {
		this.signFee = value;
	}
	
	public Integer getSignFee() {
		return this.signFee;
	}
	
	public void setBonusAmount(Integer value) {
		this.bonusAmount = value;
	}
	
	public Integer getBonusAmount() {
		return this.bonusAmount;
	}
	
	public void setMatchStartTime(Date value) {
		this.matchStartTime = value;
	}
	
	public Date getMatchStartTime() {
		return this.matchStartTime;
	}
	
	public void setMatchEndTime(Date value) {
		this.matchEndTime = value;
	}
	
	public Date getMatchEndTime() {
		return this.matchEndTime;
	}
	
	public void setEndState(Integer value) {
		this.endState = value;
	}
	
	public Integer getEndState() {
		return this.endState;
	}
	
	public void setMatchRuleText(String value) {
		this.matchRuleText = value;
	}
	
	public String getMatchRuleText() {
		return this.matchRuleText;
	}
	
	public void setMatchRewardText(String value) {
		this.matchRewardText = value;
	}
	
	public String getMatchRewardText() {
		return this.matchRewardText;
	}
	
}
