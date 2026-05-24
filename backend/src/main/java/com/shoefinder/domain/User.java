package com.shoefinder.domain;
import java.util.HashSet;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    private Long id;
    private String username;
    private String name;
    private String email;
    private String password;

    @ManyToMany
    @JoinTable(
        name = "user_favorites",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "shoe_id")
    )

    private Set<Shoes> favorites =  new HashSet<>();
    

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Set<Shoes> getFavorites() {
        return favorites;
    }
    public void setFavorites(Set<Shoes> favorites) {
        this.favorites = favorites;
    }
    
}
