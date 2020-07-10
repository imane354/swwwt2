package de.fhdo.swt.example.swtexampleapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Rechnung")
public class Rechnung {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private int bestellpositionId;
	
	@NotNull
	private int preis;
	
	public Rechnung() {}

	public Rechnung(int bestellpositionId, int preis) {
		this.bestellpositionId = bestellpositionId;
		this.preis = preis;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getBestellpositionId() {
		return bestellpositionId;
	}

	public void setBestellpositionId(int bestellpositionId) {
		this.bestellpositionId = bestellpositionId;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}
	
}
