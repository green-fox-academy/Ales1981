package com.greenfoxacademy.backedapi.models;

public class Greet {
    private String welcome_message;
    private String name;
    private String title;



    public Greet() {
    }

    public Greet(String name, String title) {
        this.name = name;
        this.title = title;
        this.welcome_message = "Oh, hi there "+this.name+", my dear "+this.title+"!";
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }
}
