package com.uso.xianghariui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uso.xianghariui.entity.TlUser;
import com.uso.xianghariui.mapper.TlUserMapper;

@Service
public class TlUserService {
	
	@Autowired
	private TlUserMapper tlUserMapper;
	
	public int insert(TlUser user){
		return tlUserMapper.insert(user);
	}
	
}
