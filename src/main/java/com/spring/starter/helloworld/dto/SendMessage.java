package com.spring.starter.helloworld.dto;

import com.spring.starter.helloworld.entity.Message;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class SendMessage {

    private String content;
    private String senderName;
    private String receiverName;

    public Message asMessage() {
        return new Message(null, this.content, this.senderName, this.receiverName, LocalDateTime.now());
    }
}
