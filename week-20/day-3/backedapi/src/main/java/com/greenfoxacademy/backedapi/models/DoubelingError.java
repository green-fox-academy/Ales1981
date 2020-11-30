package com.greenfoxacademy.backedapi.models;

public class DoubelingError {
    private String error;

    public DoubelingError() {
        this.error = "Please provide an input!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
