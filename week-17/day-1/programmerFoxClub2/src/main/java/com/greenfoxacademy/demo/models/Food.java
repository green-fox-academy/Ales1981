package com.greenfoxacademy.demo.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Food {
    public static List<String> foods = new ArrayList<>(Arrays.asList("banana", "fish", "chicken", "grass"));

    public static List<String> getFoods() {
        return foods;
    }
}
