package com.example.app.domain.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter, Setter, toString을 생성하고 Equal도 생성함
@NoArgsConstructor
@AllArgsConstructor
public class MemoDto {
	private String id;
	private String memo;
	private String writer;

//	private String datetime;
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime datetime;
}
