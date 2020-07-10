package de.fhdo.swt.example.swtexampleapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.fhdo.swt.example.swtexampleapplication.entity.Bestellposition;

public interface BestellpositionRepository extends JpaRepository<Bestellposition, Integer>{

}
