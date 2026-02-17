package com.shoefinder.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.shoefinder.repository.ShoeRepository;
import com.shoefinder.domain.Shoe;

@Service
public class ShoeService {

    private final ShoeRepository repository;

    public ShoeService (ShoeRepository repository){
        this.repository = repository;
    }

    public Shoe addShoe(Shoe shoe){
        return repository.save(shoe); 
    }

    public List<Shoe> getShoes(){
        return repository.findAll();
    }
}
