package de.fhdo.swt.example.swtexampleapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Aktivitaet")
public class Aktivitaet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private int reiseId;
	
	@NotNull
	private String kategorie;
	
	@NotNull
	private double preis;
	
	@NotNull
	private int bestellungId;

	public Aktivitaet() {};
	
	public Aktivitaet(int reiseId, String kategorie, double preis, int bestellungId) {
		this.reiseId = reiseId;
		this.kategorie = kategorie;
		this.preis = preis;
		this.bestellungId = bestellungId;
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

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public int getBestellungId() {
		return bestellungId;
	}

	public void setBestellungId(int bestellungId) {
		this.bestellungId = bestellungId;
	}
	
	
}
