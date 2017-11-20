/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * grid - 奖武堂表
 */
Ext.define("ESSM.view.user.MilitaryAcademyGrid", {
	extend: "Ext.grid.Panel",
	alias: "widget.militaryAcademyGrid",
	store: "user.MilitaryAcademyStore",
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
					header: 'id', 
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
					header: '名称', 
					dataIndex: 'academyName', 
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
					header: '标题', 
					dataIndex: 'academyTitle', 
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
					header: '背景图片 ', 
					dataIndex: 'academyImage', 
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
					header: '加入费用最低费用', 
					dataIndex: 'academyJoinCost', 
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
					header: '奖励金额', 
					dataIndex: 'academyRewardCost', 
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
					header: '自动退出下限', 
					dataIndex: 'academyOutCost', 
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
		store: 'user.MilitaryAcademyStore',
		displayInfo: true,
		displayMsg: '显示 {0} - {1} 条，共计 {2} 条',
		emptyMsg: '无数据'
	}
});