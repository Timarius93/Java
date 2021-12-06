package com.thomas.serieTv.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "serietv")
public class SerieTv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titolo;
	private String genere;
	private boolean attiva;
	private String url;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public boolean isAttiva() {
		return attiva;
	}
	public void setAttiva(boolean attiva) {
		this.attiva = attiva;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
	
	
	
}
