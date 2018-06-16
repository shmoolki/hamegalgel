package com.symit.hamgalgel.Entity;

import java.util.ArrayList;
import java.util.Optional;


public class ListGmahim {
	private ArrayList<Gmah> list = new  ArrayList<Gmah>();
	private Gmah enCours;
	
	
	public ListGmahim(ArrayList<Gmah> listGmahim, Gmah enCours) {
		super();
		this.list = listGmahim;
		this.enCours = enCours;
	}
	
	public ListGmahim(ArrayList<Gmah> listGmahim) {
		super();
		this.list = listGmahim;
	}
	
	public ArrayList<Gmah> getList() {
		return list;
	}

	public void setList(ArrayList<Gmah> list) {
		this.list = list;
	}

	public Gmah getEnCours() {
		return enCours;
	}

	public void setEnCours(Gmah enCours) {
		this.enCours = enCours;
	}

	public Optional<Gmah> nextDispo()   {
		if(this.getAvalaible().size() == 0) {
			return Optional.empty();
		}else {
		return Optional.of(this.getAvalaible().get(0));
		}
	}
	
	public ArrayList<Gmah> getAvalaible() {
		if(this.enCours == null) {
			return this.list;
		}else {
			ArrayList<Gmah> avalaibleGmah = (ArrayList<Gmah>) this.list.clone();
		    avalaibleGmah.remove(this.enCours);
		    return avalaibleGmah;
		}
	}
	
	
}
