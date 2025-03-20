package com.example.campus_psych_helper.service;

import com.example.campus_psych_helper.entity.User;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    /**
     * 用户注册
     * @param user 用户信息
     * @return 注册结果
     */
    ResponseEntity<?> registerUser(User user);

    /**
     * 用户登录
     * @param user 用户信息
     * @return 登录结果
     */
    ResponseEntity<?> loginUser(User user);
}
