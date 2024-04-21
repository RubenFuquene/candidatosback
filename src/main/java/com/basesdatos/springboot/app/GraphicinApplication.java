package com.basesdatos.springboot.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basesdatos.springboot.app.dtos.MessageDto;

@SpringBootApplication
public class GraphicinApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphicinApplication.class, args);
	}
}
