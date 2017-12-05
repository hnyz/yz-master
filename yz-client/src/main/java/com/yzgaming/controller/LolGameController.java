/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.controller;

import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @version 1.0
 * @author 
 */
@Controller
@RequestMapping("/user/lolGame")
public class LolGameController  {
    
//    @Autowired
//    private LolGameService lolGameService;
//
//	@RequestMapping(value = "/list.json")
//	@ResponseBody
//	public JSONMessage list(HttpServletRequest request) {
//		// get params
//		Map<String, Object> params = parseParamMapObject(request);
//        processPageParams(params);
//		//
//		Integer count = lolGameService.countBy(params);
//		List<LolGame> lolGameList = lolGameService.listPage(params);
//		//
//		JSONMessage jsonMessage = JSONMessage.successMessage();
//		jsonMessage.setTotal(count);
//		jsonMessage.setData(lolGameList);
//
//		return jsonMessage;
//	}
//
//	@RequestMapping(value = "/add.json", method = RequestMethod.POST)
//	@ResponseBody
//	public JSONMessage doAdd(HttpServletRequest request) {
//		// get params
//		Map<String, Object> params = parseParamMapObject(request);
//		//
//		LolGame lolGame = new LolGame();
//		//
//		map2Bean(params, lolGame);
//		//
//
//		//
//		JSONMessage jsonMessage = JSONMessage.failureMessage();
//        try{
//			Integer rows = lolGameService.add(lolGame);
//            if(rows > 0){
//                jsonMessage = JSONMessage.successMessage();
//            }
//        } catch(Exception ex){
//            logger.error("操作失败",ex);
//        }
//		return jsonMessage;
//	}
//
//
//	@RequestMapping(value = "/edit.json", method = RequestMethod.POST)
//	@ResponseBody
//	public JSONMessage doEdit(HttpServletRequest request) {
//		// get params
//		Map<String, Object> params = parseParamMapObject(request);
//		//
//		LolGame lolGame = new LolGame();
//		//
//		map2Bean(params, lolGame);
//		//
//
//		//
//		JSONMessage jsonMessage = JSONMessage.failureMessage();
//        try{
//			Integer rows = lolGameService.update(lolGame);
//            if(rows > 0){
//                jsonMessage = JSONMessage.successMessage();
//            }
//        } catch(Exception ex){
//            logger.error("操作失败",ex);
//        }
//		return jsonMessage;
//	}
//
//
//	@RequestMapping(value = "/delete.json", method = RequestMethod.POST)
//	@ResponseBody
//	public JSONMessage delete(HttpServletRequest request) {
//		// get params
//		Map<String, Object> params = parseParamMapObject(request);
//		//
//		Integer id = 0;
//		Object _id = params.get("id");
//		if(null != _id && StringNumberUtil.isLong(_id.toString())){
//			id = StringNumberUtil.parseInt(_id.toString(), 0);
//		}
//		//
//		JSONMessage jsonMessage = JSONMessage.failureMessage();
//        try{
//			Integer rows = lolGameService.delete(id);
//            if(rows > 0){
//                jsonMessage = JSONMessage.successMessage();
//            }
//        } catch(Exception ex){
//            logger.error("操作失败",ex);
//        }
//		return jsonMessage;
//	}

}
