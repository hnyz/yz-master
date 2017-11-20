/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * form - 用户表
 */
Ext.define("ESSM.view.user.UserInfoForm",{
	extend:"Ext.form.Panel",
	alias:"widget.userInfoForm",
	width:600,
	bodyPadding: '10',
    autoScroll: true,
	border : 0,
	fieldDefaults: {
        msgTarget: 'side',
        labelWidth: 90,
        anchor : '80%'
    },
    initComponent : function(){
		this.items =  [
			{
				xtype: 'textfield',
				fieldLabel: 'id',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入id',
				name:'id'
			},
			{
				xtype: 'textfield',
				fieldLabel: '用户名',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入用户名',
				name:'userName'
			},
			{
				xtype: 'textfield',
				fieldLabel: '登录密码',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入登录密码',
				name:'userPassword'
			},
			{
				xtype: 'textfield',
				fieldLabel: '手机号',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入手机号',
				name:'userMobile'
			},
			{
				xtype: 'textfield',
				fieldLabel: '来自哪里(1,PC客户端，2APP,3微信端)',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入来自哪里(1,PC客户端，2APP,3微信端)',
				name:'userComing'
			},
			{
				xtype: 'textfield',
				fieldLabel: '加入时间',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入加入时间',
				name:'joinTime'
			},
			{
				xtype: 'textfield',
				fieldLabel: 'lastLoginTime',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入lastLoginTime',
				name:'lastLoginTime'
			},
			{
				xtype: 'textfield',
				fieldLabel: 'lastLoginIp',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入lastLoginIp',
				name:'lastLoginIp'
			},
			{
				xtype: 'textfield',
				fieldLabel: '最后登录类型(1，PC客户端，2安卓APP,3IosAPP,4,微信端)',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入最后登录类型(1，PC客户端，2安卓APP,3IosAPP,4,微信端)',
				name:'lastLoginType'
			}		],
		this.callParent();
	},
    bbar : [
        {
            xtype: 'button',
            width: 60,
            margin: '0 0 0 30',
            name: 'save',
            allowBlank: false,
            action:'save',
            iconCls : 'edit',
            text: '保存',
            handler : function(btn, e){
                var editForm = this.up("form") || {};
                var saveFn = editForm.saveFn;
                var saveFnContext = editForm.saveFnContext || editForm;
                saveFn && saveFn.call(saveFnContext, editForm);
            }
        },
        {
            xtype: 'button',
            width: 60,
            margin: '0 0 0 30',
            name: 'cancel',
            allowBlank: false,
            action:'query',
            iconCls : 'cancel',
            text: '取消',
            listeners : {
                'click' : function(){
                    this.up("window").close();
                }
            }
        }
    ]
});