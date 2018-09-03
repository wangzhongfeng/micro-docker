package com.business.microbusiness;

//import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagement// 开启事务
@MapperScan(basePackages = "com.business.microbusiness.dao")
public class MicroBusinessApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(MicroBusinessApplication.class, args);
	}
}
