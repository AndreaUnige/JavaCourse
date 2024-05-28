package com.andrea.javacourse;

public class SIM {
	
	private String numero;
	
	private Telefonata[] elencoTelefonateFatte = new Telefonata[10];
	private Telefonata[] elencoTelefonateRicevute = new Telefonata[10];
	
	
	public SIM() { }
//	public SIM(int dimensioneRegistro) {
//		this.elencoTelefonateFatte = new Telefonata[dimensioneRegistro];
//		this.elencoTelefonateRicevute = new Telefonata[dimensioneRegistro];
//	}

	public void aggiungiTelefonataFatta(Telefonata t) {
		// traslo le telefonate verso dx
		for (int i = elencoTelefonateFatte.length - 1; i >= 1; i--) {
			elencoTelefonateFatte[i] = elencoTelefonateFatte[i-1];
		}
		
		// Aggiungo la nuova telefonata
		elencoTelefonateFatte[0] = t;
	}
	
	public int durataTotaleChiamate() {
		int durataTotale = 0;
		
		for (int i = 0; i < elencoTelefonateFatte.length; i++) {
			if (elencoTelefonateFatte[i] != null) {
				durataTotale += elencoTelefonateFatte[i].getDurata_inSec();
			}
		}
		
//		for (Telefonata t : elencoTelefonateFatte)
//			if (t != null)
//				durataTotale += t.getDurata_inSec();
		
		return durataTotale;
	}
	
	
	
	
	

	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Telefonata[] getElencoTelefonateFatte() {
		return elencoTelefonateFatte;
	}


	public void setElencoTelefonateFatte(Telefonata[] elencoTelefonateFatte) {
		this.elencoTelefonateFatte = elencoTelefonateFatte;
	}


	public Telefonata[] getElencoTelefonateRicevute() {
		return elencoTelefonateRicevute;
	}


	public void setElencoTelefonateRicevute(Telefonata[] elencoTelefonateRicevute) {
		this.elencoTelefonateRicevute = elencoTelefonateRicevute;
	}
	
	
}
