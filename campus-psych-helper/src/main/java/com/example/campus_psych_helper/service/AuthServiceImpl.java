//package com.example.campus_psych_helper.service;
//
//import com.example.campus_psych_helper.entity.User;
//import com.example.campus_psych_helper.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Map;
//
//@Service // 标记该类为 Service 组件
//public class AuthServiceImpl implements AuthService {
//    private final PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public AuthServiceImpl(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }
//    @Autowired // 自动注入 UserRepository
//    private UserRepository userRepository;
//
//    @Override
//    public ResponseEntity<?> registerUser(User user) {
//        // 检查用户名是否已存在
//        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
//            return ResponseEntity.badRequest().body(Map.of("message", "用户名已存在"));
//        }
//
//        // 检查邮件是否已存在
//        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
//            return ResponseEntity.badRequest().body(Map.of("message", "邮件已存在"));
//        }
//
//        // 对密码进行加密
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//
//        // 保存用户信息到数据库
//        userRepository.save(user);
//
//        // 返回成功响应
//        return ResponseEntity.ok(Map.of("message", "注册成功"));
//    }
//
//    @Override
//    public ResponseEntity<?> loginUser(User user) {
//        // 根据用户名查找用户
//        User existingUser = userRepository.findByUsername(user.getUsername())
//                .orElseThrow(() -> new RuntimeException("用户不存在"));
//
//        // 验证密码
//        if (passwordEncoder.matches(user.getPassword(), existingUser.getPassword())) {
//            return ResponseEntity.ok(Map.of("message", "登录成功"));
//        } else {
//            return ResponseEntity.badRequest().body(Map.of("message", "用户名或密码不正确"));
//        }
//    }
//}
