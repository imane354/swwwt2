package de.fhdo.swt.example.swtexampleapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.fhdo.swt.example.swtexampleapplication.entity.Bestellung;
import de.fhdo.swt.example.swtexampleapplication.repository.BestellungRepository;

@RestController
public class BestellungController {
		
			
			@Autowired
			BestellungRepository bestellungRepository;
			
			@RequestMapping(
					method = RequestMethod.GET,
					path = "/bestellung",
					produces = MediaType.APPLICATION_JSON_VALUE
			)
			
			public List<Bestellung> getReise(){
				
				List<Bestellung> bestellungListe = bestellungRepository.findAll();
				return bestellungListe;
			}
}
