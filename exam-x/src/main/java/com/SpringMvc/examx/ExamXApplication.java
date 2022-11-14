package com.SpringMvc.examx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ExamXApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamXApplication.class, args);
	}

}
