package com.texas.professional.service;

import com.texas.professional.dto.BikeDto;
import com.texas.professional.exception.ResourceNotFoundException;
import com.texas.professional.model.Bike;
import com.texas.professional.model.User;
import com.texas.professional.repo.BikeRepo;
import com.texas.professional.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BikeServiceImpl implements BikeService {
    @Autowired
    private BikeRepo bikeRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public void saveBike(BikeDto bikeDto) {
        Bike bike = new Bike();
        bike.setName(bikeDto.getName());
        bike.setCc(bikeDto.getCc());
        User user = userRepo.findById(bikeDto.getUserId())
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        bike.setUser(user);
        bikeRepo.save(bike);
    }

    @Override
    public List<BikeDto> getBikeListByUserId(Integer userId) {
        List<Bike> bikeList = bikeRepo.findBikeByUserId(userId);
        List<BikeDto> bikeDtoList = bikeList.stream()
                .map(bike -> new BikeDto(bike))
                .collect(Collectors.toList());
        return bikeDtoList;
    }
}
