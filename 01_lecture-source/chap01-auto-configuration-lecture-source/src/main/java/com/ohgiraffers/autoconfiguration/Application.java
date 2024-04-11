package com.ohgiraffers.autoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {		// Application 하위 스캔		// ComponentScan 으로 위치 지정 스캔
		SpringApplication.run(Application.class, args);
	}

}
