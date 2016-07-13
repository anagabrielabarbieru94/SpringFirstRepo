package com.example.spring.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.repository.impl.UserRepositoryImpl;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepositoryImpl userRepo;

	@Autowired
	public UserServiceImpl(UserRepositoryImpl rep){
		this.userRepo = rep;
	}

	public UserServiceImpl(){

	}

	public void setUserRepository(UserRepositoryImpl repo){
		this.userRepo = repo;
	}

	public UserRepositoryImpl getUserRepo(){
		return userRepo;
	}

	@Override
	public List<User> list() {
		List <User> userList = new ArrayList<User>();
		userList = userRepo.list();
		return userList;
	}

	@Override
	public User get(int id) {
		User user = new User();
		user = userRepo.get(id);
		return user;
	}

	@Override
	public void save(User user) {
		userRepo.save(user);
		System.out.println("hello world" + user.toString());
	}
}
