package com.example.MyApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.example.Controller","com.example.Services","com.example.Repository"})
public class MyApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyApplication.class, args);
	}

}
