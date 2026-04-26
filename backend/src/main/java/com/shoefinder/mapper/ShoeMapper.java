package com.shoefinder.mapper;

import org.springframework.stereotype.Component;

import com.shoefinder.domain.Shoe;
import com.shoefinder.dto.ShoeResponse;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<ShoeResponse> toResponseList (List<Shoe> shoes){
        return shoes.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }
}
