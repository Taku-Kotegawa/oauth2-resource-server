package com.example.oauth2resourceserver.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
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

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        auth.getAuthorities().stream().forEach(f -> {
            System.out.println(f.getAuthority());
        });

        return Arrays.asList("Mazda","Toyota","Audi");
    }

}
