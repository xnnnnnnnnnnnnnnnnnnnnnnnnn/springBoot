package com.example.demo;

import com.example.demo.dao.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest //测试类
class DemoApplicationTests {
    @Autowired //类似于geiset方法的注解
    private UserMapper userMapper;

    @Test
    public void testFindAll() {
        List<User> list=userMapper.findAll();
        System.out.println(list);
    }

}
