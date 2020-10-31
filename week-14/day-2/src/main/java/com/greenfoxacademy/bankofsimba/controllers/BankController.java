package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> bankAccountList = new ArrayList<>();

    public BankController() {
        bankAccountList.add(new BankAccount("Simba", 2000, "lion",true,true));
        bankAccountList.add(new BankAccount("Shrek", -2000, "orc",false,false));
        bankAccountList.add(new BankAccount("Mickey", 100, "mouse",false,true));
        bankAccountList.add(new BankAccount("Donald", 1200, "duck",false,true));
        bankAccountList.add(new BankAccount("White shark", 0, "shark",true,false));

    }

    @GetMapping("/show")
    public String showAccounts(Model model){
        model.addAttribute("bankAccountList", bankAccountList);
        return "accountDetails";
    }

    @GetMapping("/showTemplate")
    public String showTemplate(){
        return "HTMLception";
    }

    @GetMapping("/showAll")
    public String showAllAccounts(Model model){
        model.addAttribute("bankAccountList", bankAccountList);
        return "allAccounts";
    }

    @PostMapping("/rise")
    public String riseBalance(@RequestParam(value = "accountId" ) int accountId ){
        for ( BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getAccountId() == accountId )
            bankAccount.increaseBalance();
        }
        return "redirect:/showAll";
    }

    @PostMapping("/rise2")
    public String riseBalance2(@RequestParam(value = "name") String name){
        for ( BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getName().equals(name)){
                bankAccount.increaseBalance();
            }
        }
        return "redirect:/showAll";
    }

    @PostMapping("/add")
    public String addUser(String name, int balance, String animalType, boolean isKing, boolean isGoodGuy){
        bankAccountList.add(new BankAccount(name,balance,animalType,isKing,isGoodGuy));
        return "redirect:/showAll";
    }


}
