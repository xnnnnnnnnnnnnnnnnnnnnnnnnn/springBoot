package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.mapper.RegisterMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//注册
@RestController
@RequestMapping("/Register")
public class RegisterController{
    @Autowired
    private RegisterMapper registerMapper;

    @RequestMapping("/OK")
    public String Register(@RequestBody User user) {
       if(registerMapper.SameName(user.get用户名())) return "该名称已被注册";
       if(user.get密码().length()<8) return "密码长度不得小于8";
       registerMapper.Register(user);
       return "创建成功";
    }
}
