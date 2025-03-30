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
	
	@GetMapping("/flexi")
	public String flexi(Model model) {
		return "flexi.html";
	}
	
	@GetMapping("/gen")
	public String gen(Model model) {
		return "gen.html";
	}
}
