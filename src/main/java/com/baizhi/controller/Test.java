package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("User")
public class Test {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("test")
    public void Test() {

        List<User> userList = userMapper.selectAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
