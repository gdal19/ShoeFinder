package backend.src.main.java.com.shoefinder.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shoefinder.service.AuthService;
import com.shoefinder.mapper.AuthMapper;
import com.shoefinder.dto.LoginRequest;
import com.shoefinder.dto.LoginResponse;


@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {
    
    private final AuthService service;
    private final AuthMapper mapper;

    public AuthController (AuthService service, AuthMapper mapper){
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public LoginResponse login(@RequestBody LoginRequest login) {
        
        return mapper.toResponse(service.checkLogin(login));
        
        return entity;
    }
    
}
