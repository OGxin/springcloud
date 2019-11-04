package com.ozx.springcloudorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class SpringcloudOrderServiceApplication {

	/**
	 * @EnableFeignClients:开启Feign客户端权限
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudOrderServiceApplication.class, args);
	}

	@Bean
	/**
	 * @LoadBalanced :使RestTemplate在请求时拥有客户端负载均衡能力
	 * 使用rest方式以别名方式进行调用依赖Ribbon负载均衡器
	 */
//	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
