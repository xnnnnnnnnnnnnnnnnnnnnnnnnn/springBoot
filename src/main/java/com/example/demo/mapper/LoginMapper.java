package com.example.demo.mapper;

import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    @Select("select * from users")
     String loginIS(String name,String password);
}
