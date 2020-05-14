package com.yks.service;

import java.util.List;

import com.yks.domain.BoardVO;

public interface BoardService {
	
	// 새 글을 등록할때 사용하는 메서드
	public void register(BoardVO board);
	
	// 지정한 글 번호의 record를 꺼낼때
	public BoardVO get(Long bno);
	
	// 기존 글을 수정할때
	public boolean modify(BoardVO board);
	
	// 내가 지정한 글번호를 이용해서 해당글을 삭제할때
	public boolean remove(Long bno);
	
	// 전체 데이터를 조회할 때
	public List<BoardVO> getList();
}
