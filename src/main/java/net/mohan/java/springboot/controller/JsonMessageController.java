package net.mohan.java.springboot.controller;

import net.mohan.java.springboot.kafka.JsonKafkaProducer;
import net.mohan.java.springboot.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;


    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
@PostMapping("/publishMessage")
    public ResponseEntity<String> publish(@RequestBody User usr){
        kafkaProducer.sendMessage(usr);
        return ResponseEntity.ok("JSON message sent to Kafka topic");
    }
}
