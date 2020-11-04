package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
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
        itemList.add(new ShopItem("Sandals", "Very light shoes for every summer day walking.", 1100, "CZK", 12));
    }

    @GetMapping("/showWeb")
    public String showWeb() {
        return "myShop";
    }

    @GetMapping("/showAllItems")
    public String showAllItems(Model model) {
        model.addAttribute("list", itemList);
        return "myShop";
    }

    @GetMapping("/only-available")
    public String showOnlyAvailable(Model model) {
        List<ShopItem> availables = itemList.stream().filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
        model.addAttribute("list", availables);
        return "myShop";
    }

    @GetMapping("/cheapest-first")
    public String showCheapestFirst(Model model) {
        List<ShopItem> cheapestFirstList = itemList.stream()
                .sorted(Comparator.comparingInt(ShopItem::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("list", cheapestFirstList);
        return "myShop";
    }

    @GetMapping("/contains-nike")
    public String showNikeItem(Model model) {
        List<ShopItem> nikeGoodsList = itemList.stream()
                .filter(shopItem -> shopItem.getDescription().contains("Nike"))
                .collect(Collectors.toList());
        model.addAttribute("list", nikeGoodsList);
        return "myShop";
    }

    @GetMapping("/average-stock")
    public String showAverageStock(Model model) {
        double averageOnStock = itemList.stream()
                .collect(Collectors.averagingDouble(ShopItem::getQuantityOfStock));
        model.addAttribute("message", "Average on stock : ");
        model.addAttribute("value", averageOnStock);
        return "myShopAverage";
    }

    @GetMapping("/mostExpensive")
    public String showMostExpensive(Model model) {
        ShopItem maxPriceItem = itemList.stream()
                .max(Comparator.comparingInt(ShopItem::getPrice))
                .get();
       /*List<ShopItem> mostExpensiveItems = itemList.stream()
               .sorted(Comparator.comparingInt(ShopItem::getPrice).reversed())
               .collect(Collectors.toList());
       List<ShopItem> oneMaxValueList = new ArrayList<>();
       oneMaxValueList.add(mostExpensiveItems.get(0));*/

        model.addAttribute("message", "The most expensive item is : ");
        model.addAttribute("value", maxPriceItem.getName());
        return "myShopAverage";
    }

    @PostMapping("/search")
    public String searchItem(@RequestParam(value = "keyword", required = false) String keyword,
                             Model model) {
        List<ShopItem> foundByName = itemList.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
        List<ShopItem> foundByDescription = itemList.stream()
                .filter(shopItem -> shopItem.getDescription().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
        List<ShopItem> allResults = new ArrayList<>();
        allResults.addAll(foundByName);
        allResults.addAll(foundByDescription);
        List<ShopItem> uniqueResults = allResults.stream().distinct().collect(Collectors.toList());
        if (uniqueResults.isEmpty()){
            model.addAttribute("noresult", "There is no such item in my shop!");
        }else {
            model.addAttribute("list", uniqueResults);
        }
        return "myShop";
    }
}
