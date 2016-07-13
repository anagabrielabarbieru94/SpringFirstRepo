package com.example.spring.service.impl;

import com.example.spring.Application;
import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.repository.impl.UserRepositoryImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import com.example.spring.service.UserService;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abarbieru on 7/13/2016.
 */

@Service("service2")
public class UserServiceOtherImpl  implements ApplicationContextAware, UserService{

    private ApplicationContext context;

    private UserRepository userRepo;

    @Autowired
    public UserServiceOtherImpl(UserRepository rep){
        this.userRepo = rep;
    }

    public UserServiceOtherImpl(){

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public ApplicationContext getApplicationContext(){
        return context;
    }

    public void setUserRepository(UserRepositoryImpl repo){
        this.userRepo = repo;
    }

    public UserRepository getUserRepo(){
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

    @PostConstruct
    public void init(){
        userRepo = context.getBean(UserRepositoryImpl.class);
    }
}
