package com.spring.starter.helloworld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    private String senderName;
    private String receiverName;
    private LocalDateTime sentAt;
}
