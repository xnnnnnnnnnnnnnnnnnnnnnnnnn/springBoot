package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/hello")
@ResponseBody //必须得加，将数据转换程json并显示
public class Helloword {
    @Autowired ////类似于geiset方法的注解
    private UserMapper userMapper;
    @RequestMapping("/word")
    public String Hello(){
        return "Hello Word!";
    }
    @RequestMapping("/User")
    public List<User> UserController(){
        List<User> list= userMapper.findAll();
        return list;
    }

}
