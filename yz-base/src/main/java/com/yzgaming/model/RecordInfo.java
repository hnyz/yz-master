/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * RecordInfo
 * @version 1.0
 * @author
 */
public class RecordInfo implements Serializable {

	// id
	@ApiModelProperty(hidden=true)
	private Integer id;
	// 赛事ID
	@ApiModelProperty(hidden=true)
	private Integer matchId;
	// 用户ID
	@ApiModelProperty(hidden=true)
	private Integer userId;
	// 死亡次数
	@ApiModelProperty(value="死亡次数")
	private Integer deathNum;
	// 助攻次数
	@ApiModelProperty(value="助攻次数")
	private Integer assistsNum;
	// 击杀次数
	@ApiModelProperty(value="击杀英雄数")
	private Integer killNum;
	// 结束时间
	@ApiModelProperty(value="死亡次数")
	private Date endTime;
	// 开始时间
	@ApiModelProperty(value="死亡次数")
	private Date startTime;
	@ApiModelProperty(value="比赛时长")
	private String timeLong;
	// 战绩显示JSON
	@ApiModelProperty(hidden=true)
	private String recordJson;
	// 游戏地图
	@ApiModelProperty(value="地图类型")
	private String gameMode;
	@ApiModelProperty(value="游戏模式")
	// 游戏模式(匹配，排位等)
	private String queueType;
	// 游戏类型
	@ApiModelProperty(value="游戏类型")
	private String gameType;
	// 战绩唯一标识
	@ApiModelProperty(value="战绩唯一标示")
	private String reportGameId;
	// 10个玩家的JSON数据
	@ApiModelProperty(hidden=true)
	private String playersJson;
	@ApiModelProperty(value="本场KDA")
	private Double recordKda;
		
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
	
	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setDeathNum(Integer value) {
		this.deathNum = value;
	}
	
	public Integer getDeathNum() {
		return this.deathNum;
	}
	
	public void setAssistsNum(Integer value) {
		this.assistsNum = value;
	}
	
	public Integer getAssistsNum() {
		return this.assistsNum;
	}
	
	public void setKillNum(Integer value) {
		this.killNum = value;
	}
	
	public Integer getKillNum() {
		return this.killNum;
	}
	
	public void setEndTime(Date value) {
		this.endTime = value;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	
	public void setStartTime(Date value) {
		this.startTime = value;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}
	
	public void setRecordJson(String value) {
		this.recordJson = value;
	}
	
	public String getRecordJson() {
		return this.recordJson;
	}
	
	public void setGameMode(String value) {
		this.gameMode = value;
	}
	
	public String getGameMode() {
		return this.gameMode;
	}
	
	public void setQueueType(String value) {
		this.queueType = value;
	}
	
	public String getQueueType() {
		return this.queueType;
	}
	
	public void setGameType(String value) {
		this.gameType = value;
	}
	
	public String getGameType() {
		return this.gameType;
	}
	
	public void setReportGameId(String value) {
		this.reportGameId = value;
	}
	
	public String getReportGameId() {
		return this.reportGameId;
	}
	
	public void setPlayersJson(String value) {
		this.playersJson = value;
	}
	
	public String getPlayersJson() {
		return this.playersJson;
	}

	public Double getRecordKda() {
		return recordKda;
	}

	public void setRecordKda(Double recordKda) {
		this.recordKda = recordKda;
	}

	public String getTimeLong() {
		return timeLong;
	}

	public void setTimeLong(String timeLong) {
		this.timeLong = timeLong;
	}
}
