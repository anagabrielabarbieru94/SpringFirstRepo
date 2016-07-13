package com.example.spring.service.impl;

import com.example.spring.Application;
import com.example.spring.domain.User;
import com.example.spring.repository.impl.UserRepositoryImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import com.example.spring.service.UserService;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.SecondaryTable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abarbieru on 7/13/2016.
 */

@Component
public class UserServiceOtherImpl  implements ApplicationContextAware, UserService{

    private static ApplicationContext context;
    private UserRepositoryImpl userRepo;

    public UserServiceOtherImpl(UserRepositoryImpl rep){
        this.userRepo = rep;
    }

    public UserServiceOtherImpl(){

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public static ApplicationContext getApplicationContext(){
        return context;
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
        
        System.out.println("hello world" + user.toString());
    }

    @PostConstruct
    public void init(){

    }
}
