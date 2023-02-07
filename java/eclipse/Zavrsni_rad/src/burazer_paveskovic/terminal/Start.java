package burazer_paveskovic.terminal;

import java.util.Scanner;

import burazer_paveskovic.terminal.obrada.Aviokompanije;
import burazer_paveskovic.terminal.obrada.Avioni;
import burazer_paveskovic.terminal.obrada.Korisnici;
import burazer_paveskovic.terminal.obrada.Letovi;

public class Start {

	private Korisnici korisnici;
	private Avioni avioni;
	private Aviokompanije aviokompanije;
	private Letovi letovi;

	public Start() {

		Pomocno.ulaz = new Scanner(System.in);
		letovi = new Letovi(this);
		korisnici = new Korisnici(this);
		avioni = new Avioni(this);
		aviokompanije = new Aviokompanije(this);
		pozdravnaporuka();
		glavniizbornik();

	}

	public void glavniizbornik() {
		System.out.println("");
		System.out.println("Glavni izbornik");
		System.out.println("Dostupne opcije");
		System.out.println("1. Korisnici");
		System.out.println("2. Aviokompaniije");
		System.out.println("3. Avioni");
		System.out.println("4. Letovi");
		System.out.println("5. Rezervacije");
		System.out.println("6. Izlaz");

		odabir();

	}

	private void odabir() {
		switch (Pomocno.unos("Odaberite opciju u koju želite ući: ", 1, 5)) {

		case 1:
			korisnici.izbornik();
			break;
		case 2:
			aviokompanije.izbornik();
			break;
		case 3:
			avioni.izbornik();
		case 4:
			letovi.izbornik();
			break;

		}

	}

	private void pozdravnaporuka() {
		System.out.println("Dobrodošli u terminal aplikaciju za rezerviranje karata!!!");

	}

	public static void main(String[] args) {

		new Start();
	}

	public Avioni getAvioni() {
		return avioni;
	}
	
	public Aviokompanije getAviokompanije() {
		return aviokompanije;
	}

	public Korisnici getKorisnici() {
		return korisnici;
	}

	
	
	

}
