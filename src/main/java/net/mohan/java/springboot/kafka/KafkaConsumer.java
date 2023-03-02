package net.mohan.java.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaListener.class);
    @KafkaListener (topics="javaideas", groupId = "myGroup")
    public void consume(String message){
        LOGGER.info(" Message recieved "+ message);

    }
}
