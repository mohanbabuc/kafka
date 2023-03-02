package net.mohan.java.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic javaideasTopic(){
        return TopicBuilder.name("javaideas")
                .build();
    }

    @Bean
    public NewTopic javaideasJsonTopic(){
        return TopicBuilder.name("javaideas_Json")
                .build();
    }

}
