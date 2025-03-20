package com.example.campus_psych_helper.service;

import com.example.campus_psych_helper.entity.ChatRecord;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ChatService {
    ResponseEntity<?> sendMessage(ChatRecord chatRecord); // 发送消息逻辑
    ResponseEntity<List<ChatRecord>> getChatHistory(Long userId); // 获取聊天记录逻辑
}
