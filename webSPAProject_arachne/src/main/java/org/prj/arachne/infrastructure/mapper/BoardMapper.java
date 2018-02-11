package org.prj.arachne.infrastructure.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.prj.arachne.domain.Board;
import org.prj.arachne.domain.SearchCriteria;

@Mapper
public interface BoardMapper{


	public void insert(Board board);
	
	public List<Board> selectList(SearchCriteria criteria);
	
	public Board selectOne(Long id);

	public void update(Board board);
	
	public void delete(Long id);



}
