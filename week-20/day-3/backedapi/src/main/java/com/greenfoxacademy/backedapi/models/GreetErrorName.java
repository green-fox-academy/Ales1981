package com.greenfoxacademy.backedapi.models;

public class GreetErrorName {
    private String error;

    public GreetErrorName() {
        this.error = "Please provide a name!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
