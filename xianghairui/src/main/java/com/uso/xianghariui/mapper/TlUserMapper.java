package com.uso.xianghariui.mapper;

import com.uso.xianghariui.entity.TlUser;

public interface TlUserMapper {
	
	/**
	 * 插入用户
	 * @param user
	 * @return
	 */
    public int insert(TlUser user);
}