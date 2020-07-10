package de.fhdo.swt.example.swtexampleapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AktionenController {
	
	@RequestMapping("/aktionen.html")
	public String aktionent() {
		return "Aktionen";
	}
}
