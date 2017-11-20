/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yzgaming.controller.user;


import com.yzgaming.controller.BaseController;
import com.yzgaming.mvc.result.JSONMessage;
import com.yzgaming.dao.redis.api.RedisBaseDAO;
import com.yzgaming.model.user.UserInfo;


import com.yzgaming.service.user.UserInfoService;

import com.yzgaming.util.common.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author 
 */
@Controller
@RequestMapping("/user/userInfo")
public class UserInfoController  extends BaseController {
    
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
	private  RedisBaseDAO  redisBaseDAO;
	@RequestMapping(value = "/list.json")
	@ResponseBody
	public JSONMessage list(HttpServletRequest request) {
//		// get params
//		Map<String, Object> params = parseParamMapObject(request);
//        processPageParams(params);
//		//
		UserInfo u = userInfoService.getById(1);
		List<UserInfo> userInfoList = new ArrayList<UserInfo>();
		userInfoList.add(u);
//		//
		JSONMessage jsonMessage = JSONMessage.successMessage();
		jsonMessage.setTotal(1);
		jsonMessage.setData(userInfoList);

		return jsonMessage;
	}

	/**
	 * 用户注册API
	 * @param userInfo
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public JSONMessage doAdd(UserInfo userInfo) {

		JSONMessage jsonMessage = JSONMessage.failureMessage();
		try{
			Integer rows = userInfoService.add(userInfo);
			if(rows > 0){
				jsonMessage = JSONMessage.successMessage();
			}
		} catch(Exception ex){
			logger.error("操作失败",ex);
		}
		return jsonMessage;
	}

	/**
	 * 获取短信验证码
	 * @param imgCode
	 * @param mobile
	 * @return
	 */
	@RequestMapping("/sendSms")
	@ResponseBody
	public JSONMessage getSmsCode(String imgCode,String mobile){
          if(imgCode.equals("")){
          	//随机生成验证码
			String smsCode=  RandomUtil.getRandNum();
			//保存到Redis中
			redisBaseDAO.saveObject(mobile,smsCode,6000);
			//发送短信

		  }else{
          	return  JSONMessage.failureMessage();
		  }

		  return   JSONMessage.successMessage();
	}
	@RequestMapping("/loginByPass")
	@ResponseBody
	public JSONMessage loginByPassWord(String mobile,String passWord){
		//userInfoService.add();
       return null;
	}
//
//
//	@RequestMapping(value = "/edit.json", method = RequestMethod.POST)
//	@ResponseBody
//	public JSONMessage doEdit(HttpServletRequest request) {
//		// get params
//		Map<String, Object> params = parseParamMapObject(request);
//		//
//		UserInfo userInfo = new UserInfo();
//		//
//		map2Bean(params, userInfo);
//		//
//
//		//
//		JSONMessage jsonMessage = JSONMessage.failureMessage();
//        try{
//			Integer rows = userInfoService.update(userInfo);
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
//			Integer rows = userInfoService.delete(id);
//            if(rows > 0){
//                jsonMessage = JSONMessage.successMessage();
//            }
//        } catch(Exception ex){
//            logger.error("操作失败",ex);
//        }
//		return jsonMessage;
//	}

}
