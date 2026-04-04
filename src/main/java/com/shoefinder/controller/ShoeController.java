package com.shoefinder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoefinder.dto.ShoeEditRequest;
import com.shoefinder.dto.ShoeResponse;
import com.shoefinder.mapper.ShoeMapper;
import com.shoefinder.service.ShoeService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/shoes")
public class ShoeController {

    private final ShoeService service;
    private final ShoeMapper mapper;

    public ShoeController (ShoeService service, ShoeMapper mapper){
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<ShoeResponse> getShoes() {
        return mapper.toResponseList(service.getShoes());
    }

    @GetMapping("/{id}")
    public ShoeResponse getShoeById(@PathVariable Long id) {
        return mapper.toResponse(service.getShoeById(id));
    }

    @PostMapping
    public ShoeResponse addShoe(Shoe shoe){
        return mapper.toResponse(service.addShoe(shoe));
    }

    @PatchMapping("/{id}")
    public ShoeResponse editShoe(@PathVariable Long id, @RequestBody ShoeEditRequest request){
        return mapper.toResponse(service.editShoe(id, request));
    }
}
