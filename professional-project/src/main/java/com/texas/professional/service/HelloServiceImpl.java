package com.texas.professional.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello World";
    }
}
