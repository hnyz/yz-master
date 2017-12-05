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
import com.yzgaming.service.SignMatchService;
import com.yzgaming.util.common.ClientExceptionEnum;
import com.yzgaming.util.common.YZException;
import com.yzgaming.vo.ResponseVO;
import com.yzgaming.vo.match.MatchInfoVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @version 1.0
 * @author 
 */
@RestController
@RequestMapping("/sign-match")
public class SignMatchController  {
    @Autowired
	SignMatchService signMatchService;

    @RequestMapping(value = "/sign",method = RequestMethod.POST)
	@Authorization
	public ResponseVO signMatch(@CurrentUser UserInfo userInfo, @RequestBody MatchInfoVO matchInfoVO){
    	try{
			signMatchService.signNewMatch(userInfo,matchInfoVO);
			return ResponseVO.getSuccess("");
		}catch (YZException e){
				return  ResponseVO.getFail(e.getErrorCode(),e.getErrorMsg(),"");
		}

	}

}
