package com.texas.professional.controller;

import com.texas.professional.dto.UserDto;
import com.texas.professional.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public String saveUser(@RequestBody UserDto userDto){
        userService.saveUser(userDto);
        return "success";
    }

    @GetMapping("/id/{id}")
    public UserDto getUserById(@PathVariable("id") Integer id){
        return userService.getById(id);
    }

    @GetMapping("/list")
    public List<UserDto> getAll(){
        return userService.getAllUsers();
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserDto userDto){
       userService.updateUser(userDto);
        return "Updated Successfully";
    }

}
