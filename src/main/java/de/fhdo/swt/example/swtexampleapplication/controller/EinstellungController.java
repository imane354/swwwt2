package de.fhdo.swt.example.swtexampleapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EinstellungController {
	
	@RequestMapping("/Einstellungen.html")
	public String einstellung() {
		return "Einstellungen";
	}
}
