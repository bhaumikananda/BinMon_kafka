//package org.binmon.kafka.producer;
//
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class BinmonKafkaProducer {
//
//	private static final String TOPIC = "binmon";
//
//	private KafkaTemplate<String, String> kafkaTemplate;
//
//	public BinmonKafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//		this.kafkaTemplate = kafkaTemplate;
//	}
//
//	public void sendMessage(String message) {
//		this.kafkaTemplate.send(TOPIC, message);
//	}
//
//}
