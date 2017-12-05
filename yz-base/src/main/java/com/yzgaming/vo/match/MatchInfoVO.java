package com.yzgaming.vo.match;

import java.io.Serializable;
import java.util.Date;

public class MatchInfoVO implements Serializable{

    // 自增ID
    private Integer id;
    // 赛事名称
    private String matchName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }
}
