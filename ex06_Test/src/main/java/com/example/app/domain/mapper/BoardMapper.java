package com.example.app.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.dto.BoardDto;

@Mapper
public interface BoardMapper {
	public int Insert(BoardDto boardDto);
	public int Update(BoardDto boardDto);
	public int Delete(BoardDto boardDto);
	public BoardDto SelectOne(Long id);
	public List<BoardDto> SelectAll();
	
	// BoardMapper.xml
//	public int InsertXML(BoardDto boardDto);
//	public int UpdateXML(BoardDto boardDto);
//	public int DeleteXML(BoardDto boardDto);
//	public int SelectOneXML(Long id);
//	public List<BoardDto> SelectAllXML();
}
