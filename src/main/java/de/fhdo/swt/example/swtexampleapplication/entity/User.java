package de.fhdo.swt.example.swtexampleapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
	@NotNull
	private int plz;
	
	@NotNull
	private String stadt;
	
	@NotNull
	private String vorname;
	
	@NotNull
	private String strasse;
	
	@NotNull
	private String anrede;
	
	@NotNull
	private String passwort;
	
	@NotNull
	private String email;
	
	@NotNull
	private String name;
	
	@NotNull
	private String geburtsdatum;
	
	@NotNull
	private String land;
	
	public User() {}

	public User(int plz, String stadt, String vorname, String strasse,
			String anrede, String passwort, String email, String name,
			String geburtsdatum, String land) {
		this.plz = plz;
		this.stadt = stadt;
		this.vorname = vorname;
		this.strasse = strasse;
		this.anrede = anrede;
		this.passwort = passwort;
		this.email = email;
		this.name = name;
		this.geburtsdatum = geburtsdatum;
		this.land = land;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}
	
}
