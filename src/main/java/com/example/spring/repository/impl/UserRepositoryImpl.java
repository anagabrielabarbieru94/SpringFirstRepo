package com.example.spring.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserRepositoryImpl implements UserRepository{


	public UserRepositoryImpl(){

	}

	@Override
	public List<User> list() {
		List <User> user = new ArrayList<User>();
		System.out.println("Hello! UserRepository list() method...");
		return user;
	}

	@Override
	public User get(int id) {
		User user = new User();
		System.out.println("Hello! UserRepository get() method...");
		return user;
	}

	@Override
	public void save(User user) {
		System.out.println("Hello! Saved user...");
		System.out.println("FirstName: " + user.getFirstName());
		System.out.println("LastName: " + user.getLastName());
		System.out.println("Age: " + user.getAge());
	}

}
