package com.colossus.kafkasimple;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSimpleApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate) {
		return args ->{
			for (int i = 0; i < 100; i++) {
				kafkaTemplate.send("colossus", "hello from colossus kafka " + i);
			}
		};
	}

}
