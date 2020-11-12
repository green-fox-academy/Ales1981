package com.greenfoxacademy.demo.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Fox {
    private String name;
    private String food;
    private String drink;
    private static AtomicLong id = new AtomicLong(0);
    private long foxId;

    private List<Trick> listOfTricks;

    public Fox() {
    }

//    public Fox(String name) {
//        this.name = name;
//        this.foxId = id.incrementAndGet();
//    }



    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.foxId = id.incrementAndGet();
        this.listOfTricks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public long getFoxId() {
        return foxId;
    }

    public void setFoxId(long foxId) {
        this.foxId = foxId;
    }

    public void addNewTrick(String nameOfTrick){
        listOfTricks.add(new Trick(nameOfTrick));
    }
}
