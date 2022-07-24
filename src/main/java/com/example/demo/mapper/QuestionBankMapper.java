package com.example.demo.mapper;

import com.example.demo.dao.Question;
import com.example.demo.dao.QuestionTitle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionBankMapper {
    //每门课程总题目
    @Select("select 题号,考点 from questionbank where 课程=#{课程}")
    List<QuestionTitle> AllQuestionBank(String 课程);
    //每题答案
    @Select("select 答案 from questionbank where 题号=#{题号}")
    String Answer(int 题号);
    //错题集
    @Select("select 题号,标签,考点,答案 from questionbank where 题号 in (select * from title where #{用户名}=用户名 and 课程=#{课程})")
    List<Question> WrongQuestionBank(String 用户名,String 课程);
    //题号搜题
    @Select("select 题号,考点 from questionbank where 题号=#{题号}")
    List<QuestionTitle> ServerByNumber(int 题号);
}
