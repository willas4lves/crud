package com.api.crud.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }


}
