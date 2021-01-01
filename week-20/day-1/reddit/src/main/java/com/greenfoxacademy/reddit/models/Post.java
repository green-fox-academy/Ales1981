package com.greenfoxacademy.reddit.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

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

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    public Post() {
    }

    public Post(String title, String url,User user) {
        this.title = title;
        this.url = url;
        this.user = user;
        this.score = 10;
        this.creationDate = LocalDate.now();
    }



    public void scorePlusOne() {
        this.score++;
    }

    public void scoreMinusOne() {
        this.score--;
    }
}
