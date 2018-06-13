package com.symit.hamgalgel;

import static org.junit.Assert.*;

import org.junit.Test;

import com.symit.hamgalgel.Entity.City;
import com.symit.hamgalgel.Entity.Gmah;
import com.symit.hamgalgel.Entity.Personne;

public class wave1test {


	@Test
	public void shouldReturnFalseWhenJustNotContinueGmah() {
		Gmah gmah = new Gmah(15000,90,60);
		Personne personne = new Personne("Ploni","Almoni","054-1234356","Rehov Untel",new City("Bne Brak","Israel"));
		personne.getListGmahim().add(gmah);
		assertFalse(personne.isAllowToBorrow(15000));
		
		Gmah gmah2 = new Gmah(10000,60,60);
		personne.getListGmahim().add(gmah2);
		assertTrue(personne.isAllowToBorrow(10000));
		
				
	}

}
