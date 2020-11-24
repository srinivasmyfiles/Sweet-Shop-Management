package com.cognizant.sweetitemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableDiscoveryClient
@SpringBootApplication
public class SweetitemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SweetitemServiceApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.cognizant.sweetitemservice")).build();

		// Now you will only find documentation for zuul-gateway-service
		/*
		 * Test : http://localhost:<port no>/swagger-ui.html
		 * http://localhost:<port no>/v2/api-docs
		 */
	}
}
