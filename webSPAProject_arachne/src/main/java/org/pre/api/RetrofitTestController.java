package org.pre.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping(value="/rest")
@Log4j
public class RetrofitTestController {

	
	
	@GetMapping("/test/GET")
	public TestDTO testGET(@RequestParam("param1")String param1) {
		
		log.info("  [  "+param1+" ] ");
		
		TestDTO tdto=new TestDTO();
		
		tdto.setDate(new Date());
		tdto.setId("archne0823@gmail.com");
		tdto.setName("김성렬");
		
		List<String> listData=new ArrayList<>();
		listData.add("java8");
		listData.add("Node.js");
		listData.add("python3.0");
		
		tdto.setListData(listData);
		
		Map<String, String> mapData=new HashMap<>();
		mapData.put("kim", "성렬");
		mapData.put("hong", "승훈");
		mapData.put("jung", "정기");
		tdto.setMapData(mapData);
		
		
		
		
		
		
		return tdto;
	}
}
