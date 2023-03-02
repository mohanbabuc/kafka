package net.mohan.java.springboot.kafka;

import net.mohan.java.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "javaideas_Json",groupId = "myGroup")
    public void cosume(User usre){
LOGGER.info(" Json Message recieved"+ usre.toString());
    }
}
