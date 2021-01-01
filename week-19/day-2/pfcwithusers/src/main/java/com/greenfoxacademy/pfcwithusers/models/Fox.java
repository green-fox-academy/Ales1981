package com.greenfoxacademy.pfcwithusers.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Table(name = "foxes")
@Entity(name = "fox")
public class Fox {
    private String name;
    private String food;
    private String drink;
//    private static AtomicLong id = new AtomicLong(0);
    //private List<String> knownTricks = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long foxId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;


    public Fox() {
    }


    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
//        this.foxId = id.incrementAndGet();
        //this.knownTricks = new ArrayList<>();
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

//    public void learnNewTrick(String trick) {
//        knownTricks.add(trick);
//    }
//
//    public List<String> getKnownTricks() {
//        return knownTricks;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
