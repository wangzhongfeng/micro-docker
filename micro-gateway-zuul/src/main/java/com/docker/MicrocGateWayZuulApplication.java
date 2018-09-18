package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicrocGateWayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrocGateWayZuulApplication.class, args);
	}
}
