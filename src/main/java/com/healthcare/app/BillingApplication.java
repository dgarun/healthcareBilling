package com.healthcare.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.healthcare")
@EnableAutoConfiguration
public class BillingApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BillingApplication.class, args);
	}
  
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BillingApplication.class);
	}
}
