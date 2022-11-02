package com.ecommerce.metier;
// Generated Nov 1, 2022, 6:01:03 PM by Hibernate Tools 3.6.2.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client implements java.io.Serializable {

	private int idc;
	private Compte compte;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private Date regDate;
	private Set<Wishlist> wishlists = new HashSet<Wishlist>(0);
	private Set<Commande> commandes = new HashSet<Commande>(0);

	public Client() {
	}

	public Client(int idc) {
		this.idc = idc;
	}

	public Client(int idc, Compte compte, String nom, String prenom, String email, String tel, Date regDate,
			Set<Wishlist> wishlists, Set<Commande> commandes) {
		this.idc = idc;
		this.compte = compte;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.regDate = regDate;
		this.wishlists = wishlists;
		this.commandes = commandes;
	}

	public int getIdc() {
		return this.idc;
	}

	public void setIdc(int idc) {
		this.idc = idc;
	}

	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Set<Wishlist> getWishlists() {
		return this.wishlists;
	}

	public void setWishlists(Set<Wishlist> wishlists) {
		this.wishlists = wishlists;
	}

	public Set<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}

}