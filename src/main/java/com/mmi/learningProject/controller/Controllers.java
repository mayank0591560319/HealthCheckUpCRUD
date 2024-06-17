package com.mmi.learningProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {


@GetMapping("/mayank")

    public String sayHello(){
        return "helloWorld";
    }

}
