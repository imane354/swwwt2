package de.fhdo.swt.example.swtexampleapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homeSweetHome() {
		return "Home";
	}
	
	@RequestMapping("/Home.html")
	public String home() {
		return "Home";
	}
}
