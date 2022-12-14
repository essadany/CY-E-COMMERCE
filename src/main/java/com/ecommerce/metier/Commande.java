package com.ecommerce.metier;
// Generated Nov 1, 2022, 6:01:03 PM by Hibernate Tools 3.6.2.Final

import java.util.Date;

/**
 * Commande generated by hbm2java
 */
public class Commande implements java.io.Serializable {

	private int idcmd;
	private Client client;
	private Date datecmd;
	private String methodePay;
	private String etat;
	private Integer ida;

	public Commande() {
	}

	public Commande(int idcmd) {
		this.idcmd = idcmd;
	}

	public Commande(int idcmd, Client client, Date datecmd, String methodePay, String etat, Integer ida) {
		this.idcmd = idcmd;
		this.client = client;
		this.datecmd = datecmd;
		this.methodePay = methodePay;
		this.etat = etat;
		this.ida = ida;
	}

	public int getIdcmd() {
		return this.idcmd;
	}

	public void setIdcmd(int idcmd) {
		this.idcmd = idcmd;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDatecmd() {
		return this.datecmd;
	}

	public void setDatecmd(Date datecmd) {
		this.datecmd = datecmd;
	}

	public String getMethodePay() {
		return this.methodePay;
	}

	public void setMethodePay(String methodePay) {
		this.methodePay = methodePay;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Integer getIda() {
		return this.ida;
	}

	public void setIda(Integer ida) {
		this.ida = ida;
	}

}
