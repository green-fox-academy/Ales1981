package com.greenfoxacademy.backedapi.models;

public class GreetError2 {
    private String error;

    public GreetError2() {
        this.error = "Please provide a title!";
    }

    public GreetError2(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
