package com.document;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
	@ResponseBody
	@RequestMapping(value={"/main.do"}, method={RequestMethod.GET,RequestMethod.POST})
	 private String main(Model model) throws Exception {
		System.out.println("main : ");
		
		return "OK 성공";
		
	}
}
