package com.student.studentintroduce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.student.studentintroduce.controller.LocalDateFormatter;

@Configuration
public class NewServletConfig implements WebMvcConfigurer {

	@Override
  	public void addFormatters(FormatterRegistry registry) {

		registry.addFormatter(new LocalDateFormatter());
  	}
  }
