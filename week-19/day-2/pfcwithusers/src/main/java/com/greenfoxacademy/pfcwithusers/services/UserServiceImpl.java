package com.greenfoxacademy.pfcwithusers.services;

import com.greenfoxacademy.pfcwithusers.models.Fox;
import com.greenfoxacademy.pfcwithusers.models.User;
import com.greenfoxacademy.pfcwithusers.repositories.FoxRepository;
import com.greenfoxacademy.pfcwithusers.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final FoxRepository foxRepository;

    public UserServiceImpl(UserRepository userRepository, FoxRepository foxRepository) {
        this.userRepository = userRepository;
        this.foxRepository = foxRepository;
    }

    @Override // no
    public void createUser(String username, String password) {
        User newUser = new User(username, password);
        this.userRepository.save(newUser);
    }

    @Override
    public List<User> listAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User findUserInDB(String username, String password) {
        return this.userRepository.findByUsernameAndPassword(username, password);

    }

    @Override
    public User findUserByUsername(String username) {
        return this.userRepository.findByUsernameEquals(username);
    }

    @Override //ok
    public void saveNewUser(User newUser) {
        Fox newFox = new Fox();
        foxRepository.save(newFox);
        newFox.setUser(newUser);
        userRepository.save(newUser);
    }

    @Override
    public User findUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
