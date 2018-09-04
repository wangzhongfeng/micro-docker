package com.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MicrocConsumeApplication {

//	@Autowired
//	private RestTemplateBuilder builder;

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
//		return builder.build();
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MicrocConsumeApplication.class, args);
	}
}
