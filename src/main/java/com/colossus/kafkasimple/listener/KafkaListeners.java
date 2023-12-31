package com.colossus.kafkasimple.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "colossus", groupId = "groupId")
    void listener(String data) {
        System.out.printf("Listener received -> %s%n", data);
    }
}
