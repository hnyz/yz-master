/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 * store - 奖武堂表
 */
Ext.define('ESSM.store.user.MilitaryAcademyStore',{
	extend: 'Ext.data.Store',
	// autoLoad : true,
	model : 'ESSM.model.user.MilitaryAcademy',
	remoteSort : true,
	pageSize : 20,
	proxy : {
		type: 'ajax',
		api : {
			read:'rest/user/militaryAcademy/list.json',
			create:'rest/user/militaryAcademy/add.json',
			update:'rest/user/militaryAcademy/edit.json',
			destroy:'rest/user/militaryAcademy/delete.json',
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
