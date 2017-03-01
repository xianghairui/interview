package com.uso.xianghariui.web.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@RequestMapping("/helloworld")
	@ResponseBody
	public String HelloWorld(){
		return "HelloWorld";
	}
	
}
