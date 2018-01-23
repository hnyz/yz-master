package com.yzgaming.vo.match;

/**
 * 记录赛事还需要多少战绩
 */
public class MatchSignNumVO {
    private Integer matchId;
    private String matchName;
    private Integer recordCount;

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public Integer getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }
}
