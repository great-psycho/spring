package com.sparta.spring_04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // 시간 자동 변경이 가능하도록 합니다.
//@ServletComponentScan
public class Spring04Application {
	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);
	}
}