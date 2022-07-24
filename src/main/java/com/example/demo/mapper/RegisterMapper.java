package com.example.demo.mapper;

import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface RegisterMapper {
    @Select("select * from users where 用户名=#{用户名}")
    boolean SameName(String 用户名);

    @Insert("insert into users value(#{用户名},#{密码},#{模式},#{邮箱},#{性别})")
    String Register(User user);
}
