package com.greenfoxacademy.basicwebshop.models;

public class ShopItem {
    private String name;
    private String description;
    private int price;
    private String currency;
    private int quantityOfStock;

    public ShopItem() {
    }

    public ShopItem(String name, String description, int price,String currency, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
        this.quantityOfStock = quantityOfStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(int quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
