package com.example.app.domain.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.app.domain.dto.BoardDto;

@Repository
public class BoardDaoImpl {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static String namespace="com.example.app.domain.mapper.BoardMapper.";
	
	public BoardDto Insert(BoardDto boardDto) {
		sqlSession.insert(namespace + "Insert", boardDto);
		return boardDto;
	}
}
