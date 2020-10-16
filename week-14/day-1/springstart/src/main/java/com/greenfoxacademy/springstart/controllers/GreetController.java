package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import com.greenfoxacademy.springstart.WebGreetCounterApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetController extends WebGreetCounterApp {

    @GetMapping("/greet")
    public String greet(Model model){
        String someHello = getRandomHello();
        String userName = "Ales";
        int clickCount = greetCount();
        model.addAttribute("userName", userName);
        model.addAttribute("clickCount",clickCount);
        model.addAttribute("Hello",someHello);
        return "Greet";
    }
}
