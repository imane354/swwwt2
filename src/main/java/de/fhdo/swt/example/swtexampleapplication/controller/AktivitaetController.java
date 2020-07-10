package de.fhdo.swt.example.swtexampleapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.fhdo.swt.example.swtexampleapplication.entity.Aktivitaet;
import de.fhdo.swt.example.swtexampleapplication.repository.AktivitaetRepository;


@RestController
public class AktivitaetController {
	
		
		@Autowired
		AktivitaetRepository aktivitaetRepository;
		
		@RequestMapping(
				method = RequestMethod.GET,
				path = "/aktivitaet",
				produces = MediaType.APPLICATION_JSON_VALUE
		)
		
		public List<Aktivitaet> getReise(){
			
			List<Aktivitaet> aktivitaetListe = aktivitaetRepository.findAll();
			return aktivitaetListe;
		}
	
}
