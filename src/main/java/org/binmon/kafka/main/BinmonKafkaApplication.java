package org.binmon.kafka.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.binmon.kafka.controller","org.binmon.kafka.swagger"})
public class BinmonKafkaApplication {

    
	public static void main(String[] args) {
		SpringApplication.run(BinmonKafkaApplication.class, args);
	}

	
}
	