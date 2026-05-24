package com.shoefinder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoefinder.domain.User;
import com.shoefinder.repository.UserRepository;
import com.shoefinder.repository.ShoeRepository;

@Service
public class UserService {
    private final UserRepository repository;
    private final ShoeRepository shoeRepository;

    public UserService (UserRepository repository, ShoeRepository shoeRepository){
        this.repository = repository;
        this.shoeRepository = shoeRepository;
    }

    public User addUser(User user){
        return repository.save(user);
    }

    public List<User> getUsers (){
        return repository.findAll();
    }

    public User getUserById (Long id){
        return repository.findById(id)
                                    .orElseThrow(()-> new RuntimeException("ID " + id + " not found"));
    }

    public User editUser (Long id, UserEditRequest request){
        User user = getUserById(id);

        request.name().ifPresent(user::setName);
        request.email().ifPresent(user::setEmail);
        request.username().ifPresent(user::setUsername);
        request.password().ifPresent(user::setPassword);

        return repository.save(user);
    }

    public void addFavorite (Long userId, Long shoeId){
        User user = getUserById(userId);

        Shoe shoe = shoeRepository.getShoeById(shoeId).orElseThrow();

        user.setFavorites().add(shoe);

        repository.save(user);
    }

    public void removeFavorite (Long userId, Long shoeId){
        User user = getUserById(userId);

        Shoe shoe = shoeRepository.getShoeById(shoeId).orElseThrow();

        user.setFavorites().remove(shoe);

        repository.save(user);
    }

    public Set<Shoe> getFavorites (Long userId){
        User user = getUserById(userId);
        
        return user.getFavorites();
    }

    }
}
