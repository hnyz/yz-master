/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * form - 赛事主表
 */
Ext.define("ESSM.view.user.MatchInfoForm",{
	extend:"Ext.form.Panel",
	alias:"widget.matchInfoForm",
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
				fieldLabel: '自增ID',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入自增ID',
				name:'id'
			},
			{
				xtype: 'textfield',
				fieldLabel: '赛事名称',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入赛事名称',
				name:'matchName'
			},
			{
				xtype: 'textfield',
				fieldLabel: '赛事标题',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入赛事标题',
				name:'matchTitle'
			},
			{
				xtype: 'textfield',
				fieldLabel: '报名费用',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入报名费用',
				name:'signFee'
			},
			{
				xtype: 'textfield',
				fieldLabel: '总奖金',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入总奖金',
				name:'bonusAmount'
			},
			{
				xtype: 'textfield',
				fieldLabel: '赛事开始时间',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入赛事开始时间',
				name:'matchStartTime'
			},
			{
				xtype: 'textfield',
				fieldLabel: '赛事结束时间',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入赛事结束时间',
				name:'matchEndTime'
			},
			{
				xtype: 'textfield',
				fieldLabel: '手动结束开关(1,开启，2，结束)',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入手动结束开关(1,开启，2，结束)',
				name:'endState'
			},
			{
				xtype: 'textfield',
				fieldLabel: '比赛规则说明',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入比赛规则说明',
				name:'matchRuleText'
			},
			{
				xtype: 'textfield',
				fieldLabel: '奖励规则说明',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入奖励规则说明',
				name:'matchRewardText'
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