/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * view - 用户表
 */
Ext.define("ESSM.view.user.UserInfoView",{
	extend: "Ext.panel.Panel",
	alias : "widget.userInfoView",
    requires : [
        'ESSM.store.user.UserInfoStore',
        "ESSM.view.user.UserInfoGrid",
        "ESSM.view.user.UserInfoForm"
    ],
	tbar : [
		{
			xtype : 'authcbutton',
			action : 'create',
			iconCls : 'add',
			disabled : false,
			text :'新增'
		},
		{
			xtype : 'authcbutton',
			action : 'update',
			iconCls : 'edit',
			disabled : true,
			text :'修改'
		}
		,{
			xtype : 'authcbutton',
			action :'delete',
			iconCls : 'delete',
			disabled : false,
			text : '删除'
		}
	],
	items : [
		{
			xtype : "UserInfoGrid",
			anchor: "100% -60",
			border : false
		}
	]
});