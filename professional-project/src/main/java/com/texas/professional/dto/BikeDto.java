package com.texas.professional.dto;

import com.texas.professional.model.Bike;

public class BikeDto {
    private Integer id;

    private String name;

    private String cc;

    private Integer userId;

    private String ownerName;

    public BikeDto(Bike bike){
        this.id = bike.getId();
        this.name = bike.getName();
        this.cc = bike.getCc();
        this.userId = bike.getUser().getId();
        this.ownerName=bike.getUser().getFullName();
    }

    public BikeDto(Integer id, String name, String cc, Integer userId) {
        this.id = id;
        this.name = name;
        this.cc = cc;
        this.userId = userId;
    }

    public BikeDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
