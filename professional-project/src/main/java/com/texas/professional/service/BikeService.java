package com.texas.professional.service;

import com.texas.professional.dto.BikeDto;
import com.texas.professional.model.Bike;

import java.util.List;

public interface BikeService {
    void saveBike(BikeDto bikeDto);
    List<BikeDto> getBikeListByUserId(Integer userId);
}
