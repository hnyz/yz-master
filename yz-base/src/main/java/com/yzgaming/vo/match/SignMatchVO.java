package com.yzgaming.vo.match;

import java.util.Date;

public class SignMatchVO {
    /**
     * 赛事ID
     */
    private  Integer matchId;
    /**
     * 赛事名称
     */
    private  String  matchName;
    /**
     * 赛事开始时间
     */
    private  Date matchStartTime;
    /**
     * 赛事结束时间
     */
    private  Date matchEndTime;
    /**
     * 赛事比赛次数上限
     */
    private  Integer playNum;
    /**
     * 赛事报名记录ID
     */
    private  Integer signId;
    /**
     * 赛事报名记录已产生战绩数
     */
    private  Integer countSign;

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

    public Date getMatchStartTime() {
        return matchStartTime;
    }

    public void setMatchStartTime(Date matchStartTime) {
        this.matchStartTime = matchStartTime;
    }

    public Date getMatchEndTime() {
        return matchEndTime;
    }

    public void setMatchEndTime(Date matchEndTime) {
        this.matchEndTime = matchEndTime;
    }

    public Integer getPlayNum() {
        return playNum;
    }

    public void setPlayNum(Integer playNum) {
        this.playNum = playNum;
    }

    public Integer getSignId() {
        return signId;
    }

    public void setSignId(Integer signId) {
        this.signId = signId;
    }

    public Integer getCountSign() {
        return countSign;
    }

    public void setCountSign(Integer countSign) {
        this.countSign = countSign;
    }
}
