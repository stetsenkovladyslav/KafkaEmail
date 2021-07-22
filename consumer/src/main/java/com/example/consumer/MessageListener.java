package com.example.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class MessageListener {

    final private Logger log = LoggerFactory.getLogger(getClass().getName());

    @KafkaListener(topics = "email-events", groupId = "consumer")
    public void listenEmailEvents(String message) {
        log.info("You have a new message: " + message);
    }

}