package com.example.spring.controller;

import com.example.spring.domain.User;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

public class UserController {

	
	@Autowired
	@Qualifier("service2")
	private UserService userService;


	public void setUserService(UserService serv){
		this.userService = serv;
	}

	public void createUser(User user){
		userService.save(user);
		// call UserService here
	}
}
