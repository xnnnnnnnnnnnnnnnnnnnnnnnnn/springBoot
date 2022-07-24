package com.example.demo.controller;

import com.example.demo.dao.Question;
import com.example.demo.dao.QuestionTitle;
import com.example.demo.mapper.QuestionBankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/QuestionBank")
public class QuestionBankController  {
    @Autowired
    private QuestionBankMapper questionBankMapper;

    @RequestMapping("/all")
    public List<QuestionTitle> AllQuestionBank(String 课程) {
        return questionBankMapper.AllQuestionBank(课程);
    }


    @RequestMapping("/answer")
    public String Answer(int 题号) {
        return questionBankMapper.Answer(题号);
    }


    @RequestMapping("/wrong")
    public List<Question> WrongQuestionBank(String 用户名,String 课程) {
        return questionBankMapper.WrongQuestionBank(用户名, 课程);
    }

    @RequestMapping("/server")
    public List<QuestionTitle> ServerByNumber(int 题号) {
        return questionBankMapper.ServerByNumber(题号);
    }
}
