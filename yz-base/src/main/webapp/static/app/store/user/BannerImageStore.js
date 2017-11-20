/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * store - 横幅图表
 */
Ext.define('ESSM.store.user.BannerImageStore',{
	extend: 'Ext.data.Store',
	// autoLoad : true,
	model : 'ESSM.model.user.BannerImage',
	remoteSort : true,
	pageSize : 20,
	proxy : {
		type: 'ajax',
		api : {
			read:'rest/user/bannerImage/list.json',
			create:'rest/user/bannerImage/add.json',
			update:'rest/user/bannerImage/edit.json',
			destroy:'rest/user/bannerImage/delete.json',
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
