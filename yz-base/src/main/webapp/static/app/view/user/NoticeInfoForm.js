/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * form - 平台公告表
 */
Ext.define("ESSM.view.user.NoticeInfoForm",{
	extend:"Ext.form.Panel",
	alias:"widget.noticeInfoForm",
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
				fieldLabel: '自增主键',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入自增主键',
				name:'id'
			},
			{
				xtype: 'textfield',
				fieldLabel: '公告名称',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入公告名称',
				name:'noticeName'
			},
			{
				xtype: 'textfield',
				fieldLabel: '公告标题',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入公告标题',
				name:'noticeTitle'
			},
			{
				xtype: 'textfield',
				fieldLabel: '公告主内容',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入公告主内容',
				name:'noticeText'
			},
			{
				xtype: 'textfield',
				fieldLabel: '公告类型 (0,通用，1PC客户端，2，APP,3，微信)',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入公告类型 (0,通用，1PC客户端，2，APP,3，微信)',
				name:'noticeType'
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