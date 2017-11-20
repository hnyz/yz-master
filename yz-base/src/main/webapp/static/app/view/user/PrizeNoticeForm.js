/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * form - 获奖通知表
 */
Ext.define("ESSM.view.user.PrizeNoticeForm",{
	extend:"Ext.form.Panel",
	alias:"widget.prizeNoticeForm",
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
				fieldLabel: '用户ID',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入用户ID',
				name:'userId'
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
				fieldLabel: '游戏等级(如：璀璨的钻石3)',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入游戏等级(如：璀璨的钻石3)',
				name:'gameGrade'
			},
			{
				xtype: 'textfield',
				fieldLabel: '游戏名',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入游戏名',
				name:'gameName'
			},
			{
				xtype: 'textfield',
				fieldLabel: '游戏大区',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入游戏大区',
				name:'gameArea'
			},
			{
				xtype: 'textfield',
				fieldLabel: '奖励金',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入奖励金',
				name:'bonusMoney'
			},
			{
				xtype: 'textfield',
				fieldLabel: '获奖时间',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入获奖时间',
				name:'prizeTime'
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