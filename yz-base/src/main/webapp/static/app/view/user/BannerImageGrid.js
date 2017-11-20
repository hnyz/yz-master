/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * grid - 横幅图表
 */
Ext.define("ESSM.view.user.BannerImageGrid", {
	extend: "Ext.grid.Panel",
	alias: "widget.bannerImageGrid",
	store: "user.BannerImageStore",
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
					header: '主键', 
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
					header: '图片名称(带后缀名)', 
					dataIndex: 'imageName', 
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
					header: '点击图片跳转链接', 
					dataIndex: 'imageUrl', 
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
					header: '图片说明(banner下方文字)', 
					dataIndex: 'imageTitle', 
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
					header: '属于那个端(0，共用，1,PC客户端，2，APP，3微信端)', 
					dataIndex: 'type', 
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
		store: 'user.BannerImageStore',
		displayInfo: true,
		displayMsg: '显示 {0} - {1} 条，共计 {2} 条',
		emptyMsg: '无数据'
	}
});