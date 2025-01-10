package com.nrg948;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainSite {
	public MainSite() {
		
	}
	
	// figure this out later
	@GetMapping("/")
	public String index(Model model) {
		return "index.html";
	}
}
