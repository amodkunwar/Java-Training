//package com.example.demo.exception;
//
//import java.util.Arrays;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.ParameterBuilder;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.schema.ModelRef;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@EnableSwagger2
//@Configuration
//public class SwaggerConfig {
//	
//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
//				.apis(RequestHandlerSelectors.basePackage("com.amod.example")).build()
//				.globalOperationParameters(Arrays.asList(new ParameterBuilder()
//						.name("Token")
//						.description("The Generated token")
//						.modelRef(new ModelRef("string"))
//						.parameterType("header")
//						.required(true)
//						.build(),
//						new ParameterBuilder()
//						.name("Service")
//						.description("Service")
//						.modelRef(new ModelRef("string"))
//						.parameterType("header")
//						.required(true)
//						.build()));
//				
//	}
//	
//	public ApiInfo apiInfo() {
//		return new ApiInfoBuilder()
//				.title("Swagger Page")
//				.description("Swagger description")
//				.version("1.0")
//				.build();
//	}
//	
//}
