package com.tipTopBites.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping ("/login")
	public String login(Model model){
		
		model.addAttribute("classActiveLogin", true);
		return "myAccount";
		
		
	}
	
	
	@RequestMapping ("/forgorPassword")
	public String forgotPassword(Model model){
		
		model.addAttribute("classActiveForgotPassword", true);
		return "myAccount";
		
		
	}
	
	@RequestMapping ("/newAccount")
	public String newAccount(Model model){
		
		model.addAttribute("classActiveNewAccount", true);
		return "myAccount";
		
		
	}
}


