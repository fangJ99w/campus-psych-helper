package com.example.campus_psych_helper.repository;

import com.example.campus_psych_helper.entity.ChatRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ChatRecordRepository extends JpaRepository<ChatRecord, Long> {
    List<ChatRecord> findByUserId(Long userId); // 根据用户 ID 查找聊天记录
}