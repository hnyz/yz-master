/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * store - 赛事主表
 */
Ext.define('ESSM.store.user.MatchInfoStore',{
	extend: 'Ext.data.Store',
	// autoLoad : true,
	model : 'ESSM.model.user.MatchInfo',
	remoteSort : true,
	pageSize : 20,
	proxy : {
		type: 'ajax',
		api : {
			read:'rest/user/matchInfo/list.json',
			create:'rest/user/matchInfo/add.json',
			update:'rest/user/matchInfo/edit.json',
			destroy:'rest/user/matchInfo/delete.json',
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
