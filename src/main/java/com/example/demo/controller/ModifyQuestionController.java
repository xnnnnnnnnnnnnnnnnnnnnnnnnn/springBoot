package com.example.demo.controller;

import com.example.demo.mapper.ModifyQuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modify")
public class ModifyQuestionController{
    @Autowired
    private ModifyQuestionMapper modifyQuestionMapper;

    @RequestMapping("/add")
    public boolean addquestion(@RequestBody int 题号,@RequestBody String 用户名) {
        if(modifyQuestionMapper.Isquestion(题号, 用户名)) return false;
        else modifyQuestionMapper.addquestion(题号, 用户名);
        return true;
    }

    @RequestMapping("/del")
    public boolean delequestion(@RequestBody int 题号,@RequestBody String 用户名) {
        if(modifyQuestionMapper.Isquestion(题号, 用户名))  modifyQuestionMapper.delequestion(题号, 用户名);
        return true;
    }
}
