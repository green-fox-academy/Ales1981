package com.greenfoxacademy.pfcwithusers.controllers;

import com.greenfoxacademy.pfcwithusers.models.User;
import com.greenfoxacademy.pfcwithusers.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all-users")
    public String showAllUsers(Model model) {
        model.addAttribute("users", this.userService.listAllUsers());
        model.addAttribute(model);
        return "all-users";
    }

    @GetMapping(value = {"/register", "/register/{message}"}) //ok
    public String showRegPage(Model model, @PathVariable(required = false) String message) {
        model.addAttribute("user", new User());
        if (message != null) {
            if (message.equals("missing-input")) {
                model.addAttribute("message", "You have to fill all the input fields!");
                return "register-page";
            }
            if (message.equals("incorrect-password")) {
                model.addAttribute("message", "Password and confirmed password must be equal!");
                return "register-page";
            }
            if (message.equals("incorrect-name")) {
                model.addAttribute("message", "Name is already in use,choose another one!");
                return "register-page";
            }
        }
        return "register-page";
    }

    @PostMapping("/register")//ok
    public String createAndSaveUser(@ModelAttribute User newUser, String confirmed_password) {
        if (newUser.getUsername().isEmpty() || newUser.getPassword().isEmpty() || confirmed_password.isEmpty()) {
            String message = "missing-input";
            return "redirect:/register/" + message;
        }
        if (!newUser.getPassword().equals(confirmed_password)) {
            String message = "incorrect-password";
            return "redirect:/register/" + message;
        }
        if (userService.findUserByUsername(newUser.getUsername()) != null) {
            String message = "incorrect-name";
            return "redirect:/register/" + message;
        }
        userService.saveNewUser(newUser);
        return "redirect:/user-login";
    }

    @GetMapping(value = {"/user-login", "/user-login/{message}"})//ok
    public String userLogInPage(Model model, @PathVariable(required = false) String message) {
        if (message != null) {
            if (message.equals("wrong data")) {
                model.addAttribute("message", "Wrong username or password!");
                return "user-login-page";
            }
        }
        return "user-login-page";
    }

    @PostMapping("/user-login-process")//ok
    public String userExistsLogIn(User loggedUser) {
        if (loggedUser.getUsername().isEmpty() || loggedUser.getPassword().isEmpty()) {
            return "redirect:/user-login";
        } else if (userService.findUserByUsername(loggedUser.getUsername()) == null
                || !userService.findUserByUsername(loggedUser.getUsername()).getPassword().equals(loggedUser.getPassword())) {
            String message = "wrong data";
            return "redirect:/user-login/" + message;
        } else {
            return "redirect:/user-overview/" + userService.findUserByUsername(loggedUser.getUsername()).getUserId();
        }
    }

    @GetMapping("/user-overview/{id}")//ok
    public String showUser(@PathVariable Long id, Model model) {
        model.addAttribute("currentUser", userService.findUserById(id));
        model.addAttribute("foxes",userService.findUserById(id).getFoxes());
        return "user-overview";
    }
}
