package de.fhdo.swt.example.swtexampleapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuchenController {
	
	@RequestMapping("/suchen.html")
	public String suchen() {
		return "suchen";
	}
}
