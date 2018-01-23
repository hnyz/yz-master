/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 奖武堂表
 * @version 1.0
 * @author
 */
public class MilitaryAcademy implements Serializable {

	// id
	private Integer id;
	// 名称
	private String academyName;
	// 标题
	private String academyTitle;
	// 背景图片 
	private String academyImage;
	// 加入费用最低费用
	private Long academyJoinCost;
	// 奖励金额
	private Long academyRewardCost;
	// 自动退出下限
	private Long academyOutCost;
	//状态(0失效，1有效 )
	private Integer state;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setAcademyName(String value) {
		this.academyName = value;
	}
	
	public String getAcademyName() {
		return this.academyName;
	}
	
	public void setAcademyTitle(String value) {
		this.academyTitle = value;
	}
	
	public String getAcademyTitle() {
		return this.academyTitle;
	}
	
	public void setAcademyImage(String value) {
		this.academyImage = value;
	}
	
	public String getAcademyImage() {
		return this.academyImage;
	}
	
	public void setAcademyJoinCost(Long value) {
		this.academyJoinCost = value;
	}
	
	public Long getAcademyJoinCost() {
		return this.academyJoinCost;
	}
	
	public void setAcademyRewardCost(Long value) {
		this.academyRewardCost = value;
	}
	
	public Long getAcademyRewardCost() {
		return this.academyRewardCost;
	}
	
	public void setAcademyOutCost(Long value) {
		this.academyOutCost = value;
	}
	
	public Long getAcademyOutCost() {
		return this.academyOutCost;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}
