package com.example.demo.controller;

import com.example.demo.mapper.ModifyQuestionMapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modify")
public class ModifyQuestionController implements ModifyQuestionMapper {

    @Override
    @RequestMapping("/add")
    public boolean addquestion(@RequestBody int 题号,@RequestBody String 用户名) {
        return true;
    }

    @Override
    @RequestMapping("/del")
    public boolean delequestion(@RequestBody int 题号,@RequestBody String 用户名) {
        return true;
    }
}
