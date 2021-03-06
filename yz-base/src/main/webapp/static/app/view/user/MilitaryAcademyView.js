/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * view - 奖武堂表
 */
Ext.define("ESSM.view.user.MilitaryAcademyView",{
	extend: "Ext.panel.Panel",
	alias : "widget.militaryAcademyView",
    requires : [
        'ESSM.store.user.MilitaryAcademyStore',
        "ESSM.view.user.MilitaryAcademyGrid",
        "ESSM.view.user.MilitaryAcademyForm"
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
			xtype : "MilitaryAcademyGrid",
			anchor: "100% -60",
			border : false
		}
	]
});