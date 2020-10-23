package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MyWebController {

    private List<ShopItem> itemList = new ArrayList<>();

    public MyWebController() {
        itemList.add(new ShopItem("Running shoes", "Nike running shoes for every day sport.", 1000, "CZK", 5));
        itemList.add(new ShopItem("Printer", "Some HP printer that will print pages.", 3000, "CZK", 2));
        itemList.add(new ShopItem("Coca Cola", "0,5l standard coke", 25, "CZK", 0));
        itemList.add(new ShopItem("Wokin", "Chicken with fried rice and Wokin sauce.", 119, "CZK", 100));
        itemList.add(new ShopItem("T-shirt", "blue with corgi on bike.", 300, "CZK", 1));
    }

    @GetMapping("/showWeb")
    public String showWeb() {
        return "myShop";
    }

    @GetMapping("/showAllItems")
    public String showAllItems(Model model) {
        model.addAttribute("itemList", itemList);
        return "myShop";
    }

    @GetMapping("/only-available")
    public String showOnlyAvailable(Model model) {
        List<ShopItem> availables = itemList.stream().filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
        model.addAttribute("availables", availables);
        return "myShop";
    }

    @GetMapping("/cheapest-first")
    public String showCheapestFirst(Model model) {
        List<ShopItem> cheapestFirstList = itemList.stream()
                .sorted(Comparator.comparingInt(ShopItem::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("cheapestFirstList", cheapestFirstList);
        return "myShop";
    }

    @GetMapping("/contains-nike")
    public String showNikeItem(Model model) {
        List<ShopItem> nikeGoodsList = itemList.stream()
                .filter(shopItem -> shopItem.getDescription().contains("Nike"))
                .collect(Collectors.toList());
        model.addAttribute("nikeGoodsList", nikeGoodsList);
        return "myShop";
    }

    @GetMapping("/average-stock")
    public String showAverageStock(Model model) {
        double averageOnStock = itemList.stream()
                .collect(Collectors.averagingDouble(ShopItem::getQuantityOfStock));
        model.addAttribute("averageOnStock", averageOnStock);
        return "myShopAverage";
    }
}
