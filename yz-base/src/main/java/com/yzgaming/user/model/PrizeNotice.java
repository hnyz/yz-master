/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 获奖通知表
 * @version 1.0
 * @author
 */
public class PrizeNotice implements Serializable {

	// 自增主键
	private Integer id;
	// 用户ID
	private Integer userId;
	// 用户名
	private String userName;
	// 游戏等级(如：璀璨的钻石3)
	private String gameGrade;
	// 游戏名
	private String gameName;
	// 游戏大区
	private String gameArea;
	// 奖励金
	private Long bonusMoney;
	// 获奖时间
	private Date prizeTime;
		
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
	
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setGameGrade(String value) {
		this.gameGrade = value;
	}
	
	public String getGameGrade() {
		return this.gameGrade;
	}
	
	public void setGameName(String value) {
		this.gameName = value;
	}
	
	public String getGameName() {
		return this.gameName;
	}
	
	public void setGameArea(String value) {
		this.gameArea = value;
	}
	
	public String getGameArea() {
		return this.gameArea;
	}
	
	public void setBonusMoney(Long value) {
		this.bonusMoney = value;
	}
	
	public Long getBonusMoney() {
		return this.bonusMoney;
	}
	
	public void setPrizeTime(Date value) {
		this.prizeTime = value;
	}
	
	public Date getPrizeTime() {
		return this.prizeTime;
	}
	
}
