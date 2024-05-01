package com.zep.kafka.producer;

import com.zep.kafka.payload.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {
    private  final KafkaTemplate<String,Student> kafkaTemplate;
    public void sendMessage(Student student){
       Message<Student> message= MessageBuilder
               .withPayload(student)
               .setHeader(KafkaHeaders.TOPIC,"zep")
               .build();
       kafkaTemplate.send(message);
    }
}
