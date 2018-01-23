package com.yzgaming.admin.controller;

import com.yzgaming.model.MatchInfo;
import com.yzgaming.service.MatchInfoService;
import com.yzgaming.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${admin}/match")
public class MatchController {
    @Autowired
    private MatchInfoService matchInfoService;

    @PostMapping("/add-match")
    public ResponseVO addMatch(@RequestBody MatchInfo matchInfo){
        matchInfoService.add(matchInfo);
        return null;
    }
}
