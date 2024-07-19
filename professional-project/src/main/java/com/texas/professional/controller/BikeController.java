package com.texas.professional.controller;

import com.texas.professional.dto.BikeDto;
import com.texas.professional.dto.UserDto;
import com.texas.professional.service.BikeService;
import com.texas.professional.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bike")
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @PostMapping("/save")
    public String saveUser(@RequestBody BikeDto bikeDto){
        bikeService.saveBike(bikeDto);
        return "success";
    }

    @GetMapping("/user-id/{userId}")
    public List<BikeDto> getBikeListByUserId(@PathVariable Integer userId){
        List<BikeDto> bikeDtoList = bikeService.getBikeListByUserId(userId);
        return bikeDtoList;
    }


}
