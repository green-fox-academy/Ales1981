package com.greenfoxacademy.backedapi.models;

public class GreetErrorTitle {
    private String error;

    public GreetErrorTitle() {
        this.error = "Please provide a title!";
    }

    public GreetErrorTitle(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
