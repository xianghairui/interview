package com.uso.xianghariui.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uso.xianghariui.entity.TlUser;
import com.uso.xianghariui.service.TlUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private TlUserService tlUserService;
	
	/**
	 * 添加用户的基本信息
	 * @param username 姓名
	 * @param gender 性别
	 * @param age 年龄
	 * @param adress 地址
	 * @return 
	 */
	@RequestMapping(value = "/addUser" , method=RequestMethod.GET, produces="text/html;charset=UTF-8")
	@ResponseBody
	public String addUser(String username, String gender, Integer age, String adress){
		String result = "";
		if(username!=null && !username.equals("")){
			TlUser user = new TlUser();
			user.setUsername(username);
			user.setGender(gender);
			user.setAge(age);
			user.setAdress(adress);
			tlUserService.insert(user);
			result = "success";
		} else {
			result = "用户名不能为空";
		}
		return result;
	}
	
}
