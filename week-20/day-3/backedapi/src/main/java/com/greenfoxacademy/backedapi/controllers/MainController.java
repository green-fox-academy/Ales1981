package com.greenfoxacademy.backedapi.controllers;

import com.greenfoxacademy.backedapi.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @ResponseBody
    @GetMapping("/doubling")
    public ResponseEntity<?> doubleInput(@RequestParam(required = false) Integer input) {
        if (input == null) {
            DoubelingError error = new DoubelingError();
            return ResponseEntity.ok().body(error);
        }

        Input number = new Input();
        number.setReceived(input);
        number.setResult(2 * input);

        return ResponseEntity.ok().body(number);
    }

    @ResponseBody
    @GetMapping("/greeter")
    public ResponseEntity<?> makeGreet(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null) {
            GreetError error = new GreetError();
            return ResponseEntity.badRequest().body(error);
        }

        if (title == null) {
            GreetError2 error = new GreetError2();
            return ResponseEntity.badRequest().body(error);
        }

        Greet greet = new Greet(name, title);
        return ResponseEntity.ok().body(greet);

    }

    @ResponseBody
    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> appendA(@PathVariable(value = "appendable") String appendable) {
        if (appendable == null) {
            return ResponseEntity.status(404).build();
        }

        Appended word = new Appended(appendable);
        return ResponseEntity.ok().body(word);
    }
}
