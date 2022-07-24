package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/login")
@ResponseBody //返回json数据格式
@Controller
public class LoginController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/Is")
    public boolean LoginIs(@RequestBody String name,@RequestBody String password){  //前端需要使用post方式提交
        List<User> list=userMapper.findAll();
        for (User user1:list){
            System.out.println(user1);
            if(name.equals(user1.get用户名()) && user1.get密码().equals(password)){
                return true;
            }
        }
        return false;
    }
}
