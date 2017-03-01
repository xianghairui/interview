package com.uso.xianghairui.service.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.uso.xianghariui.entity.TlUser;
import com.uso.xianghariui.service.TlUserService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class testTlUserService {
	
	@Autowired
	private TlUserService userService;
	
	@Test
	public void testinsert(){
		TlUser user = new TlUser();
		user.setUsername("相海瑞");
		user.setGender("男");
		user.setAge(25);
		user.setAdress("北京市");
		int num = userService.insert(user);
		System.out.println(num);
	}
	
}
