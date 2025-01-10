package com.nrg948;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiteAPI {
	public SiteAPI() {
		
	}
	
	// yadda yadda yadda
	@GetMapping("/get")
	public String get() {
		return "{}";
	}
}
