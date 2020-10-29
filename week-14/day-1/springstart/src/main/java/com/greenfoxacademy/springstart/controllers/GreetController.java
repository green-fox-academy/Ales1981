package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;


@Controller
public class GreetController{

    private static AtomicLong counter = new AtomicLong();
    private Random randNum = new Random();
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @GetMapping("/greet")
    public String greet(@RequestParam(value = "fontSize") long fontSize , @RequestParam(value = "textColor")
            String textColor , Model model){
        model.addAttribute("userName", "Ales");
        model.addAttribute("clickCount",counter.incrementAndGet());
        model.addAttribute("Hello",getRandomHello());
        model.addAttribute("fontSize", fontSize);
        model.addAttribute("textColor", textColor);
        return "Greet";
    }

    public String getRandomHello(){
        int someHelloNumber = randNum.nextInt(hellos.length);
        return hellos[someHelloNumber];
    }
}
