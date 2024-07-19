package com.texas.professional.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bike")
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bike_seq")
    @SequenceGenerator(name = "bike_seq",allocationSize = 1,initialValue = 1,sequenceName = "bike_seq" )
    private Integer id;

    private String name;

    private String cc;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Bike() {
    }

    public Bike(Integer id, String name, String cc, User user) {
        this.id = id;
        this.name = name;
        this.cc = cc;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
