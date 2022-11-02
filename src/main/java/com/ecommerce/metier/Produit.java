package com.ecommerce.metier;
// Generated Nov 1, 2022, 6:01:03 PM by Hibernate Tools 3.6.2.Final

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Produit generated by hbm2java
 */
public class Produit implements java.io.Serializable {

	private int idP;
	private Categorie categorie;
	private String libelle;
	private String marque;
	private Integer prix;
	private String description;
	private Integer fraisExpedition;
	private Integer disponibilite;
	private Integer qtestck;
	private Date datePub;
	private Set<Wishlist> wishlists = new HashSet<Wishlist>(0);
	private Set<Commentaire> commentaires = new HashSet<Commentaire>(0);
	private List<Image> images = new ArrayList<Image>();
	public Produit() {
	}

	public Produit(int idP) {
		this.idP = idP;
	}

	public Produit(int idP, Categorie categorie, String libelle, String marque, Integer prix, String description,
			Integer fraisExpedition, Integer disponibilite, Integer qtestck, Date datePub, Set<Wishlist> wishlists,
			Set<Commentaire> commentaires, List<Image> images) {
		this.idP = idP;
		this.categorie = categorie;
		this.libelle = libelle;
		this.marque = marque;
		this.prix = prix;
		this.description = description;
		this.fraisExpedition = fraisExpedition;
		this.disponibilite = disponibilite;
		this.qtestck = qtestck;
		this.datePub = datePub;
		this.wishlists = wishlists;
		this.commentaires = commentaires;
		this.images = images;
	}

	public int getIdP() {
		return this.idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Integer getPrix() {
		return this.prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getFraisExpedition() {
		return this.fraisExpedition;
	}

	public void setFraisExpedition(Integer fraisExpedition) {
		this.fraisExpedition = fraisExpedition;
	}

	public Integer getDisponibilite() {
		return this.disponibilite;
	}

	public void setDisponibilite(Integer disponibilite) {
		this.disponibilite = disponibilite;
	}

	public Integer getQtestck() {
		return this.qtestck;
	}

	public void setQtestck(Integer qtestck) {
		this.qtestck = qtestck;
	}

	public Date getDatePub() {
		return this.datePub;
	}

	public void setDatePub(Date datePub) {
		this.datePub = datePub;
	}

	public Set<Wishlist> getWishlists() {
		return this.wishlists;
	}

	public void setWishlists(Set<Wishlist> wishlists) {
		this.wishlists = wishlists;
	}

	public Set<Commentaire> getCommentaires() {
		return this.commentaires;
	}

	public void setCommentaires(Set<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}
	
}