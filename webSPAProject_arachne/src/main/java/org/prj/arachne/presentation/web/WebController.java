package org.prj.arachne.presentation.web;

import org.prj.arachne.domain.tistory.TistoryCategory;
import org.prj.arachne.util.TistoryParserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	@Autowired
	private TistoryParserUtil tistoryParserUtil;


	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView=new ModelAndView("index");
		modelAndView.addObject("boardList",tistoryParserUtil.parsingPostList(TistoryCategory.DEVDIARY));





		return modelAndView;
	}
	
	
	@GetMapping("/index")
	public String index2() {
		
		return "index";
	}
	
	
	@GetMapping("/about")
	public String about() {
		
		
		return "about";
	}
	
	
	@GetMapping("/gallery")
	public String gallery() {
		
		
		return "gallery";
	}
	
	
	@GetMapping("/icons")
	public String icon() {
		
		return "icons";
	}
	
	
	@GetMapping("/codes")
	public String codes() {
		
		return "codes";
	}
	
	
	
	
	
}
