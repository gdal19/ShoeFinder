package com.shoefinder.service;

import org.springframework.stereotype.Service;

import com.shoefinder.domain.User;
import com.shoefinder.repository.UserRepository;


@Service
public class AuthService {
    private final UserRepository repository;

    public AuthService (UserRepository repository){
        this.repository = repository;
    }

    public User checkLogin (LoginRequest request){
        User user = repository.findByUsername(username);

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        if (!user.getPassword().equals(request.password)){
            throw new RuntimeException("Wrong password");
        }

        return user;
    }
}
