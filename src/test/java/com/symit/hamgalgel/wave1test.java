package com.symit.hamgalgel;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import com.symit.hamgalgel.Entity.City;
import com.symit.hamgalgel.Entity.Gmah;
import com.symit.hamgalgel.Entity.ListGmahim;
import com.symit.hamgalgel.Entity.Personne;

public class wave1test {

	private Gmah gmah;
	private Gmah gmah2;
	private Personne personne;
	
	@Before
	public void  PrepareData() {
		this.gmah = new Gmah(15000,90,60);
		this.gmah2 = new Gmah(10000,60,60);
		personne = new Personne("Ploni","Almoni","054-1234356","Rehov Untel",new City("Bne Brak","Israel"));
		
		ArrayList<Gmah> list = new ArrayList<Gmah>();
		list.add(this.gmah);
		list.add(this.gmah2);
		ListGmahim listGmahim = new ListGmahim(list);
		personne.setListGmahim(listGmahim);
	}

	@Test
	public void shouldReturnFalseWhenJustNotContinueGmah() {				
//		assertFalse(personne.isAllowToBorrow(15000));				
		assertTrue(this.personne.isAllowToBorrow(10000));
//		assertFalse(personne.isAllowToBorrow(15000));
	}
	
	@Test
	public void shouldGetOneGmahAvalaibleFromListGmah() {
		ArrayList<Gmah> list = new ArrayList<Gmah>();
		list.add(new Gmah(15000,90,60));
		list.add(new Gmah(10000,60,30));
		ListGmahim listGmahim = new ListGmahim(list);
		
		assertEquals(2,listGmahim.getList().size());
		listGmahim.setEnCours(list.get(0));
		
		assertEquals(1,listGmahim.getAvalaible().size());
		assertEquals(list.get(1),listGmahim.getAvalaible().get(0));
		
		assertEquals(list.get(1),listGmahim.nextDispo().get());
		
		list.clear();	
	}
	
	@Test
	public void shouldReturnFalseIfWaitingTimeNotNotGet() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		personne.getListGmahim().takeGmah(this.personne.getListGmahim().getList().get(0), dateFormat.parse("01/01/2018"));
		boolean gmahDispoEnDate = personne.getListGmahim().checkValidity(personne.getListGmahim().getList().get(0),new Date());
		assertFalse(gmahDispoEnDate);
		
	}
	
	

}
