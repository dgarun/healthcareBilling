package com.healthcare.billing;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import liquibase.integration.spring.SpringLiquibase;

@SpringBootApplication 
public class LiquibaseApplication{

	public static void main(String[] args) {
		SpringApplication.run(LiquibaseApplication.class, args);
	}
	
	@Bean
	public SpringLiquibase liquibase() {
	    SpringLiquibase liquibase = new SpringLiquibase();
	    liquibase.setChangeLog("classpath:liquibase/db/master.xml");
	    liquibase.setDataSource(dataSource());
	    return liquibase;
	}
	
	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	@Primary
	public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	}
}
