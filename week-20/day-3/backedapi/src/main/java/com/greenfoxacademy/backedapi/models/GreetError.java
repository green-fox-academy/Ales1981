package com.greenfoxacademy.backedapi.models;

public class GreetError {
    private String error;

    public GreetError() {
        this.error = "Please provide a name and a title!";
    }

    public GreetError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
