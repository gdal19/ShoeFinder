package com.shoefinder.mapper;

import org.springframework.stereotype.Component;

import com.shoefinder.dto.LoginResponse;
import com.shoefinder.domain.User;

@Component
public class AuthMapper {
    
    public LoginResponse toResponse(User user){
        return new LoginResponse(
                user.getId(),
                user.getName(),
                user.getUsername()
        );
    }
}
