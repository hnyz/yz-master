/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 *model - 讲武堂入学表
 */
Ext.define('ESSM.model.user.JoinAcademy',{
	extend: 'Ext.data.Model',
	fields: [
	// 自增ID
	'id',
	// 用户ID
	'userId',
	// 武堂ID
	'academyId',
	// 加入时间
	'joinTime'	]
});

