package com.ozx.springcloudmemberservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudMemberServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudMemberServiceApplication.class, args);
	}

}
