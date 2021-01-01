package com.greenfoxacademy.reddit.models;

import javax.persistence.*;
import java.util.List;

@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String password;
    private boolean isLoggedIn; // false by default

    @OneToMany(mappedBy = "user")
    private List<Post> favourites;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.isLoggedIn = false;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String String) {
        this.password = password;
    }

    public boolean getIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsloggedInTrue() {
        this.isLoggedIn = true;
    }

    public void setIsloggedInFalse() {
        this.isLoggedIn = false;
    }

    public List<Post> getFavourites() {
        return favourites;
    }

    public void setFavourites(List<Post> favourites) {
        this.favourites = favourites;
    }
}
