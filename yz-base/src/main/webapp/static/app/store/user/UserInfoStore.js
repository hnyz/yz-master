/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * store - 用户表
 */
Ext.define('ESSM.store.user.UserInfoStore',{
	extend: 'Ext.data.Store',
	// autoLoad : true,
	model : 'ESSM.model.user.UserInfo',
	remoteSort : true,
	pageSize : 20,
	proxy : {
		type: 'ajax',
		api : {
			read:'rest/user/userInfo/list.json',
			create:'rest/user/userInfo/add.json',
			update:'rest/user/userInfo/edit.json',
			destroy:'rest/user/userInfo/delete.json',
		},
        actionMethods: {
            read   : 'POST' // by default GET
        },
		reader: {
			type: 'json',
			root: 'data',
			totalProperty: 'total'
		},
		limitParam : 'pageSize',
		pageParam :'page',

	},
	sorters : [{
		property : 'id',
		direction : 'asc'
	}]
});
