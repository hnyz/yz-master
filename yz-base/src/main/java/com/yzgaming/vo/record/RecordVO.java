package com.yzgaming.vo.record;



import com.yzgaming.model.RecordInfo;
import com.yzgaming.model.RecordJson;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value="战绩VO",description="z")
public class RecordVO implements Serializable {
    /**
     * 主要信息
     */
    @ApiModelProperty(value="主要信息")
    private RecordInfo recordInfo;
    /**
     * JSON数据
     */
    @ApiModelProperty(value="10个用户的战绩")
    private RecordJson recordJson;

    public RecordInfo getRecordInfo() {
        return recordInfo;
    }

    public void setRecordInfo(RecordInfo recordInfo) {
        this.recordInfo = recordInfo;
    }

    public RecordJson getRecordJson() {
        return recordJson;
    }

    public void setRecordJson(RecordJson recordJson) {
        this.recordJson = recordJson;
    }
}
