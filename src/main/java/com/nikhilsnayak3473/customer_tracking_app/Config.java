package com.nikhilsnayak3473.customer_tracking_app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.nikhilsnayak3473.customer_tracking_app")
public class Config {
	
	@Bean
	public EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("customer-tracking-app");
	}
	
	@Bean 
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		return new InternalResourceViewResolver("/view/", ".jsp");
	}

}
