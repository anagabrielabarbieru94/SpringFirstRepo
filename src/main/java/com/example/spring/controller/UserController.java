package com.example.spring.controller;

import com.example.spring.domain.User;
import com.example.spring.service.UserService;
import com.example.spring.service.impl.UserServiceImpl;
import com.example.spring.service.impl.UserServiceOtherImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class UserController {

	@Autowired
	private UserService userService;


	@Autowired
	public UserController(UserServiceImpl serv){
		this.userService = serv;
	}

	public UserController(){

	}

	public void createUser(User user){
		userService.save(user);
		// call UserService here
	}
}
