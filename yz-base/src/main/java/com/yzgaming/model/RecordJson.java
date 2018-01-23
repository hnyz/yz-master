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
 * 战绩JSON表
 * @version 1.0
 * @author
 */
public class RecordJson implements Serializable {

	// id
	@ApiModelProperty(hidden=true)
	private Integer id;
	// 10个玩家JSON数据
	@ApiModelProperty(value="10个玩家的战绩")
	private String playersJson;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setPlayersJson(String value) {
		this.playersJson = value;
	}
	
	public String getPlayersJson() {
		return this.playersJson;
	}
	
}
