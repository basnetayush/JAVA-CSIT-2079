package com.texas.professional.dto;

import com.texas.professional.enums.Role;
import com.texas.professional.model.User;

public class UserDto {
    private Integer id;

    private String username;

    private String password;

    private String fullName;

    private String address;

    private Role role;

    public UserDto(User user){
        this.id = user.getId();
        this.username = user.getUsername();
        this.fullName = user.getFullName();
        this.address = user.getAddress();
        this.role = user.getRole();
    }

    public UserDto() {
    }

    public UserDto(Integer id, String username, String password, String fullName, String address, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
