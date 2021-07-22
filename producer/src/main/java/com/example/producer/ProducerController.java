package com.example.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    private final ProducerService producerService;

    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping(value = "send-message", consumes = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<Void> sendMessage(@RequestBody String message) {
        producerService.sendMessage(message);
        return ResponseEntity.ok().build();
    }
}