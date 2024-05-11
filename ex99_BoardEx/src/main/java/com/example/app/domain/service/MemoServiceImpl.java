package com.example.app.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.app.domain.dto.MemoDto;
import com.example.app.domain.mapper.MemoMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemoServiceImpl {
	
//	@Autowired
//	private MemoDaoImpl memoDaoImpl;
//	
//	public boolean memoRegistration(MemoDto memoDto) {
//		memoDaoImpl.Insert(memoDto);
//		return true;
//	}
	
	// Dao를 거치지 않고 바로 Mapper로 이동
	@Autowired
	private MemoMapper memoMapper;
	
	public boolean memoRegistration(MemoDto memoDto) {
		memoMapper.Insert(memoDto);
		return true;
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void addMemoTx(MemoDto memoDto) {
		log.info("MemoService addMemoTx() invoke");
		memoMapper.Insert(memoDto);	// Rollback X
		log.info(memoDto.toString());
		memoDto.setId(memoDto.getId()-1);
		memoMapper.Insert(memoDto);	// PK중복오류발생
	}
}
