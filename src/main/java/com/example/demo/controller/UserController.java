package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lxl
 * @date 2023/7/13 14:47
 */
@RestController
//解决跨域的问题
@CrossOrigin(origins = {"*","null"})
@SuppressWarnings("all")
public class UserController {
    @Resource
    private UserMapper userMapper;

    @PostMapping("login")
    public String loginUser(@RequestBody User user){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.setEntity(user);
        User user_selected = userMapper.selectOne(userQueryWrapper);
        if (user_selected == null){
            return "0";
        }
        return "1";
    }

    @PostMapping("register")
    public void UserRegister(@RequestBody User user){
        userMapper.insert(user);
    }


}
