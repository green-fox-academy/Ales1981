package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.services.FoxServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxServiceImpl foxService;

    public MainController(FoxServiceImpl foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/default")
    public String showDeafultFox(){
        return "default";
    }

    @GetMapping("/")
    public String showFox(@RequestParam String name , Model model){
        model.addAttribute("name", foxService.showCurrentFox(name).getName());
        model.addAttribute("food", foxService.showCurrentFox(name).getFood());
        model.addAttribute("drink", foxService.showCurrentFox(name).getDrink());
        model.addAttribute("foxId", foxService.showCurrentFox(name).getFoxId());
        return "index";
    }

    @GetMapping("/login")
    public String showLoginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String findFox(@RequestParam(value = "name") String name, Model model){
        if (foxService.showCurrentFox(name) == null){
            model.addAttribute("name", name);
            return "createFox";
        }else {
            return "redirect:/?name="+name;
        }
    }

    @GetMapping("/showAll")
    public String showAllFoxes(Model model){
        model.addAttribute("pack",foxService.showAllFoxes());
        return "showAll";
    }

    @PostMapping("/addFox")
    public String createAndAddNewFox(@RequestParam(value = "name") String name,
                                     @RequestParam(value = "food") String food,
                                     @RequestParam(value = "drink") String drink){
        foxService.createAndAdd(name, food, drink);
        return "redirect:/showAll";
    }
}
