package de.fhdo.swt.example.swtexampleapplication.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "Bestellung")
public class Bestellung {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		
		@NotNull
		private int userId;
		
		@NotNull
		private int reiseId;
		
		@NotNull
		private int aktivitaetId;
		
		@NotNull
		private Date datum;
		
		public Bestellung() {}

		public Bestellung(int userId, int reiseId, int aktivitaetId, Date datum) {
			this.userId = userId;
			this.reiseId = reiseId;
			this.aktivitaetId = aktivitaetId;
			this.datum = datum;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public int getReiseId() {
			return reiseId;
		}

		public void setReiseId(int reiseId) {
			this.reiseId = reiseId;
		}

		public int getAktivitaetId() {
			return aktivitaetId;
		}

		public void setAktivitaetId(int aktivitaetId) {
			this.aktivitaetId = aktivitaetId;
		}

		public Date getDatum() {
			return datum;
		}

		public void setDatum(Date datum) {
			this.datum = datum;
		}
		
		
}
