package com.edugroupe.meslectures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MeslecturesFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeslecturesFormApplication.class, args);
	}

}
