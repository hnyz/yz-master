/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * store - 平台公告表
 */
Ext.define('ESSM.store.user.NoticeInfoStore',{
	extend: 'Ext.data.Store',
	// autoLoad : true,
	model : 'ESSM.model.user.NoticeInfo',
	remoteSort : true,
	pageSize : 20,
	proxy : {
		type: 'ajax',
		api : {
			read:'rest/user/noticeInfo/list.json',
			create:'rest/user/noticeInfo/add.json',
			update:'rest/user/noticeInfo/edit.json',
			destroy:'rest/user/noticeInfo/delete.json',
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
