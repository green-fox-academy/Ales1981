package com.greenfoxacademy.todowithmysql.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "Todo")
@Getter
@Setter
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private boolean isUrgent;
    private boolean isDone;


    @Column(name = "creation_date_time")
    @CreationTimestamp
    private LocalDateTime createDateTime;

    @Column(name = "updated_date_time")
    @UpdateTimestamp
    private LocalDateTime updatedDateTime;

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
    }

    public Todo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
    }
}
