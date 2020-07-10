package de.fhdo.swt.example.swtexampleapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrierungController {
	
	@RequestMapping("/Registrierung.html")
	public String registrierung() {
		return "Registrierung";
	}
}
