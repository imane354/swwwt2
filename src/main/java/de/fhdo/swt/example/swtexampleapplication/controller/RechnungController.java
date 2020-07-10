package de.fhdo.swt.example.swtexampleapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.fhdo.swt.example.swtexampleapplication.entity.Rechnung;
import de.fhdo.swt.example.swtexampleapplication.repository.RechnungRepository;

@RestController
public class RechnungController {

	
	@Autowired
	RechnungRepository rechnungRepository;
	
	@RequestMapping(
			method = RequestMethod.GET,
			path = "/rechnung",
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	
	public List<Rechnung> getReise(){
		
		List<Rechnung> rechnungListe = rechnungRepository.findAll();
		return rechnungListe;
	}
}
