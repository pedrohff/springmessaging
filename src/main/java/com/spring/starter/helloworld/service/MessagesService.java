package com.spring.starter.helloworld.service;

import com.spring.starter.helloworld.dto.SendMessage;
import com.spring.starter.helloworld.entity.Message;
import com.spring.starter.helloworld.repository.MessagesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MessagesService {

    @Autowired
    private MessagesRepository messagesRepository;


    public List<Message> list() {
        return messagesRepository.findAll();
    }

    public Message create(SendMessage sendMessage) {
        return messagesRepository.save(sendMessage.asMessage());
    }
}
