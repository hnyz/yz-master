package com.yzgaming.controller.notice;

import com.yzgaming.dao.mysql.NoticeInfoMapper;
import com.yzgaming.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    NoticeInfoMapper noticeInfoMapper;
    @RequestMapping(value = "/notice-list",method = RequestMethod.GET)
    public ResponseVO getNoticeList(Integer pageSize,Integer pageNum){
        Map<String, Object> params=new HashMap<String,Object>();
        params.put("_start",pageNum);
        params.put("_pageSize",pageSize);
        return ResponseVO.getSuccess(noticeInfoMapper.listPage(params));
    }

    @RequestMapping("/notice-details")
    public ResponseVO noticeDetails(Integer  noticeId){
        return ResponseVO.getSuccess(noticeInfoMapper.getById(noticeId));
    }
}
