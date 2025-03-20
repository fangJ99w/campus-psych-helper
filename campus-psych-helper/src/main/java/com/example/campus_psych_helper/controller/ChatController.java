package com.example.campus_psych_helper.controller;

import com.example.campus_psych_helper.entity.ChatRecord;
import com.example.campus_psych_helper.repository.ChatRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private ChatRecordRepository chatRecordRepository;

    @PostMapping("/send")
    public ChatRecord sendMessage(@RequestBody ChatRecord chatRecord) {
        return chatRecordRepository.save(chatRecord);
    }
}