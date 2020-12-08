package com.greenfoxacademy.reddit.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

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
    @CreationTimestamp
    private LocalDate creationDate;

    public Post() {
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.score = 10;
        this.creationDate = getCreationDate();
    }

    public void scorePlusOne() {
        this.score++;
    }

    public void scoreMinusOne() {
        this.score--;
    }
}
