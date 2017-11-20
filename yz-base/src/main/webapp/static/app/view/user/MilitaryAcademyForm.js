/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * form - 奖武堂表
 */
Ext.define("ESSM.view.user.MilitaryAcademyForm",{
	extend:"Ext.form.Panel",
	alias:"widget.militaryAcademyForm",
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
				fieldLabel: '名称',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入名称',
				name:'academyName'
			},
			{
				xtype: 'textfield',
				fieldLabel: '标题',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入标题',
				name:'academyTitle'
			},
			{
				xtype: 'textfield',
				fieldLabel: '背景图片 ',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入背景图片 ',
				name:'academyImage'
			},
			{
				xtype: 'textfield',
				fieldLabel: '加入费用最低费用',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入加入费用最低费用',
				name:'academyJoinCost'
			},
			{
				xtype: 'textfield',
				fieldLabel: '奖励金额',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入奖励金额',
				name:'academyRewardCost'
			},
			{
				xtype: 'textfield',
				fieldLabel: '自动退出下限',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入自动退出下限',
				name:'academyOutCost'
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