package com.yzgaming.vo.acade;

import java.util.Date;

public class AcadeJoinVO   {
    // 加入记录ID
    private Integer joinId;
    // 讲武堂ID
    private Integer acadeId;
    // 奖武堂名称
    private String acadeName;
    // 用户ID
    private Integer userId;
    // 加入时间
    private Date joinTime;
    // 剩余金额
    private Long surplusAmount;
    // 加入费用最低费用
    private Long academyJoinCost;
    // 奖励金额
    private Long academyRewardCost;
    // 自动退出下限
    private Long academyOutCost;

    public Integer getJoinId() {
        return joinId;
    }

    public void setJoinId(Integer joinId) {
        this.joinId = joinId;
    }

    public Integer getAcadeId() {
        return acadeId;
    }

    public void setAcadeId(Integer acadeId) {
        this.acadeId = acadeId;
    }

    public String getAcadeName() {
        return acadeName;
    }

    public void setAcadeName(String acadeName) {
        this.acadeName = acadeName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Long getSurplusAmount() {
        return surplusAmount;
    }

    public void setSurplusAmount(Long surplusAmount) {
        this.surplusAmount = surplusAmount;
    }

    public Long getAcademyJoinCost() {
        return academyJoinCost;
    }

    public void setAcademyJoinCost(Long academyJoinCost) {
        this.academyJoinCost = academyJoinCost;
    }

    public Long getAcademyRewardCost() {
        return academyRewardCost;
    }

    public void setAcademyRewardCost(Long academyRewardCost) {
        this.academyRewardCost = academyRewardCost;
    }

    public Long getAcademyOutCost() {
        return academyOutCost;
    }

    public void setAcademyOutCost(Long academyOutCost) {
        this.academyOutCost = academyOutCost;
    }
}
