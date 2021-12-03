package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListDataEvent;

public class ProgrammEventi<E> {
	
	private String titolo;
	private List<Evento> eventi;
	
	// costruttore
	public ProgrammEventi(String titolo) {
		this.titolo = titolo;
		List<Evento> eventi = new ArrayList<Evento>();
	}
	
	// metodo aggiunta evento
	public void aggiungiEvento() throws Exception {
		eventi.add(new Evento(titolo, null, 0));
	}
	
	// metodo lista eventi in una certa data
	public ArrayList<Evento> eventiStessaData(LocalDate data) {
		ArrayList<Evento> stessaData = new ArrayList<Evento>();
		
		for(Evento s : eventi) {
			if(s.getData().isEqual(data)) {

			}
		}
		return stessaData;
	}
	
	// metodo numero eventi
	public int numeroProgrammEventi() {
		int numeroProgrammEventi = eventi.size();
		return numeroProgrammEventi;
	}

}
