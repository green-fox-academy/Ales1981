package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(String name, String password) {
        this.userRepository.save(new User(name, password));
    }

    @Override
    public User checkUserNameIfExists(String name) {
        return this.userRepository.findByName(name);
    }

    @Override
    public User findUserById(Long userId) throws Exception {
        User foundUser = this.userRepository.findById(userId).orElse(null);
        if (foundUser != null) {
            return foundUser;
        } else {
            throw new Exception("userId not found");
        }
    }

    @Override
    public void setUserLoggedIn(Long userId, String name, String password) {
        User updatedUser = new User(name, password);
        updatedUser.setUserId(userId);
        updatedUser.setIsloggedInTrue();
        this.userRepository.save(updatedUser);
    }

    @Override
    public void setUserLoggedOut(Long userId, String name, String password) {
        User updatedUser = new User(name, password);
        updatedUser.setUserId(userId);
        updatedUser.setIsloggedInFalse();
        this.userRepository.save(updatedUser);
    }
}
