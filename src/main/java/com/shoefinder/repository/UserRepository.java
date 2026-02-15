package com.shoefinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shoefinder.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
