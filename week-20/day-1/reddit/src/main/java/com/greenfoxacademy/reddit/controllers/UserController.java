package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String newUser() {
        return "register-user";
    }

    @PostMapping("/register")
    public String registerNewUser(@RequestParam String name, @RequestParam String password,
                                  @RequestParam String confirmed_password, Model model) {
        if (this.userService.checkUserNameIfExists(name) != null) {
            model.addAttribute("userErrorMessage", "Name already exists, choose new one!");
            return "register-user";
        } else if (password.length() > 4) {
            model.addAttribute("userErrorMessage", "Password is too long!");
            return "register-user";
        } else if (!password.matches(confirmed_password)) {
            model.addAttribute("userErrorMessage", "Passwords does not match!");
            return "register-user";
        } else {
            this.userService.createUser(name, password);
        }
        return "redirect:/login-user";
    }

    @GetMapping("/login-user")
    public String loginPage() {
        return "login-user";
    }

    @PostMapping("/login-user")
    public String logInUser(@RequestParam String name, @RequestParam String password, Model model) {
        if (this.userService.checkUserNameIfExists(name) == null) {
            model.addAttribute("logErrorMessage", "No such name in database, register first!");
            return "login-user";
        } else if (!this.userService.checkUserNameIfExists(name).getPassword().equals(password)) {
            model.addAttribute("logErrorMessage", "Wrong password!");
            return "login-user";
        }
        return "redirect:/home-page/user=" + this.userService.checkUserNameIfExists(name).getUserId();
    }

    @GetMapping("/home-page/user={userId}")
    public String showHomePage(@PathVariable(value = "userId") Long userId, Model model) throws Exception {
        this.userService.setUserLoggedIn(userId, this.userService.findUserById(userId).getName()
                , this.userService.findUserById(userId).getPassword());
        model.addAttribute("user", this.userService.findUserById(userId));
        return "home-page-user";
    }

    @GetMapping("/logout-user/user={userId}")
    public String logOutUser(@PathVariable(value = "userId") Long userId) throws Exception {
        this.userService.setUserLoggedOut(userId, this.userService.findUserById(userId).getName()
                , this.userService.findUserById(userId).getPassword());
        return "login-user";
    }
}
