package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lxl
 * @date 2023/7/13 14:46
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
