package com.symit.hamgalgel.Entity;

public class Gmah {
	private double amount;
	private int nbJourGmah;
	private int nbjourAttente;
	public Gmah(double amount, int nbJourGmah, int nbjourAttente) {
		super();
		this.amount = amount;
		this.nbJourGmah = nbJourGmah;
		this.nbjourAttente = nbjourAttente;
	}
	public Gmah() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getNbJourGmah() {
		return nbJourGmah;
	}
	public void setNbJourGmah(int nbJourGmah) {
		this.nbJourGmah = nbJourGmah;
	}
	public int getNbjourAttente() {
		return nbjourAttente;
	}
	public void setNbjourAttente(int nbjourAttente) {
		this.nbjourAttente = nbjourAttente;
	}
	
	

}
