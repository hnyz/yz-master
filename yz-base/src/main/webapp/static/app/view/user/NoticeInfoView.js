/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * view - 平台公告表
 */
Ext.define("ESSM.view.user.NoticeInfoView",{
	extend: "Ext.panel.Panel",
	alias : "widget.noticeInfoView",
    requires : [
        'ESSM.store.user.NoticeInfoStore',
        "ESSM.view.user.NoticeInfoGrid",
        "ESSM.view.user.NoticeInfoForm"
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
			xtype : "NoticeInfoGrid",
			anchor: "100% -60",
			border : false
		}
	]
});