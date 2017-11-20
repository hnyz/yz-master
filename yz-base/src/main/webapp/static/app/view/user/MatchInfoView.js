/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * view - 赛事主表
 */
Ext.define("ESSM.view.user.MatchInfoView",{
	extend: "Ext.panel.Panel",
	alias : "widget.matchInfoView",
    requires : [
        'ESSM.store.user.MatchInfoStore',
        "ESSM.view.user.MatchInfoGrid",
        "ESSM.view.user.MatchInfoForm"
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
			xtype : "MatchInfoGrid",
			anchor: "100% -60",
			border : false
		}
	]
});