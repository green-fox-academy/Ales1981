package com.greenfoxacademy.backedapi.models;

public class ArrayHandlerError {
    private String error;

    public ArrayHandlerError() {
        this.error = "Please provide what to do with the numbers!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
