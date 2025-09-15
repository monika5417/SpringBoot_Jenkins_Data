package com.example.springbootmysqldocker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootMysqlDockerApplication extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlDockerApplication.class, args);
	}

}
