package com.greenfoxacademy.todoappassignees.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "assignees")
@Entity
@Getter
@Setter
public class Assignee {
    private String name;
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assigneeId;

    @OneToMany(mappedBy = "assignee")
    private List<Todo> todoList;

    public Assignee() {
    }

    public Assignee(String name) {
        this.name = name;
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
