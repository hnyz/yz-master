/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.model.user;

import java.io.Serializable;
import java.util.Date;

/**
 * LolGameInfo
 * @version 1.0
 * @author
 */
public class LolGameInfo implements Serializable {

	// 屋里ID
	private Integer id;
	// 游戏名称
	private String gameName;
	// 所在大区Id
	private Integer gameArea;
	// 游戏账户唯一识
	private String gameUin;
	// 游戏等级
	private Integer gameLevel;
	// 游戏大区中文
	private String gameAreaName;
	// 用户TOKEN信息JSON串
	private String userAuthToken;
	// 上赛季段位JSON串
	private String lastSeasonRank;
	// 本赛季JSON串
	private String rankedTierInfo;
	// 玩家头像ID
	private Integer profileIconId;
	// 所属用户
	private Integer userId;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setGameName(String value) {
		this.gameName = value;
	}
	
	public String getGameName() {
		return this.gameName;
	}
	
	public void setGameArea(Integer value) {
		this.gameArea = value;
	}
	
	public Integer getGameArea() {
		return this.gameArea;
	}
	
	public void setGameUin(String value) {
		this.gameUin = value;
	}
	
	public String getGameUin() {
		return this.gameUin;
	}
	
	public void setGameLevel(Integer value) {
		this.gameLevel = value;
	}
	
	public Integer getGameLevel() {
		return this.gameLevel;
	}
	
	public void setGameAreaName(String value) {
		this.gameAreaName = value;
	}
	
	public String getGameAreaName() {
		return this.gameAreaName;
	}
	
	public void setUserAuthToken(String value) {
		this.userAuthToken = value;
	}
	
	public String getUserAuthToken() {
		return this.userAuthToken;
	}
	
	public void setLastSeasonRank(String value) {
		this.lastSeasonRank = value;
	}
	
	public String getLastSeasonRank() {
		return this.lastSeasonRank;
	}
	
	public void setRankedTierInfo(String value) {
		this.rankedTierInfo = value;
	}
	
	public String getRankedTierInfo() {
		return this.rankedTierInfo;
	}
	
	public void setProfileIconId(Integer value) {
		this.profileIconId = value;
	}
	
	public Integer getProfileIconId() {
		return this.profileIconId;
	}
	
	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
}
