package org.prj.arachne.domain;

import java.util.LinkedList;
import java.util.List;

import lombok.Data;

@Data
public class Board {

	private Long id;
	
	private BoardElement boardType;
	
	private Board parentBoard;
	
	private String title;
	
	private User writer;
	
	private String contents;
	
	
	private List<Board> replies=new LinkedList<>();
	
	
	
}

