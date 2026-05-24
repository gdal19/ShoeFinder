package backend.src.main.java.com.shoefinder.mapper;

import com.shoefinder.dto.UserResponse;
import com.shoefinder.domain.User;

public class UserMapper {
    
    public UserResponse toResponse(org.springframework.security.core.userdetails.User user){
        return new UserResponse(
                user.getId(),
                user.getUsername(),
                user.getName()
        )
    }

    public List<UserResponse> toResponseList (List<User> users){
        return users.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }
}
