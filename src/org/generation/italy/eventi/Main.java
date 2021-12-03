package org.generation.italy.eventi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Inserisci il titolo dell'evento: ");
		String titoloEvento = scan.nextLine();
		
		System.out.print("Inserisci il giorno dell'evento: ");
		int giorno = scan.nextInt();
		System.out.print("Inserisci il mese: ");
		int mese = scan.nextInt();
		System.out.print("Inserisci l'anno: ");
		int anno = scan.nextInt();
		LocalDate dataEvento = LocalDate.of(anno, mese, giorno);
		System.out.println("La data �: " + dataEvento);
		
		System.out.print("Inserisci il numero di posti totali: ");
		int postiTotaliEvento = scan.nextInt();
		
		try {
			Evento evento = new Evento(titoloEvento, dataEvento, postiTotaliEvento);
			System.out.println("Hai creato l'evento: " + titoloEvento.toUpperCase() + " in data " + dataEvento + "; numero di posti: " + postiTotaliEvento);
			
			String sceltaUtente;
			boolean valid = false;
			System.out.print("Vuoi prenotare questo evento? s/n ");
			scan.nextLine();
			do {
				sceltaUtente = scan.nextLine();
				if(sceltaUtente.equals("n")) {
					System.out.println("Grazie per aver usato il programma!");
					valid = true;
					break;
				}
				
				System.out.print("Quanti posti vuoi prenotare? ");
				int numeroPrenotazioni = scan.nextInt();
				for(int i = 0; i < numeroPrenotazioni; i++) {
					evento.prenota();
				}
				System.out.println("Hai prenotato: " + numeroPrenotazioni + " posti.");
				int postiDisponibili = postiTotaliEvento - numeroPrenotazioni;
				System.out.println("I posti ancora disponibili sono: " + postiDisponibili);
				
			} while(!sceltaUtente.equals("s"));
			
			
			
//			if(numeroPrenotazioni == 0) {
//				System.out.println("Non hai effettuato prenotazioni. Grazie per aver usato il programma!");
//			} 
			
//			System.out.println("Quanti posti vuoi disdire?");
//			int numeroDisdetti = scan.nextInt();
//			if(numeroDisdetti == 0) {
//				System.out.println("Nessuna disdetta: hai confermato la prenotazione effettuata.");
//			} else if(numeroDisdetti > numeroPrenotazioni){
//				System.out.println("Errore: il numero di posti prenotati � inferiore.");
//			} else {
////				for(int i = 0; )
//			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		scan.close();
		
	}

}
