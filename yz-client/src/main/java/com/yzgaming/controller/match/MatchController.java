package com.yzgaming.controller.match;

import com.yzgaming.service.MatchInfoService;
import com.yzgaming.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    private MatchInfoService matchInfoService;

    public ResponseVO getMatchList(Integer pageSize,Integer pageNum){
        Map<String, Object> params=new HashMap<String,Object>();
        params.put("",pageSize);
        params.put("",pageNum);
        matchInfoService.listPage(params);
        return null;
    }
}
