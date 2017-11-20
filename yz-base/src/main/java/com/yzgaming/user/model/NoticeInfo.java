/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 平台公告表
 * @version 1.0
 * @author
 */
public class NoticeInfo implements Serializable {

	// 自增主键
	private Integer id;
	// 公告名称
	private String noticeName;
	// 公告标题
	private String noticeTitle;
	// 公告主内容
	private String noticeText;
	// 公告类型 (0,通用，1PC客户端，2，APP,3，微信)
	private Integer noticeType;
		
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setNoticeName(String value) {
		this.noticeName = value;
	}
	
	public String getNoticeName() {
		return this.noticeName;
	}
	
	public void setNoticeTitle(String value) {
		this.noticeTitle = value;
	}
	
	public String getNoticeTitle() {
		return this.noticeTitle;
	}
	
	public void setNoticeText(String value) {
		this.noticeText = value;
	}
	
	public String getNoticeText() {
		return this.noticeText;
	}
	
	public void setNoticeType(Integer value) {
		this.noticeType = value;
	}
	
	public Integer getNoticeType() {
		return this.noticeType;
	}
	
}
