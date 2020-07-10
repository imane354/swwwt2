package de.fhdo.swt.example.swtexampleapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ÜbersichtController {
	
	@RequestMapping("/Übersicht.html")
	public String uebersicht2() {
		return "Übersicht";
	}
}
