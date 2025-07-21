package com.elif.dao;

import com.elif.model.User;

import java.util.List;

public interface UserDao {
    User createUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    List<User> getAll();
}
