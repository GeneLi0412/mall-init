package com.feify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.feify.entity.User;
import com.feify.service.IUserSerivce;

@Controller
@RequestMapping("userdemo")
public class UserController {
	
	@Autowired
	private IUserSerivce userService;
	
	@RequestMapping("getName")
	@ResponseBody
	public List<User> getUserName(){
		List<User> users = userService.getUserName();
		return users;
	}
}
