package com.greenfoxacademy.pfcwithusers.services;

import com.greenfoxacademy.pfcwithusers.models.Fox;

import java.util.List;

public interface FoxService {
    Fox showCurrentFox(String name);

    List<Fox> showAllFoxes();

    void createAndAdd(String name, String food, String drink);

}
