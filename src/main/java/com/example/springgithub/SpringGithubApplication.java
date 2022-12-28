package com.example.springgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringGithubApplication extends SpringBootServletInitializer {

	
	@Override  
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)   
	{  
	return application.sources(SpringGithubApplication.class);  
	}  
	
	public static void main(String[] args) {
		SpringApplication.run(SpringGithubApplication.class, args);
	}

}
