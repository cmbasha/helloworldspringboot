package com.basha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@ResponseBody
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World SpringBoot Application";
	}
	
	@ResponseBody
	@GetMapping("/welcome")
	public ModelAndView welcome()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("welcomepage");
		return mav;
	}
}
