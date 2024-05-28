package com.andrea.javacourse;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona("Andrea", "Sciarrone", 40);
		Persona p1 = new Persona(null, null, 0);
		
		p.stampa();
		
		Persona.nome = "Pippo";
	}

}
