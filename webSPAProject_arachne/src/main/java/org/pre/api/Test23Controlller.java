package org.pre.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test23Controlller {

	
	@GetMapping("/asdf")
	public String asdf() {
	
		
		return "asdfasdfsdfasdf";
	}
	
}
