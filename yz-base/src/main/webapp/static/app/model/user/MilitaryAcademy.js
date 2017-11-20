/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 *model - 奖武堂表
 */
Ext.define('ESSM.model.user.MilitaryAcademy',{
	extend: 'Ext.data.Model',
	fields: [
	// id
	'id',
	// 名称
	'academyName',
	// 标题
	'academyTitle',
	// 背景图片 
	'academyImage',
	// 加入费用最低费用
	'academyJoinCost',
	// 奖励金额
	'academyRewardCost',
	// 自动退出下限
	'academyOutCost'	]
});

