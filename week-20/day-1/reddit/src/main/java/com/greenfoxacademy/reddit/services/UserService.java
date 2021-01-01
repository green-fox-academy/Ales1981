package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.User;

public interface UserService {
    abstract void createUser(String name, String password);

    abstract User checkUserNameIfExists(String name);

    abstract User findUserById(Long userId) throws Exception;

    abstract void setUserLoggedIn(Long userId,String name,String password);

    abstract void setUserLoggedOut(Long userId,String name,String password);
}
