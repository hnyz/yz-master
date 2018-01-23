package com.yzgaming.controller.match;

import com.yzgaming.annotation.CurrentUser;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.service.MatchInfoService;
import com.yzgaming.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    private MatchInfoService matchInfoService;

    @GetMapping("/match-list")
    public ResponseVO getMatchList(Integer pageSize,Integer pageNum){
        Map<String, Object> params=new HashMap<String,Object>();
        params.put("_start",pageNum);
        params.put("_pageSize",pageSize);
        return ResponseVO.getSuccess(matchInfoService.listPage(params));
    }

    /**
     * 赛事详情
     * @param matchId
     * @return
     */
    @RequestMapping(value = "/match-details" ,method = RequestMethod.GET)
    public ResponseVO macthDetails(Integer matchId){
        System.out.println(matchId);
        return ResponseVO.getSuccess(matchInfoService.getById(matchId));
    }

    @GetMapping("/match-sign")
    public ResponseVO macthSign(@CurrentUser UserInfo userInfo,Integer macthId){
       // matchInfoService.signMatch(userInfo,macthId);

        return null;
    }
}
