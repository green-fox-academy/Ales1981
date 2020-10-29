package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private static AtomicLong id = new AtomicLong(0);
    private long greetCount;
    private String content;


    public Greeting(long greetCount , String content) {
        this.greetCount = id.incrementAndGet();
        this.content = content;
    }

    public static AtomicLong getId() {
        return id;
    }

    public static void setId(AtomicLong id) {
        Greeting.id = id;
    }

    public long getGreetCount() {
        return greetCount;
    }

    public void setGreetCount(long greetCount) {
        this.greetCount = greetCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
