package com.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics="Kafka_Example" ,groupId="mygroup")
	public void consume(String msg) {
		System.out.println("Consumed Mesage: "+ msg);
	}

}
