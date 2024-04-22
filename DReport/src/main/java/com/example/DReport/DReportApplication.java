package com.example.DReport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)

public class DReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(DReportApplication.class, args);
	}

}
