package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lxl
 * @date 2023/7/13 14:45
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("user")
public class User {
    private String username;
    private String password;
}
