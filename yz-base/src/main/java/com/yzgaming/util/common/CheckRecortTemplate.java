package com.yzgaming.util.common;

import com.yzgaming.model.RecordInfo;

public class CheckRecortTemplate {

    public RecordInfo checkRecord(RecordInfo recordInfo){
        //校验是否有5杀
        checkFiveKill(recordInfo);
        //校验比赛类型
        chenckMatchType(recordInfo);
        //校验段位
        chenckPlayerDan(recordInfo);
         return recordInfo;
    }

    private void chenckPlayerDan(RecordInfo recordInfo) {
    }

    //校验比赛类型
    private void chenckMatchType(RecordInfo recordInfo) {
        recordInfo.getGameType();
    }

    // 校验是否有5杀
    private void checkFiveKill(RecordInfo recordInfo) {
    }


}
