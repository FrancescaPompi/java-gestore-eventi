package org.generation.italy.eventi;

import java.time.LocalDate;

public class Evento {
	
	// attributi
	private String titolo;
	private LocalDate data;
	private int numeroPostiTotali;
	private int numeroPostiPrenotati;
	
	// costruttore
	public Evento(String titolo, LocalDate data, int numeroPostiTotali) throws IllegalArgumentException {
		this.titolo = titolo;
		
		if(data.isAfter(LocalDate.now())) {
			this.data = data;
		} else {
			throw new IllegalArgumentException("Errore! La data è già passata.");
		}
		
		if(numeroPostiTotali > 0) {
			this.numeroPostiTotali = numeroPostiTotali;
		} else {
			throw new IllegalArgumentException("Errore! Il numero di posti totali deve essere positivo.");
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
	
	

}
