package com.shoefinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shoefinder.domain.Shoe;

public interface ShoeRepository extends JpaRepository<Shoe, Long>{

}
