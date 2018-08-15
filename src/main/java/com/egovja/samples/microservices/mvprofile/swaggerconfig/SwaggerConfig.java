package com.egovja.samples.microservices.mvprofile.swaggerconfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public static final Contact DEFAULT_CONTACT = ApiInfo.DEFAULT_CONTACT;

	@SuppressWarnings("rawtypes")
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("TAJ Mobile Services API", "API for TAJ Mobile App",
			"1.0", "urn:tos", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",
			new ArrayList<VendorExtension>());

	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(
			Arrays.asList("application/json"));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("taj-mobile-api")
				.apiInfo(DEFAULT_API_INFO)
				.select()
					.apis(RequestHandlerSelectors.basePackage("com.egovja.samples.microservices.mvprofile.controller"))
					.paths(PathSelectors.any())
				.build();
					//.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				//.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}
}