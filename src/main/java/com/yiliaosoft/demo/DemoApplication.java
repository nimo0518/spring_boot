package com.yiliaosoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//1、
		SpringApplication.run(DemoApplication.class, args);
		/*SpringApplication springApplication = new SpringApplication(DemoApplication.class);
		Map<String,Object> defaultMap = new HashMap<>();
		defaultMap.put("name","mmmmmmm");
		defaultMap.put("port","9999");
		springApplication.setDefaultProperties(defaultMap);
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);*/
	}
}
