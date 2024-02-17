package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getsamosa() {
		return new Samosa();
	}

    @Bean
    public Student getStudent() { // corrected method name to follow Java naming conventions
        return new Student(getsamosa());
    }
}
