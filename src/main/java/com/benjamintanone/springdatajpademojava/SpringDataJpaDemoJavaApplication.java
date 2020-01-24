package com.benjamintanone.springdatajpademojava;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@Slf4j
public class SpringDataJpaDemoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaDemoJavaApplication.class, args);
	}
}
