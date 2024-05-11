package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.domain.dto.MemoDto;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/memo")
public class MemoController {
	
	@GetMapping("/add")
	public void memo_get() {
		log.info("GET /memo/add");
	}
	
	@PostMapping("/add")
	public void memo_post(MemoDto memoDto) {
		log.info("POST /memo/add : " + memoDto);
	}
}