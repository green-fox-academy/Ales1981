package com.greenfoxacademy.pfcwithusers.controllers;


import com.greenfoxacademy.pfcwithusers.services.FoxServiceImpl;
import com.greenfoxacademy.pfcwithusers.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final FoxServiceImpl foxService;
    private final UserService userService;

    @Autowired
    public MainController(FoxServiceImpl foxService, UserService userService) {
        this.foxService = foxService;
        this.userService = userService;
    }

    @GetMapping("/default")
    public String showDeafultFox() {
        return "default";
    }

    @GetMapping("/")
    public String showFox(@RequestParam String name, Model model) {
        model.addAttribute("currentFox", foxService.showCurrentFox(name));
        return "index";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String findFox(@RequestParam(value = "name") String name, Model model) {
        if (!name.isEmpty()) {
            if (foxService.showCurrentFox(name) == null) {
                model.addAttribute("name", name);
                return "createFox";
            } else {
                return "redirect:/?name=" + name;
            }
        }
        return "login";
    }

    @GetMapping("/showAll")
    public String showAllFoxes(Model model) {
        model.addAttribute("pack", foxService.showAllFoxes());
        return "showAll";
    }

    @GetMapping("/addFox/{username}")
    public String createNewFox(@PathVariable (value = "username") String username, Model model){
        model.addAttribute("currentUser",this.userService.findUserByUsername(username));
        return "createFox";
    }

    @PostMapping("/addFox")
    public String createAndAddNewFox(@RequestParam(value = "name") String name,
                                     @RequestParam(value = "food") String food,
                                     @RequestParam(value = "drink") String drink) {
        foxService.createAndAdd(name, food, drink);
        return "redirect:/showAll";
    }
}
