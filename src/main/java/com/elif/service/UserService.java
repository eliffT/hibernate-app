package com.elif.service;

import com.elif.dao.UserDao;
import com.elif.model.User;

import java.util.List;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao = userDao;
    }
    public User createUser(String name, String email, int age){
        User user = new User(name, email, age);
        return userDao.createUser(user);
    }

    public void deleteUser(int id){
            userDao.deleteUser(id);
    }

    public void updateUser(int id, String name, String email, int age){
        User updatedUser = new User(name, email, age);
        updatedUser.setId(id);
        userDao.updateUser(updatedUser);
    }

    public List<User> listUsers(){
        return userDao.getAll();
    }

}
