package com.example.demo.controller;

import com.example.demo.dao.Question;
import com.example.demo.dao.QuestionTitle;
import com.example.demo.mapper.QuestionBankMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/QuestionBank")
public class QuestionBankController implements QuestionBankMapper {
    @Override
    @RequestMapping("/all")
    public List<QuestionTitle> AllQuestionBank(String 课程) {
        return null;
    }

    @Override
    @RequestMapping("/answer")
    public String Answer(int 题号) {
        return null;
    }

    @Override
    @RequestMapping("/wrong")
    public List<Question> WrongQuestionBank(String 用户名,String 课程) {
        return null;
    }

    @Override
    @RequestMapping("/server")
    public List<QuestionTitle> ServerByNumber(int 题号) {
        return null;
    }
}
