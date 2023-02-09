package com.yakub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping("/req1")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/req2")
	public String printFullName(@RequestParam Integer number,ModelMap m)
	{
		m.put("num", number);
		String result="null";
		if(number%2==0)
		{
			result="Even";
		}
		else
		{
			result="Odd";
		}
		m.put("result", result);
		return "home";
	}
	
}
