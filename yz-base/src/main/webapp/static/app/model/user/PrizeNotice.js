/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 *model - 获奖通知表
 */
Ext.define('ESSM.model.user.PrizeNotice',{
	extend: 'Ext.data.Model',
	fields: [
	// 自增主键
	'id',
	// 用户ID
	'userId',
	// 用户名
	'userName',
	// 游戏等级(如：璀璨的钻石3)
	'gameGrade',
	// 游戏名
	'gameName',
	// 游戏大区
	'gameArea',
	// 奖励金
	'bonusMoney',
	// 获奖时间
	'prizeTime'	]
});

