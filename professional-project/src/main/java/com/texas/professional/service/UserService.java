package com.texas.professional.service;

import com.texas.professional.dto.UserDto;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    UserDto getById(Integer id);
    List<UserDto> getAllUsers();
    void updateUser(UserDto userDto);

}
