package de.fhdo.swt.example.swtexampleapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.fhdo.swt.example.swtexampleapplication.entity.Bestellposition;

import de.fhdo.swt.example.swtexampleapplication.repository.BestellpositionRepository;

@RestController
public class BestellpositionController {
	
	@Autowired
	BestellpositionRepository bestellpositionRepository;
	
	@RequestMapping(
			method = RequestMethod.GET,
			path = "/bestellposition",
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	
	public List<Bestellposition> getReise(){
		
		List<Bestellposition> bestellpositionListe = bestellpositionRepository.findAll();
		return bestellpositionListe;
	}
}
