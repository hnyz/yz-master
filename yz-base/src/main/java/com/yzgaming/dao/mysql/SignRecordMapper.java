package com.yzgaming.dao.mysql;

import com.yzgaming.model.SignRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SignRecordMapper {
    int countBy(Map<String, Object> params);
    int batchSave(List<SignRecord> list);
}
