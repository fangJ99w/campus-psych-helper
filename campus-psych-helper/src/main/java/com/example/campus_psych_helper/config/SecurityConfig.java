//package com.example.campus_psych_helper.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable()) // 禁用 CSRF 保护（适用于 API 项目）
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/api/users/register").permitAll() // 允许无需认证的路径
//                        .anyRequest().authenticated() // 其他请求需要认证
//                )
//                .httpBasic(basic -> {}); // 使用 HTTP Basic 认证
//
//        return http.build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder(); // 使用 BCrypt 加密密码
//    }
//}