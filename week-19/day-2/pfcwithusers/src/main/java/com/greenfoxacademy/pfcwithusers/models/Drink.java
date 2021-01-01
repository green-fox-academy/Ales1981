package com.greenfoxacademy.pfcwithusers.models;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drink {
    public static List<String> drinks = new ArrayList<>(Arrays.asList("water", "wine", "cola", "milk"));

    public static List<String> getDrinks() {
        return drinks;
    }
}
