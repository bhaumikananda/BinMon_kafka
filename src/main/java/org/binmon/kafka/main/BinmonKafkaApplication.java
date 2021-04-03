package org.binmon.kafka.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BinmonKafkaApplication {

	public static void main(String[] args) {
		//String bootStrapServer = "localhost:9092";
		SpringApplication.run(BinmonKafkaApplication.class, args);
	}

}
	