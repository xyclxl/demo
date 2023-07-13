package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.User;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author lxl
 * @date 2023/7/12 16:30
 */
@RestController
//解决跨域的问题
@CrossOrigin(origins = {"*","null"})
@SuppressWarnings("all")
public class StudentController {

    @Resource
    private StudentMapper studentMapper;
    private Gson gson = new Gson();

    @GetMapping("students")
    public String getStudent(){
        List<Student> students = studentMapper.selectList(null);
        return gson.toJson(students);
    }

    @PostMapping("add")
    public void addStudent(@RequestBody Student student){
        studentMapper.insert(student);
    }

    @PostMapping("delete")
    public void deleteStudent(@RequestBody Student student){
        studentMapper.deleteById(student.getId());
    }

    @PostMapping("update")
    public void updateStudent(@RequestBody Student student){
        studentMapper.updateById(student);
    }

    @PostMapping("search")
    public String SearchStudent(@RequestBody HashMap<String,String> data ){
        String name = data.get("name");
        QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
        studentQueryWrapper.like("name",name);
        List<Student> students = studentMapper.selectList(studentQueryWrapper);
        return gson.toJson(students);
    }
}
