/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.controller;

import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.yzgaming.annotation.Authorization;
import com.yzgaming.annotation.CurrentUser;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.service.RecordInfoService;
import com.yzgaming.vo.ResponseVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * @version 1.0
 * @author 
 */
@Controller
@RequestMapping("/user/ruleInfo")
public class RuleInfoController {
    @Autowired
    private RecordInfoService recordInfoService;

    @PostMapping("/upload-record")
    @Authorization
    public ResponseVO uploadRecord(@CurrentUser UserInfo userInfo,@RequestParam String recordString){
        //战绩解密
        recordInfoService.uploadRecord(userInfo,recordString);
        return null;
    }

}
