package com.greenfoxacademy.reddit.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "posts")
@Entity(name = "post")
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String title;
    private String url;
    private int score;

    public Post() {
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.score = 10;
    }

    public void scorePlusOne() {
        this.score++;
    }

    public void scoreMinusOne() {
        this.score--;
    }
}
