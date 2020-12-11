package com.greenfoxacademy.backedapi.models;

public class DoUntilError {
    private String error;

    public DoUntilError() {
        this.error = "Please provide a number!";
    }

    public DoUntilError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
