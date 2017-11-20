/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 横幅图表
 * @version 1.0
 * @author
 */
public class BannerImage implements Serializable {

	// 主键
	private Integer id;
	// 图片名称(带后缀名)
	private String imageName;
	// 点击图片跳转链接
	private String imageUrl;
	// 图片说明(banner下方文字)
	private String imageTitle;
	// 属于那个端(0，共用，1,PC客户端，2，APP，3微信端)
	private Integer type;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setImageName(String value) {
		this.imageName = value;
	}
	
	public String getImageName() {
		return this.imageName;
	}
	
	public void setImageUrl(String value) {
		this.imageUrl = value;
	}
	
	public String getImageUrl() {
		return this.imageUrl;
	}
	
	public void setImageTitle(String value) {
		this.imageTitle = value;
	}
	
	public String getImageTitle() {
		return this.imageTitle;
	}
	
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	
}
