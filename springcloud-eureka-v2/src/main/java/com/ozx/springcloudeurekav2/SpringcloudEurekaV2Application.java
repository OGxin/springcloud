package com.ozx.springcloudeurekav2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaV2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaV2Application.class, args);
	}

}
