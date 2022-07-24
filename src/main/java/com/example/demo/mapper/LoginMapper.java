package com.example.demo.mapper;

import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LoginMapper {
    @Select("select * from users")
    List<User> loginIS();
}
