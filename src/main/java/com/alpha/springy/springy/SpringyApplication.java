package com.alpha.springy.springy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringyApplication.class, args);
	}
	private  static String hello() {
		return "hello world";
	}
}
