package com.edu.ceub.pidi.coramdeo.cge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/login")
	public String login() {return "login";}
	
	@RequestMapping("/")
	public String index() {return "index";}
}
