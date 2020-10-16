package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {

    @GetMapping("/web/greeting")
    public String greeting(Model model){
        model.addAttribute("user", " World");
        return "greeting";
    }
}
