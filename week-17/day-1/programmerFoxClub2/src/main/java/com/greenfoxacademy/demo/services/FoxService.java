package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.Fox;

import java.util.List;

public interface FoxService {
    Fox showCurrentFox(String name);
    List<Fox> showAllFoxes();
    void createAndAdd(String name, String food, String drink);

}
