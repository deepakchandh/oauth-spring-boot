package com.example.oauth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class OauthController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name, Principal user){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello there " +user.getName();
    }
}
