/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 *model - 用户表
 */
Ext.define('ESSM.model.user.UserInfo',{
	extend: 'Ext.data.Model',
	fields: [
	// id
	'id',
	// 用户名
	'userName',
	// 登录密码
	'userPassword',
	// 手机号
	'userMobile',
	// 来自哪里(1,PC客户端，2APP,3微信端)
	'userComing',
	// 加入时间
	'joinTime',
	// lastLoginTime
	'lastLoginTime',
	// lastLoginIp
	'lastLoginIp',
	// 最后登录类型(1，PC客户端，2安卓APP,3IosAPP,4,微信端)
	'lastLoginType'	]
});

