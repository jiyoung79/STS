package com.example.app.domain.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Builder
public class MemoDto {
	
//	@Min(value=10,message="최소 숫자는 10이상 이어야합니다.")
//	@Max(value=1000,message="최대 숫자는 1000이하 이어야합니다.")
	@NotNull(message="Id를 입력하세요")
	private Integer id;
	
	@NotBlank(message="Text를 입력하세요.")
	private String text;
	
}
