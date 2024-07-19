package com.texas.professional.controller;

import com.texas.professional.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    /*
    * Handling User Input in GET
    * 1. RequestParam (Query Param, Param)
    *  /hello?message=Hello World
    *
    * 2. Path Variable /student/{id}
    * /student/1
    * /student/2
    * */

    @GetMapping("/hello-service")
    public String callHelloService(){
        return helloService.sayHello();
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String message){
        return "Hello !" +message;
    }

    @GetMapping("/student/{id}")
    public String getStudentById(@PathVariable Integer id,@RequestParam String name){
        return "Student with id: "+id +" and name: "+name;
    }
}
