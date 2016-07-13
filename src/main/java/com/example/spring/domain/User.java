package com.example.spring.domain;

public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private int age;

    public void setUserId(int id){
        this.userId = id;
    }

    public int getUserId(){
        return userId;
    }
    public void setFirstName(String fname){
        this.firstName = fname;
    }

    public String getFirstName(){
        return firstName;
    }

    public  void setLastName(String lname){
        this.lastName =  lname;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
	
}
