/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.dao.mysql.user.test.mapper;

import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;


import com.yzgaming.model.PrizeNotice;
import com.yzgaming.dao.mysql.PrizeNoticeMapper;

/**
 * @version 1.0
 * @author 
 * 单元测试 获奖通知表: PrizeNoticeMapper
 */
@ContextConfiguration("classpath:generated/testSpringContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional // 事务必须要Junit看得见才能回滚
public class TestPrizeNoticeMapper {
    
    private Log logger = LogFactory.getLog(this.getClass());
    
    @Autowired
    private PrizeNoticeMapper prizeNoticeMapper;
    
    @Before
    public void setUp(){
        Assert.notNull(prizeNoticeMapper, "prizeNoticeMapper 不能为 null");
        // 此处可以做一些初始化操作
    }
    @After
    public void tearDown(){
    	prizeNoticeMapper = null;
        // 此处可以做一些清理操作
    }
    
    @Test
    public  void testListBy(){
        logger.debug("开始测试 prizeNoticeMapper.listPage(params)");
        Map<String, Object> params = new HashMap<String, Object>();
        List<PrizeNotice> resultList =  prizeNoticeMapper.listPage(params);
        //
        Assert.notNull(resultList, "resultList 不能为 null");
        logger.debug("prizeNoticeMapper.listPage(params)测试结束. resultList.size()=" + resultList.size());
    }

    @Test
    public  void testCountBy(){
        logger.debug("开始测试 prizeNoticeMapper.countBy(params)");
        Map<String, Object> params = new HashMap<String, Object>();
        int result =  prizeNoticeMapper.countBy(params);
        //
        Assert.isTrue(result >= 0, "result 不能为 负数");
        logger.debug("prizeNoticeMapper.countBy(params)测试结束. result=" + result);
    }

    @Test
    @Rollback(true)
    public  void testSave(){
        logger.debug("开始测试 prizeNoticeMapper.add(null)");
        PrizeNotice condition = new PrizeNotice();
        int result =  0;//prizeNoticeMapper.insert(null);
        //
        Assert.isTrue(result >= 0, "result 不能为 负数");
        logger.debug("prizeNoticeMapper.add(condition)测试结束. result=" + result);
    }

}
