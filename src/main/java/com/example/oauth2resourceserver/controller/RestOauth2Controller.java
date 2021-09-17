package com.example.oauth2resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("resource")
public class RestOauth2Controller {


    @GetMapping(path = "/list")
    public List<String> getProducts() {
        return Arrays.asList("Mazda","Toyota","Audi");
    }

}
