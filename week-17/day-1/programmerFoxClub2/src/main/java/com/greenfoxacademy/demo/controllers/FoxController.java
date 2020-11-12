package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.services.FoxServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private FoxServiceImpl foxService;

    public FoxController(FoxServiceImpl foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/nutritionStore")
    public String showNutritionStore(@RequestParam String name, Model model) {
        model.addAttribute("name", foxService.showCurrentFox(name).getName());
        model.addAttribute("food", foxService.showCurrentFox(name).getFood());
        model.addAttribute("drink", foxService.showCurrentFox(name).getDrink());
        return "nutritionStore";
    }

    @PostMapping("/change")
    public String changeFood(@RequestParam String name ,String food , String drink){
        foxService.showCurrentFox(name).setFood(food);
        foxService.showCurrentFox(name).setDrink(drink);
        return "redirect:/?name="+name;
    }





}
