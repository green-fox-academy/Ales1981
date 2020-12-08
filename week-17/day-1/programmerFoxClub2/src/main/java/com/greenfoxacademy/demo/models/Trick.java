package com.greenfoxacademy.demo.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trick {
    public static List<String> availableTricks = new ArrayList<>(Arrays.asList("sleep all day", "crawl silently",
            "catch any mouse", "bully another cats", "fight with dog", "scream like hell"));

    public static List<String> getAvailableTricks() {
        return availableTricks;
    }

}
