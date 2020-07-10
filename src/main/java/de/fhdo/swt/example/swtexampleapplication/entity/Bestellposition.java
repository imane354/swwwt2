package de.fhdo.swt.example.swtexampleapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Bestellposition")
public class Bestellposition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private int reiseId;
	
	@NotNull
	private String kategorie;
	
	@NotNull
	private int bestellungId;
	
	@NotNull
	private int preis;
	
	public Bestellposition() {}

	public Bestellposition(int reiseId, String kategorie,int bestellungId, int preis) {
		this.reiseId = reiseId;
		this.kategorie = kategorie;
		this.bestellungId = bestellungId;
		this.preis = preis;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getReiseId() {
		return reiseId;
	}

	public void setReiseId(int reiseId) {
		this.reiseId = reiseId;
	}

	public String getKategorie() {
		return kategorie;
	}

	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}

	public int getBestellungId() {
		return bestellungId;
	}

	public void setBestellungId(int bestellungId) {
		this.bestellungId = bestellungId;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	
}
