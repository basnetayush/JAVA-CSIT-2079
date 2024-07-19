package com.texas.professional.repo;

import com.texas.professional.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BikeRepo extends JpaRepository<Bike,Integer> {

    List<Bike> findBikeByUserId(Integer userId);
}
