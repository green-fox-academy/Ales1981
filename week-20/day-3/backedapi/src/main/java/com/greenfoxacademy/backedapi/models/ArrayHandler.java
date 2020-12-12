package com.greenfoxacademy.backedapi.models;

import org.springframework.stereotype.Component;

@Component
public class ArrayHandler {
    private String what;
    private int[] numbers;
    private int[] result;

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }
}
