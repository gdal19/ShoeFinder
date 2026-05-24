package com.shoefinder.service;

import java.util.Set;

import org.springframework.stereotype.Service;
import com.shoefinder.repository.ShoeRepository;
import com.shoefinder.domain.Shoe;
import com.shoefinder.dto.ShoeEditRequest;

@Service
public class ShoeService {

    private final ShoeRepository repository;

    public ShoeService (ShoeRepository repository){
        this.repository = repository;
    }

    public Shoe addShoe(Shoe shoe){
        return repository.save(shoe); 
    }

    public Set<Shoe> getShoes(){
        return repository.findAll();
    }

    public Shoe getShoeById(Long id){
        return repository.findById(id)
                            .orElseThrow(()-> new RuntimeException("ID " + id + " not found"));
    }

    public Shoe editShoe(Long id, ShoeEditRequest request){
        Shoe shoe = getShoeById(id);

        request.name().ifPresent(shoe::setName);
        request.brand().ifPresent(shoe::setBrand);
        request.color().ifPresent(shoe::setColor);
        request.price().ifPresent(shoe::setPrice);
        request.releaseDate().ifPresent(shoe::setReleaseDate);

        return repository.save(shoe);
    }
}
