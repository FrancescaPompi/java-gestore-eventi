package org.generation.italy.eventi;

import java.time.LocalDate;

public class Evento {
	
	// attributi
	private String titolo;
	private LocalDate data;
	private int numeroPostiTotali;
	private int numeroPostiPrenotati;
	
	// costruttore
	public Evento(String titolo, LocalDate data, int numeroPostiTotali) throws Exception {
		this.titolo = titolo;
		
		if(data.isAfter(LocalDate.now())) {
			this.data = data;
		} else {
			throw new Exception("Errore! La data è già passata.");
		}
		
		if(numeroPostiTotali > 0) {
			this.numeroPostiTotali = numeroPostiTotali;
		} else {
			throw new Exception("Errore! Il numero di posti totali deve essere positivo.");
		}
		
		this.numeroPostiPrenotati = 0;
	}
	
	
	// getter e setter
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getNumeroPostiTotali() {
		return numeroPostiTotali;
	}

	public int getNumeroPostiPrenotati() {
		return numeroPostiPrenotati;
	}
	
	
	// metodi
	public void prenota() throws Exception {
		int numeroPostiDisponibili = this.numeroPostiTotali - this.numeroPostiPrenotati;
		if(!data.isAfter(LocalDate.now())) {
			throw new Exception("La data è già passata.");
		} else if(numeroPostiDisponibili == 0) {
			throw new Exception("I posti disponibili sono terminati.");
		} else {
			this.numeroPostiPrenotati++;
		}
		
	}
	
	public void disdici() {
		
	}

}
