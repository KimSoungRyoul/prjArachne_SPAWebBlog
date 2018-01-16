package org.pre.api;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;

@Data
public class TestDTO {

	private String id;
	private String name;
	@JsonFormat(shape=Shape.STRING,pattern="yyyy-MM-dd HH:mm")
	private Date date;
	private List<String> listData;
	private Map<String, String> mapData;
	
	
	
}
