package com.yzgaming.controller.match;

import com.yzgaming.service.MatchInfoService;
import com.yzgaming.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    private MatchInfoService matchInfoService;

    @GetMapping("/macth-list")
    public ResponseVO getMatchList(Integer pageSize,Integer pageNum){
        Map<String, Object> params=new HashMap<String,Object>();
        params.put("",pageSize);
        params.put("",pageNum);
        matchInfoService.listPage(params);
        return null;
    }

    /**
     * 赛事详情
     * @param macthId
     * @return
     */
    @RequestMapping("/macth-details")
    public ResponseVO macthDetails(Integer macthId){
        matchInfoService.getById(macthId);
        return null;
    }
}
