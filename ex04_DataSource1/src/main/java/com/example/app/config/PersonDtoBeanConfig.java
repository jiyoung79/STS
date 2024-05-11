package com.example.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.app.domain.dto.PersonDto;

@Configuration
public class PersonDtoBeanConfig {
	
	@Bean
	public PersonDto person03() {
		return PersonDto.builder()
				.name("철수")
				.addr("서울")
				.age(22)
				.build();
	}
	
	@Bean(name = "personBean")
	public PersonDto person04() {
		return PersonDto.builder()
				.name("맹구")
				.addr("인천")
				.age(23)
				.build();
	}
}
