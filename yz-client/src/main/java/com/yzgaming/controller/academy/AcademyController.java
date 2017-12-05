package com.yzgaming.controller.academy;

import com.yzgaming.dao.mysql.MilitaryAcademyMapper;
import com.yzgaming.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 奖武堂Controller
 */
@RestController
@RequestMapping("/academy")
public class AcademyController {
@Autowired
    MilitaryAcademyMapper militaryAcademyMapper;

    /**
     * 讲武堂分页列表
     * @param pageSize
     * @param pageNum
     * @return
     */
    @RequestMapping(value = "/academy-list",method = RequestMethod.GET)
    public ResponseVO getAcademyList(Integer pageSize,Integer pageNum ){
        Map<String, Object> params=new HashMap<String,Object>();
        params.put("_start",pageNum);
        params.put("_pageSize",pageSize);

        return ResponseVO.getSuccess(militaryAcademyMapper.listPage(params));
    }

    /**
     * 讲武堂详情
     * @param academyId
     * @return
     */
    @RequestMapping(value = "/academy-details",method = RequestMethod.GET)
    public ResponseVO academyDetails(Integer academyId){
        return ResponseVO.getSuccess( militaryAcademyMapper.getById(academyId));
    }

}
