package com.andrea.javacourse;

public class Telefonata {
	
	private String numero;
	private float costo;
	private int durata_inSec;
	
	public Telefonata()	{
		this.numero = "";
		this.costo = -1;
		this.durata_inSec = -1;
	}
	
	public Telefonata(String numero, float costo, int durata) {
		this.numero = numero;
		this.costo = costo;
		this.durata_inSec = durata;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public int getDurata_inSec() {
		return durata_inSec;
	}

	public void setDurata_inSec(int durata_inSec) {
		this.durata_inSec = durata_inSec;
	}
	
	
}
