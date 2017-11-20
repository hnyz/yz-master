/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 *model - 赛事主表
 */
Ext.define('ESSM.model.user.MatchInfo',{
	extend: 'Ext.data.Model',
	fields: [
	// 自增ID
	'id',
	// 赛事名称
	'matchName',
	// 赛事标题
	'matchTitle',
	// 报名费用
	'signFee',
	// 总奖金
	'bonusAmount',
	// 赛事开始时间
	'matchStartTime',
	// 赛事结束时间
	'matchEndTime',
	// 手动结束开关(1,开启，2，结束)
	'endState',
	// 比赛规则说明
	'matchRuleText',
	// 奖励规则说明
	'matchRewardText'	]
});

