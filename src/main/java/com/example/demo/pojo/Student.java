package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lxl
 * @date 2023/7/12 16:26
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("student")
public class Student {
    private long id;
    private String number;
    private String name;
    private int age;
    private int chi;
    private int math;
    private int eng;

}
