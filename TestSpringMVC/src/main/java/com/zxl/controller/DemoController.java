package com.zxl.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zxl.model.User;
import com.zxl.service.IUserService;


@Controller
public class DemoController {
	@Autowired
	private IUserService userService;
	
	 @RequestMapping(value = "/hello")
	 public String toPage1(Model model) {
		 
		 List<User> users = userService.getUserList();
		 model.addAttribute("users", users);
		 model.addAttribute("username", "ÄãºÃ");		 
		 return "/page1";
	 }
}
