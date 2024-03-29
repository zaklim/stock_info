package com.stock.model;

public class Fournisseur {

	private int idFournisseur;
	private String nom;
	private String telephone;
	private String email;
	
	public Fournisseur(int idFournisseur) {
		super();
		this.idFournisseur = idFournisseur;
	}
	public Fournisseur(String nom, String telephone, String email) {
		super();
		this.nom = nom;
		this.telephone = telephone;
		this.email = email;
	}
	public Fournisseur(int idFournisseur, String nom, String telephone, String email) {
		super();
		this.idFournisseur = idFournisseur;
		this.nom = nom;
		this.telephone = telephone;
		this.email = email;
	}
	public int getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
