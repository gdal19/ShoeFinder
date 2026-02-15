package com.shoefinder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/shoes")
public class ShoeController {

    @GetMapping
    public ShoeResponse getShoes() {
        return "List of shoes";
    }

    @GetMapping("/{id})
    public ShoeResponse getShoeById(@PathVariable int id) {
        return "shoe";
    }

    @PostMapping
    public ShoeResponse addShoe(){
        return "shoe id: ";
    }

    @PatchMapping("/{id}")
    public ShoeResponse editShoe(){
        return "shoe edited";
    }
}
