package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private static AtomicLong greetCount = new AtomicLong(0);
    //private long id;
    private String content;


    public Greeting(long id, String content) {
        increment();
        //this.id = id;
        this.content = content;
    }
/*
    public long getId() {
        return id;
    }
*/
    public String getContent() {
        return content;
    }

    public long getValue() {
        return greetCount.get();
    }

    public void increment() {
        while (true) {
            long existingValue = getValue();
            long newValue = existingValue + 1;
            if (greetCount.compareAndSet(existingValue, newValue)) {
                return;
            }
        }
    }
}
