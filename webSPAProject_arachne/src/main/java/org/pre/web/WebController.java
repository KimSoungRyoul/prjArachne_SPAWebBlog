package org.pre.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/")
	public String index() {
		
		return "index";
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
