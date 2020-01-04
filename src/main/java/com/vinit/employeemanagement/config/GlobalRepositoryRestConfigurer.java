package com.vinit.employeemanagement.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.vinit.employeemanagement.model.Employee;

@Configuration
public class GlobalRepositoryRestConfigurer implements RepositoryRestConfigurer {

	@Value("${corsConfig.base-pattern}")
	private String CORS_BASE_PATTERN;

	@Value("${corsConfig.allowed-origins}")
	private String ALLOWED_ORIGINS;

	@Value("${corsConfig.allowed-methods}")
	private String ALLOWED_METHODS;

	@Value("${corsConfig.allowed-headers}")
	private String ALLOWED_HEADERS;

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		config.exposeIdsFor(Employee.class);

		config.getCorsRegistry()//
				.addMapping(CORS_BASE_PATTERN)//
				.allowedOrigins(ALLOWED_ORIGINS)//
				.allowedHeaders(ALLOWED_HEADERS)//
				.allowedMethods(ALLOWED_METHODS);
	}

}