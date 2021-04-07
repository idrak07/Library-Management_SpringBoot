package com.libray.mng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping("")
    public String index(){
        return "Welcome to the Library Management";
    }
}
