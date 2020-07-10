package de.fhdo.swt.example.swtexampleapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.fhdo.swt.example.swtexampleapplication.entity.Reise;
import de.fhdo.swt.example.swtexampleapplication.repository.ReiseRepository;

@RestController
public class ReiseController {
	
	@Autowired
	ReiseRepository reiseRepository;
/*	
	@RequestMapping(
			method = RequestMethod.GET,
			path = "/reise",
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	

	public List<Reise> getReise(){
		
		List<Reise> reiseListe = reiseRepository.findAll();
		return reiseListe;
	}
*/
	
 
	 @GetMapping("/reise")
	    public String showReiseForm(Reise reise, Model model) {
	        model.addAttribute("reise", reiseRepository.findAll());
	        return "reise";
	    }
	   
}