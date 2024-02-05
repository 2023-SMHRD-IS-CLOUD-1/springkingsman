package com.kingsman.myapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
	// Spring Boot 에서 설정들을 구현하기 편하게 인터페이스 제공

	// 직면한 문제에 따라서, 메소드를 오버라이딩해서 설정
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") // 어떤 URL에 대해서 설정을 할 것인지
				.allowedOrigins("*"); // 어떤 사용자들에게 요청을 허용하는지
	
	}

}
