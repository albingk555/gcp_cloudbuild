package com.example.gcp_cloudbuild.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String sayHello(){
        log.info("executing sayHello method...");
        return "Hi from Albin";
    }
}
