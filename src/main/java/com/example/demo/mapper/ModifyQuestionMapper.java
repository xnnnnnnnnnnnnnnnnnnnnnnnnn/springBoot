package com.example.demo.mapper;

import com.example.demo.dao.ModifyQuestion;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ModifyQuestionMapper {
    //判断是否存在
    @Select("select * from title where 题号=#{题号} and 用户名=#{用户名}")
    boolean Isquestion(int 题号, String 用户名);

    //添加题
    @Insert("insert into title(题号,用户名) value(#{题号},#{用户名})")
    boolean addquestion(int 题号,String 用户名);

    //删除题
    @Delete("delete from title where 题号=#{题号} and 用户名=#{用户名}")
    boolean delequestion(int 题号,String 用户名);
}
