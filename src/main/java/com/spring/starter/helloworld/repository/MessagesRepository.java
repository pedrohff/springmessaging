package com.spring.starter.helloworld.repository;

import com.spring.starter.helloworld.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Message, Long> {
}
