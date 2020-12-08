package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Drink;
import com.greenfoxacademy.demo.models.Food;
import com.greenfoxacademy.demo.models.Trick;
import com.greenfoxacademy.demo.services.FoxServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FoxController {

    private final FoxServiceImpl foxService;

    public FoxController(FoxServiceImpl foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/nutritionStore")
    public String showNutritionStore(@RequestParam String name, Model model) {
        model.addAttribute("currentFox", foxService.showCurrentFox(name));
        model.addAttribute("foods", Food.getFoods());
        model.addAttribute("drinks", Drink.getDrinks());
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String changeNutritions(@RequestParam String name,
                                   @RequestParam String food, @RequestParam String drink) {
        foxService.showCurrentFox(name).setFood(food);
        foxService.showCurrentFox(name).setDrink(drink);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/trickCenter")
    public String showTricks(@RequestParam String name, Model model) {
        List<String> availableTricks = new ArrayList<>(Trick.getAvailableTricks());
        List<String> knownTricks = new ArrayList<>(foxService.showCurrentFox(name).getKnownTricks());
        availableTricks.removeAll(knownTricks);
        model.addAttribute("availableTricks", availableTricks);
        model.addAttribute("currentFox", foxService.showCurrentFox(name));
        return "trickCenterView";
    }

    @PostMapping("/trickCenter")
    public String learnTrick(@RequestParam String name, @RequestParam String trick, Model model) {
        foxService.showCurrentFox(name).learnNewTrick(trick);
        return "redirect:/?name=" + name;
    }
}
