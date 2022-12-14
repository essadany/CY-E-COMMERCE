package com.ecommerce.metier;
// Generated Nov 1, 2022, 6:01:03 PM by Hibernate Tools 3.6.2.Final

/**
 * Adresse generated by hbm2java
 */
public class Adresse implements java.io.Serializable {

	private int ida;
	private String adresse;
	private String ville;
	private Integer codepostale;
	private String pays;
	private Integer idc;

	public Adresse() {
	}

	public Adresse(int ida) {
		this.ida = ida;
	}

	public Adresse(int ida, String adresse, String ville, Integer codepostale, String pays, Integer idc) {
		this.ida = ida;
		this.adresse = adresse;
		this.ville = ville;
		this.codepostale = codepostale;
		this.pays = pays;
		this.idc = idc;
	}

	public int getIda() {
		return this.ida;
	}

	public void setIda(int ida) {
		this.ida = ida;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Integer getCodepostale() {
		return this.codepostale;
	}

	public void setCodepostale(Integer codepostale) {
		this.codepostale = codepostale;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Integer getIdc() {
		return this.idc;
	}

	public void setIdc(Integer idc) {
		this.idc = idc;
	}

}
