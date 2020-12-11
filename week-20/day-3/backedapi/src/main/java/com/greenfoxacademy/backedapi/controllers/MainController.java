package com.greenfoxacademy.backedapi.controllers;

import com.greenfoxacademy.backedapi.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping("/")
    public String renderIndex() {
        return "index";
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> makeItDouble(@RequestParam(required = false) Integer input) {
        if (input == null) {
            DoubelingError error = new DoubelingError();
            return ResponseEntity.ok().body(error);
        }
        Input num = new Input();
        num.setReceived(input);
        num.setResult(2 * input);

        return ResponseEntity.ok().body(num);
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> sayHello(@RequestParam(required = false) String name,
                                      @RequestParam(required = false) String title) {
        if (name == null) {
//            GreetErrorName errorName = new GreetErrorName();
//            return ResponseEntity.badRequest().body(errorName);
            GreetError errorBoth = new GreetError();
            return ResponseEntity.badRequest().body(errorBoth);
        }
        if (title == null) {
            GreetErrorTitle errorTitle = new GreetErrorTitle();
            return ResponseEntity.badRequest().body(errorTitle);
        }
//        if ( title == null && name == null){
//            GreetError errorBoth = new GreetError();
//            return ResponseEntity.badRequest().body(errorBoth);
//        }
        Greet sayGreet = new Greet(name, title);
        return ResponseEntity.ok().body(sayGreet);
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity addTheA(@PathVariable(required = false) String appendable) {
        if (appendable == null) {
            return (ResponseEntity) ResponseEntity.notFound();
        }
        Appended name = new Appended(appendable);
        return ResponseEntity.ok().body(name);
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doSomeMath(@PathVariable(required = false) String action){
//        String someJSON = "{\"dountil4\":\"4\"}";
//        JSONPObject object = new JSONPObject(someJSON,4);
//        Integer someNumber = object.getValue();
//        String someJSONr2 = "{\"dountil7\":\"7\"}";
        Integer someNumber = 7;
        Integer someNumber2 = 4;
        String sum = "sum";
        String factor = "factor";
        if (someNumber != null){
            if (action.equals(sum)){
                int sumResult = 0;
                DoUntilResult doUntilResult = new DoUntilResult();
                for (int i = someNumber; i > 0 ; i--) {
                    sumResult += i;
                }
                doUntilResult.setResult(sumResult);
                return ResponseEntity.ok().body(doUntilResult);
            }
            if (action.equals(factor)) {
                int factorResult = 1;
                DoUntilResult doUntilResult = new DoUntilResult();
                for (int i = 1; i <= someNumber2; i++) {
                    factorResult *= i;
                }
                doUntilResult.setResult(factorResult);
                return ResponseEntity.ok().body(doUntilResult);
            }
        }
        DoUntilError error = new DoUntilError();
        return ResponseEntity.badRequest().body(error);
    }
}
