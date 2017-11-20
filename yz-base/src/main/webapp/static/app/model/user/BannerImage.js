/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
/**
 *model - 横幅图表
 */
Ext.define('ESSM.model.user.BannerImage',{
	extend: 'Ext.data.Model',
	fields: [
	// 主键
	'id',
	// 图片名称(带后缀名)
	'imageName',
	// 点击图片跳转链接
	'imageUrl',
	// 图片说明(banner下方文字)
	'imageTitle',
	// 属于那个端(0，共用，1,PC客户端，2，APP，3微信端)
	'type'	]
});

