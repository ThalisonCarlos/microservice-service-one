package com.architecture.microservices.service.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    @GetMapping
    public String getService(){
        return "Service One";
    }

}
