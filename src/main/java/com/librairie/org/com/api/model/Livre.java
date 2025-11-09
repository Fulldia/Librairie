package com.librairie.org.com.api.model;

public class Livre {
	private Integer id;
	private String nom;
	private String auteur;
	
	//constructeur
	public Livre(Integer id, String nom, String auteur) {
		this.id = id;
		this.nom = nom;
		this.auteur = auteur;
	}

	//getters et setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
};

