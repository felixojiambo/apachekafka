package com.zep.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaApplication.class, args);
		System.out.println("Apache Kafka");
	}

}
