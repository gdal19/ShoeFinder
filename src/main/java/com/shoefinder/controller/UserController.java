package com.shoefinder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping
public class UserController {

    @GetMapping
    public UserResponse getUsers(){

    }

    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable int id){

    }

    @PostMapping
    public UserResponse addUser(){

    }

    @PatchMapping
    public UserResponse editUser(){

    }

    @DeleteMapping
    public UserResponse deleteUser(){
        
    }
    



}
