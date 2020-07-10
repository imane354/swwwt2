package de.fhdo.swt.example.swtexampleapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BuchungenController {
	
	@RequestMapping("/Buchungen.html")
	public String buchungen() {
		return "Buchungen";
	}
}
