package com.shoefinder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoefinder.dto.UserResponse;
import com.shoefinder.dto.ShoeResponse;
import com.shoefinder.dto.UserEditRequest;
import com.shoefinder.service.UserService;
import com.shoefinder.mapper.UserMapper;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserService service;
    private final UserMapper mapper;
    private final ShoeMapper shoeMapper;

    public UserController (UserService service, UserMapper mapper, ShoeMapper shoeMapper){
        this.service = service;
        this.mapper = mapper;
        this.shoeMapper = shoeMapper;
    }

    @GetMapping
    public UserResponse getUsers(){
        return mapper.toResponseList(service.getUsers);
    }

    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable Long id){
        return mapper.toResponse(service.getUserById(id));
    }

    @PostMapping
    public UserResponse addUser(){
        return mapper.toResponse(service.addUser);
    }

    @PatchMapping("/{id}")
    public UserResponse editUser(@PathVariable Long id, @RequestBody UserEditRequest request){
        return mapper.toResponse(service.editUser(id, request));
    }

    @DeleteMapping
    public UserResponse deleteUser(){

    }
    
    @PostMapping("/{id}/favorites/{shoeId}")
    public ResponseEntity<Void> addFavorite(@PathVariable Long id, @PathVariable Long shoeId){
        service.addFavorite(id, shoeId);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}/favorites/{shoeId}")
    public ResponseEntity<Void> removeFavorite(@PathVariable Long id, @PathVariable Long shoeId){
        service.removeFavorite(id, shoeId);

        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}/favorites")
    public Set<ShoeResponse> getFavorites(@PathVariable Long id){
        return shoeMapper.toResponseList(service.getFavorites());
    }


}
