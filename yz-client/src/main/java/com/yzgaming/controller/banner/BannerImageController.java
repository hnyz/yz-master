package com.yzgaming.controller.banner;

import com.yzgaming.dao.mysql.banner.BannerImageMapper;

import com.yzgaming.service.BannerImageService;
import com.yzgaming.util.common.NumberConstant;
import com.yzgaming.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banner")
public class BannerImageController {
    @Autowired
    BannerImageService bannerImageService;
    @Autowired
    BannerImageMapper bannerImageMapper;

    /**
     * 客户端首页轮播图
     * @return
     */
    @GetMapping("/banner-list")
    public ResponseVO  bannerList(){
        return ResponseVO.getSuccess(bannerImageService.listByType(NumberConstant.ONE));
    }


}
