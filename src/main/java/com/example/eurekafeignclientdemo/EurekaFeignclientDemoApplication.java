package com.example.eurekafeignclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaFeignclientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignclientDemoApplication.class, args);
	}

}
