package com.grade.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.grade.controller"})
public class configclass {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		//vr.setPrefix("/WEB-INF");
		vr.setSuffix(".jsp");
		return vr;
	}
}
