package com.yzgaming.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VerificationRecordVO {

    //所需总数
    private int countAmount;
    //赛事的战绩
    private List<Map<String,Object>> MatchMap=new ArrayList<Map<String, Object>>();

    //
    public int getCountAmount() {
        return countAmount;
    }

    public void setCountAmount(int countAmount) {
        this.countAmount = countAmount;
    }

    public List<Map<String, Object>> getMatchMap() {
        return MatchMap;
    }

    public void setMatchMap(List<Map<String, Object>> matchMap) {
        MatchMap = matchMap;
    }
}
