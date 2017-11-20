/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * view - 获奖通知表
 */
Ext.define("ESSM.view.user.PrizeNoticeView",{
	extend: "Ext.panel.Panel",
	alias : "widget.prizeNoticeView",
    requires : [
        'ESSM.store.user.PrizeNoticeStore',
        "ESSM.view.user.PrizeNoticeGrid",
        "ESSM.view.user.PrizeNoticeForm"
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
			xtype : "PrizeNoticeGrid",
			anchor: "100% -60",
			border : false
		}
	]
});