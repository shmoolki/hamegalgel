package com.symit.hamgalgel.Entity;

import java.util.ArrayList;

public class Personne {
	private String firstName;
	private String lastName;
	private String telephone;
	private String adress;
	private City city;
	private ArrayList<Gmah> listGmahim = new  ArrayList<Gmah>();
	
	public Personne(String firstName, String lastName, String telephone, String adress, City city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.adress = adress;
		this.city = city;
	}

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public ArrayList<Gmah> getListGmahim() {
		return listGmahim;
	}

	public void setListGmahim(ArrayList<Gmah> listGmahim) {
		this.listGmahim = listGmahim;
	}

	public boolean isAllowToBorrow(double d) {
		double amountAllowed = 0;

		for(Gmah gmh:this.getListGmahim()) {
			amountAllowed+= gmh.getAmount();
		}		
//		System.out.println(amountAllowed);
		return (amountAllowed >= d);
	}
	
	
}
