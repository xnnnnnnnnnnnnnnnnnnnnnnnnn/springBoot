package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class Helloword {
    @RequestMapping("/word")
    public String Hello(){
        return "Hello Word!";
    }
}
