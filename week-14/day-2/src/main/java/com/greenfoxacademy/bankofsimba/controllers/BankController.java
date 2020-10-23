package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> bankAccountList = new ArrayList<>();

    public BankController() {
        bankAccountList.add(new BankAccount("Simba", 2000, "lion",true,true));
        bankAccountList.add(new BankAccount("Robin Hood", -2000, "human",false,false));
        bankAccountList.add(new BankAccount("Rambo", 0, "human",false,true));
        bankAccountList.add(new BankAccount("Donald", 1200, "duck",false,true));
        bankAccountList.add(new BankAccount("Jaw", 1000, "shark",true,false));

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
    public String riseBalance(@ModelAttribute(value = "balance") Model model){

        return "redirect:/showAll";
    }

    @PostMapping("/add")
    //public String addNewBankAccount(@ModelAttribute BankAccount bankAccount){
    //    bankAccountList.add(new BankAccount());
    public String addUser(String name, int balance, String animalType, boolean isKing, boolean isGoodGuy){
        bankAccountList.add(new BankAccount(name,balance,animalType,isKing,isGoodGuy));
        return "redirect:/showAll";
    }


}
