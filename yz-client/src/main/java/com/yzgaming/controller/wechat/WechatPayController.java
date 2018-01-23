package com.yzgaming.controller.wechat;

import com.yzgaming.annotation.CurrentUser;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.vo.ResponseVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/wechat")
public class WechatPayController {

    /**
     *获取微信支付二维码
     * @return
     */
    @PostMapping("/pay-code")
    public ResponseVO  getPayCode(@CurrentUser UserInfo  userInfo,Integer  matchId){
     return null;
    }


}
