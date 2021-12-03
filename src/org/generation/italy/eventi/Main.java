package org.generation.italy.eventi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean fineProgramma = false;
		boolean erroreInput = false;
		
		System.out.print("Inserisci il titolo dell'evento: ");
		String titoloEvento = scan.nextLine();
		
		System.out.print("Inserisci il giorno dell'evento: ");
		int giorno = scan.nextInt();
		System.out.print("Inserisci il mese: ");
		int mese = scan.nextInt();
		System.out.print("Inserisci l'anno: ");
		int anno = scan.nextInt();
		LocalDate dataEvento = LocalDate.of(anno, mese, giorno);
		System.out.println("La data è: " + dataEvento);
		
		System.out.print("Inserisci il numero di posti totali: ");
		int postiTotaliEvento = scan.nextInt();
		
		try {
			Evento evento = new Evento(titoloEvento, dataEvento, postiTotaliEvento);
			System.out.println("Hai creato l'evento: " + titoloEvento.toUpperCase() + " in data " + dataEvento + "; numero di posti: " + postiTotaliEvento);
			System.out.print("Quanti posti vuoi prenotare? ");
			int numeroPrenotazioni = scan.nextInt();
			for(int i = 0; i <= numeroPrenotazioni; i++) {
				evento.prenota();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		scan.close();
		
	}

}
