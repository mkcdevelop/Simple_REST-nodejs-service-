package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan({"com.hello","com.model","com.controller","com.service"})
public class SpringRestnodeApplication {

	public static void main(String[] args) {
		System.setProperty("server.port","8001");
		SpringApplication.run(SpringRestnodeApplication.class, args);
	}
}
