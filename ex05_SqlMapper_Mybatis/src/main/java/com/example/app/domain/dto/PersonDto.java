package com.example.app.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 의존 주입
/*
@Getter
@Setter
@ToString
*/
@Data // Getter, Setter, toString을 생성하고 Equal도 생성함
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDto {
	private String name;
	private int age;
	private String addr;
}
