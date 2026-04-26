package com.shoefinder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoefinder.domain.User;
import com.shoefinder.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService (UserRepository repository){
        this.repository = repository;
    }

    public User addUser(User user){
        return repository.save(user);
    }

    public List<User> getUsers (){
        return repository.findAll();
    }
}
