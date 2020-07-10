package de.fhdo.swt.example.swtexampleapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.fhdo.swt.example.swtexampleapplication.entity.Aktivitaet;

public interface AktivitaetRepository extends JpaRepository<Aktivitaet, Integer>{

}
