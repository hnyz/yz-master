/*
 * 文 件 名:  LolGameInfoServiceImpl.java
 * 创 建 人:  
 * 创建时间:  
 */
package com.yzgaming.service.impl.user;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.yzgaming.dao.mysql.user.LolGameInfoMapper;
import com.yzgaming.model.user.LolGameInfo;
import com.yzgaming.model.user.UserInfo;
import com.yzgaming.service.user.LolGameInfoService;
import com.yzgaming.util.common.ClientExceptionEnum;
import com.yzgaming.util.common.YZException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * <一句话功能简述>
 */
@Service
public class LolGameInfoServiceImpl implements LolGameInfoService {
	
    @Autowired
    private LolGameInfoMapper lolGameInfoMapper;
    
    @Transactional
	public int add(LolGameInfo lolGameInfo) {
		if(null == lolGameInfo){
			return 0;
		}
        int rows = lolGameInfoMapper.insert(lolGameInfo);
        return rows;
	}

    
    @Transactional
    public int update(LolGameInfo lolGameInfo) {
		if(null == lolGameInfo){
			return 0;
		}
        int rows = lolGameInfoMapper.update(lolGameInfo);
        return rows;
    }
    
    
    @Transactional
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = lolGameInfoMapper.deleteById(id);
        return rows;
    }
    
    
    public LolGameInfo getById(Integer id) {
		if(null == id){
			return null;
		}
		LolGameInfo lolGameInfo = lolGameInfoMapper.getById(id);
		//
        return lolGameInfo;
    }
	
	public Integer countBy(Map<String, Object> params){
		Integer rows = lolGameInfoMapper.countBy(params);
		return rows;
	}
	
	public List<LolGameInfo> listPage(Map<String, Object> params){
		List<LolGameInfo> lists = lolGameInfoMapper.listPage(params);
		
		return lists;
	}

	@Override
	@Transactional
	public LolGameInfo bindingLolGame(UserInfo userInfo, LolGameInfo gameInfo) throws YZException {
		//检查是否绑定过
		gameInfo=lolGameInfoMapper.getByUserId(Integer.parseInt(userInfo.getId().toString()));
		if(gameInfo!=null){
			throw new YZException(ClientExceptionEnum.REPEAT_BINDING.getCode(),ClientExceptionEnum.REPEAT_BINDING.getMessage());
		}
		gameInfo.setUserId(Integer.parseInt(userInfo.getId().toString()));
		lolGameInfoMapper.insert(gameInfo);
		return gameInfo;
	}


}
