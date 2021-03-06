package com.example.demo.mapper;

import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from users")
    List<User> findAll();
}
