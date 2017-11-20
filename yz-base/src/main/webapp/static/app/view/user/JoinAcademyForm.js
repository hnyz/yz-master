/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * form - 讲武堂入学表
 */
Ext.define("ESSM.view.user.JoinAcademyForm",{
	extend:"Ext.form.Panel",
	alias:"widget.joinAcademyForm",
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
				fieldLabel: '用户ID',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入用户ID',
				name:'userId'
			},
			{
				xtype: 'textfield',
				fieldLabel: '武堂ID',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入武堂ID',
				name:'academyId'
			},
			{
				xtype: 'textfield',
				fieldLabel: '加入时间',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入加入时间',
				name:'joinTime'
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