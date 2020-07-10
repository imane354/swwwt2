package de.fhdo.swt.example.swtexampleapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.fhdo.swt.example.swtexampleapplication.entity.Rechnung;

public interface RechnungRepository extends JpaRepository<Rechnung, Integer>{

}
