package com.example.demo.controller;

import com.example.demo.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    // 测试接口：获取用户信息
    @GetMapping("/{id}")
    public Result<String> getUser(@PathVariable Long id) {
        return Result.success("查询成功，用户ID：" + id);
    }

    // 登录接口（放行，无需 Token）
    @GetMapping("/login")
    public Result<String> login() {
        return Result.success("登录成功");
    }
}
