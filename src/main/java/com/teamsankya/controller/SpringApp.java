package com.teamsankya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class SpringApp {
	@RequestMapping(method=RequestMethod.GET, path="hi")
	public String helloWorld(ModelMap map){
		map.addAttribute("hellovaish", "hello....");
		return "index";
	}

}
