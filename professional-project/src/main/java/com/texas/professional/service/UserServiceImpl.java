package com.texas.professional.service;

import com.texas.professional.dto.UserDto;
import com.texas.professional.exception.ResourceNotFoundException;
import com.texas.professional.model.User;
import com.texas.professional.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setAddress(userDto.getAddress());

        String rawPassword = userDto.getPassword();
        String encodedPassword = passwordEncoder.encode(rawPassword);
        user.setPassword(encodedPassword);

        user.setFullName(userDto.getFullName());
        user.setRole(userDto.getRole());
        userRepo.save(user);
    }

    @Override
    public UserDto getById(Integer id) {
        Optional<User> userOptional = userRepo.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            // convert to user dto
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setFullName(user.getFullName());
            userDto.setAddress(user.getAddress());
            userDto.setUsername(user.getUsername());
            userDto.setRole(user.getRole());
            return userDto;
        } else {
            throw new ResourceNotFoundException("User not found");
        }
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = userRepo.findAll();
//        List<UserDto> userDtoList=new ArrayList<>();
//        for (User user:userList){
//            UserDto userDto = new UserDto(user);
//            userDtoList.add(userDto);
//        }

        List<UserDto> userDtoList = userList.stream()
                .map(user -> new UserDto(user))
                .collect(Collectors.toList());
        return userDtoList;
    }

    /*
    * room add garne bela ma OWNER le matra garna paunu paryo
    * */




    @Override
    public void updateUser(UserDto userDto) {
        // fetch my details to update
        Integer id = userDto.getId();
        User user = getUser(userDto.getId());
        // update detail
        user.setFullName(userDto.getFullName());
        user.setAddress(userDto.getAddress());
        user.setUsername(userDto.getUsername());
        // save
        userRepo.save(user);
    }

    public User getUser(Integer id){
        return userRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }


}
