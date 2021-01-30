package org.binmon.kafka.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BinmonKafkaProducer {

	public static void mainLater(String[] args) {
		String bootStrapServer = "localhost:9092";
		Properties prop = new Properties();
		prop.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapServer);
		prop.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		prop.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		
		KafkaProducer<String, String> binMonProducer = new KafkaProducer<String, String>(prop);
		ProducerRecord<String, String> binMonRec = new ProducerRecord<String, String>("binmon", "Hello All 23 refactor");
		binMonProducer.send(binMonRec);
		binMonProducer.flush();
		binMonProducer.close();
	}
}
	