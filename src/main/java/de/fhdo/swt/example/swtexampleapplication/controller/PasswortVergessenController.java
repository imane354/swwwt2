package de.fhdo.swt.example.swtexampleapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PasswortVergessenController {
	
	@RequestMapping("/Passwortvergessen.html")
	public String passwortVergessen() {
		return "Passwortvergessen";
	}
}
