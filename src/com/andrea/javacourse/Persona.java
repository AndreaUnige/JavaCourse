package com.andrea.javacourse;

public class Persona {
	
	public static String nome;
	public String cognome;
	public int eta;
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public void stampa() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cognome: " + this.cognome);
		System.out.println("Eta: " + this.eta);
	}
}
