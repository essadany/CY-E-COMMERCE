package com.ecommerce.metier;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	private List<LignePanier> items = new ArrayList<LignePanier>();
	


	public List<LignePanier> getItems() {
		return items;
	}

	public void setItems(List<LignePanier> items) {
		this.items = items;
	}}
