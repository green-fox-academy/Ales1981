package com.greenfoxacademy.pfcwithusers.services;

import com.greenfoxacademy.pfcwithusers.models.User;

import java.util.List;

public interface UserService {
    abstract void createUser(String username, String password);

    abstract List<User> listAllUsers();

    abstract User findUserInDB(String username, String password);

    abstract User findUserByUsername(String username);

    void saveNewUser(User newUser); // ok

    User findUserById(Long userId);
}
