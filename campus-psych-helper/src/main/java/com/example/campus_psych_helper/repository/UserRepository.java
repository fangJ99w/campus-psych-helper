package com.example.campus_psych_helper.repository;

import com.example.campus_psych_helper.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username); // 根据用户名查找用户
}