package com.spring.starter.helloworld.controller;

import com.spring.starter.helloworld.dto.SendMessage;
import com.spring.starter.helloworld.entity.Message;
import com.spring.starter.helloworld.service.MessagesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/messages", produces = APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class MessagesController {


    @Autowired
    private MessagesService messagesService;

    @GetMapping
    public @ResponseBody List<Message> list() {
        System.out.println("????????");
        return messagesService.list();
    }

    @PostMapping
    public @ResponseBody Message send(@RequestBody SendMessage sendMessage) {
        System.out.println("------");
        return messagesService.create(sendMessage);
    }
}
