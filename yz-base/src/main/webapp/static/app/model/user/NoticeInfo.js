/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 *model - 平台公告表
 */
Ext.define('ESSM.model.user.NoticeInfo',{
	extend: 'Ext.data.Model',
	fields: [
	// 自增主键
	'id',
	// 公告名称
	'noticeName',
	// 公告标题
	'noticeTitle',
	// 公告主内容
	'noticeText',
	// 公告类型 (0,通用，1PC客户端，2，APP,3，微信)
	'noticeType'	]
});

