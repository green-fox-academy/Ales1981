package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting(@RequestParam String name) {
        return new Greeting(1,"Hello! " + name + " !");
    }
}
