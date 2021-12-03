package org.generation.italy.eventi;

import java.util.ArrayList;
import java.util.List;

public class ProgrammEventi {
	
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

}
