package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.Student;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lxl
 * @date 2023/7/12 16:26
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
