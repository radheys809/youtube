package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.example.services.FileStorageProperties;

//https://www.agilegroup.co.jp/technote/springboot-fileupload-error-handling.html
@SpringBootApplication
@EnableConfigurationProperties({ FileStorageProperties.class })
@EnableEurekaServer
public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}