package com.andrea.javacourse;

public class Main {

	public static void main(String[] args) {
		SIM mySim = new SIM();
		
		Telefonata t1 = new Telefonata("123456789", 10, 5);
		Telefonata t2 = new Telefonata("987654321", 25, 2);
		
		
		
		mySim.aggiungiTelefonataFatta( new Telefonata("", 0, 0) );
		mySim.aggiungiTelefonataFatta(t2);
		mySim.aggiungiTelefonataFatta(t2);
		
		int durataTotale = mySim.durataTotaleChiamate();
		System.out.println("Durata totale: " + durataTotale);
	}

}
