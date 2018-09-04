package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MicrocConsumeHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrocConsumeHystrixApplication.class, args);
	}
}
