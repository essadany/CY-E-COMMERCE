package com.ecommerce.metier;
// Generated Nov 1, 2022, 6:01:03 PM by Hibernate Tools 3.6.2.Final

/**
 * Lignecommande generated by hbm2java
 */
public class Lignecommande implements java.io.Serializable {

	private int idlc;
	private Integer idcmd;
	private Integer idp;
	private Integer qte;
	private Integer prixAchat;

	public Lignecommande() {
	}

	public Lignecommande(int idlc) {
		this.idlc = idlc;
	}

	public Lignecommande(int idlc, Integer idcmd, Integer idp, Integer qte, Integer prixAchat) {
		this.idlc = idlc;
		this.idcmd = idcmd;
		this.idp = idp;
		this.qte = qte;
		this.prixAchat = prixAchat;
	}

	public int getIdlc() {
		return this.idlc;
	}

	public void setIdlc(int idlc) {
		this.idlc = idlc;
	}

	public Integer getIdcmd() {
		return this.idcmd;
	}

	public void setIdcmd(Integer idcmd) {
		this.idcmd = idcmd;
	}

	public Integer getIdp() {
		return this.idp;
	}

	public void setIdp(Integer idp) {
		this.idp = idp;
	}

	public Integer getQte() {
		return this.qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public Integer getPrixAchat() {
		return this.prixAchat;
	}

	public void setPrixAchat(Integer prixAchat) {
		this.prixAchat = prixAchat;
	}

}