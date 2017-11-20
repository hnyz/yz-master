/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * view - 横幅图表
 */
Ext.define("ESSM.view.user.BannerImageView",{
	extend: "Ext.panel.Panel",
	alias : "widget.bannerImageView",
    requires : [
        'ESSM.store.user.BannerImageStore',
        "ESSM.view.user.BannerImageGrid",
        "ESSM.view.user.BannerImageForm"
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
			xtype : "BannerImageGrid",
			anchor: "100% -60",
			border : false
		}
	]
});