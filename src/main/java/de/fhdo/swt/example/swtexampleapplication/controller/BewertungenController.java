package de.fhdo.swt.example.swtexampleapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BewertungenController {
	
	@RequestMapping("/Bewertungen.html")
	public String bewertung() {
		return "Bewertungen";
	}
}
