package de.fhdo.swt.example.swtexampleapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Reise")
public class Reise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private String land;
	
	@NotNull
	private String stadt;
	
	@NotNull
	private int plz;
	
	@NotNull
	private String reisezeit;
	
	@NotNull
	private double preis;
	
	@NotNull
	private String jahreszeit;
	
	@NotNull
	private int plaetze;
	
	public Reise() {};
	
	public Reise(String land, String stadt, int plz, String reisezeit, double preis, String jahreszeit, int plaetze) {
		this.land = land;
		this.stadt = stadt;
		this.plz = plz;
		this.reisezeit = reisezeit;
		this.preis = preis;
		this.jahreszeit = jahreszeit;
		this.plaetze = plaetze;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getReisezeit() {
		return reisezeit;
	}

	public void setReisezeit(String reisezeit) {
		this.reisezeit = reisezeit;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getJahreszeit() {
		return jahreszeit;
	}

	public void setJahreszeit(String jahreszeit) {
		this.jahreszeit = jahreszeit;
	}

	public int getPlaetze() {
		return plaetze;
	}

	public void setPlaetze(int plaetze) {
		this.plaetze = plaetze;
	}
	
}
