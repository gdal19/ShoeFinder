package com.shoefinder.mapper;

import org.springframework.stereotype.Component;

import com.shoefinder.domain.Shoe;
import com.shoefinder.dto.ShoeResponse;

@Component
public class ShoeMapper {

    public ShoeResponse toResponse (Shoe shoe){
        return new ShoeResponse(
            shoe.getId(),
            shoe.getName(),
            shoe.getBrand(),
            shoe.getColor(),
            shoe.getPrice(),
            shoe.getReleaseDate()
        );
    }
}
