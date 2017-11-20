/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * grid - 获奖通知表
 */
Ext.define("ESSM.view.user.PrizeNoticeGrid", {
	extend: "Ext.grid.Panel",
	alias: "widget.prizeNoticeGrid",
	store: "user.PrizeNoticeStore",
	viewConfig: {
		loadMask: true
	},
	initComponent : function(){
		this.selModel = Ext.create('Ext.selection.CheckboxModel', {mode: "SINGLE", allowDeselect: true});
		this.callParent();
	},
    tbar: [
		{
			xtype: 'authcbutton',
			action: 'create',
			iconCls: 'add',
			text: '新增'
		},
		{
			xtype : 'authcbutton',
			action : 'update',
			iconCls : 'edit',
			disabled : true,
			text :'修改'
		},
			{
			xtype : 'authcbutton',
			action :'delete',
			iconCls : 'delete',
			disabled : true,
			text : '删除'
		}
	],

	columns: [
				{
					header: '自增主键', 
					dataIndex: 'id', 
					width: 120,
					align:'left',
					// hidden: true,
					renderer : function(value, row, record) {
						if(value) {
							return value;
						}
						return "";
					}
				},
				{
					header: '用户ID', 
					dataIndex: 'userId', 
					width: 120,
					align:'left',
					// hidden: true,
					renderer : function(value, row, record) {
						if(value) {
							return value;
						}
						return "";
					}
				},
				{
					header: '用户名', 
					dataIndex: 'userName', 
					width: 120,
					align:'left',
					// hidden: true,
					renderer : function(value, row, record) {
						if(value) {
							return value;
						}
						return "";
					}
				},
				{
					header: '游戏等级(如：璀璨的钻石3)', 
					dataIndex: 'gameGrade', 
					width: 120,
					align:'left',
					// hidden: true,
					renderer : function(value, row, record) {
						if(value) {
							return value;
						}
						return "";
					}
				},
				{
					header: '游戏名', 
					dataIndex: 'gameName', 
					width: 120,
					align:'left',
					// hidden: true,
					renderer : function(value, row, record) {
						if(value) {
							return value;
						}
						return "";
					}
				},
				{
					header: '游戏大区', 
					dataIndex: 'gameArea', 
					width: 120,
					align:'left',
					// hidden: true,
					renderer : function(value, row, record) {
						if(value) {
							return value;
						}
						return "";
					}
				},
				{
					header: '奖励金', 
					dataIndex: 'bonusMoney', 
					width: 120,
					align:'left',
					// hidden: true,
					renderer : function(value, row, record) {
						if(value) {
							return value;
						}
						return "";
					}
				},
				{
					header: '获奖时间', 
					dataIndex: 'prizeTime', 
					width: 120,
					align:'left',
					// hidden: true,
					renderer : function(value, row, record) {
						if(value) {
							return value;
						}
						return "";
					}
				}	],
	bbar: {
		xtype: 'pagingtoolbar',
		store: 'user.PrizeNoticeStore',
		displayInfo: true,
		displayMsg: '显示 {0} - {1} 条，共计 {2} 条',
		emptyMsg: '无数据'
	}
});