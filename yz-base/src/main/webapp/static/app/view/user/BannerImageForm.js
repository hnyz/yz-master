/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * form - 横幅图表
 */
Ext.define("ESSM.view.user.BannerImageForm",{
	extend:"Ext.form.Panel",
	alias:"widget.bannerImageForm",
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
				fieldLabel: '主键',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入主键',
				name:'id'
			},
			{
				xtype: 'textfield',
				fieldLabel: '图片名称(带后缀名)',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入图片名称(带后缀名)',
				name:'imageName'
			},
			{
				xtype: 'textfield',
				fieldLabel: '点击图片跳转链接',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入点击图片跳转链接',
				name:'imageUrl'
			},
			{
				xtype: 'textfield',
				fieldLabel: '图片说明(banner下方文字)',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入图片说明(banner下方文字)',
				name:'imageTitle'
			},
			{
				xtype: 'textfield',
				fieldLabel: '属于那个端(0，共用，1,PC客户端，2，APP，3微信端)',
				// hidden:true,
				// allowBlank: false,
				tooltip: '请输入属于那个端(0，共用，1,PC客户端，2，APP，3微信端)',
				name:'type'
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