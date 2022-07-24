package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.mapper.RegisterMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//注册
@RestController
@RequestMapping("/Register")
public class RegisterController implements RegisterMapper {

    @Override
    @RequestMapping("/OK")
    public String Register(@RequestBody User user) {
       return "创建成功";
    }
}
