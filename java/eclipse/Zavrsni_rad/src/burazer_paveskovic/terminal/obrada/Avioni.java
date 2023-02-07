package burazer_paveskovic.terminal.obrada;

import java.util.ArrayList;
import java.util.List;

import burazer_paveskovic.terminal.Pomocno;
import burazer_paveskovic.terminal.Start;
import burazer_paveskovic.terminal.model.Avion;

public class Avioni {

	private List<Avion> avioni;
	private Start start;

	public Avioni(Start start) {
		super();
		this.start = start;
		avioni = new ArrayList<>();
	}

	public Avioni(List<Avion> avioni, Start start) {
		super();
		this.avioni = avioni;
		this.start = start;
	}

	public void izbornik() {
		System.out.println("");
		System.out.println("Avioni izbornik");
		System.out.println("1. Pregled aviona");
		System.out.println("2. Unos aviona");
		System.out.println("3. Brisanje aviona");
		System.out.println("4. Promjena");
		System.out.println("5. Izlaz");

		odabirizbornika();
	}

	private void odabirizbornika() {
		switch (Pomocno.unos("Odaberite opciju: ", 1, 5)) {

		case 1:
			pregled(true);
			break;
		case 2:
			unos();
			break;
		case 3:
			if (avioni.size() == 0) {

				System.out.println("Nema aviona za brisanje");
				izbornik();

			} else {
				brisanje();
				break;
			}
		case 4:
			if (avioni.size() == 0) {

				System.out.println("Nema aviona za mijenjanje");
				izbornik();

			} else {
				promjena();
				break;
			}
		case 5:
			start.glavniizbornik();
		}
	}

	private void promjena() {
		pregled(false);

		int br = Pomocno.unos("Odaberite avion koji želite mijenjati: ", 1, avioni.size());

		Avion a = avioni.get(br - 1);

		a.setNaziv(Pomocno.unosTeksta("Unesite naziv aviona: "));

		izbornik();

	}

	private void brisanje() {
		pregled(false);

		int br = Pomocno.unos("Odaberi ono što želiš brisati: ", 1, avioni.size());

		avioni.remove(br - 1);

		izbornik();

	}

	private void unos() {
		avioni.add(unosaviona());

		izbornik();

	}

	private Avion unosaviona() {
		Avion a = new Avion();

		a.setNaziv(Pomocno.unosTeksta("Unesite naziv aviona: "));
		a.setKapacitet(Pomocno.unos("Unesite kapacitet: ", 1, Integer.MAX_VALUE));

		return a;
	}

	public void pregled(boolean prikaziIzbornik) {
		int br = 1;

		for (Avion a : avioni) {
			System.out.println(br++ + ". " + a);
		}
		System.out.println("*********");

		if (prikaziIzbornik) {

			izbornik();
		}

	}

	public List<Avion> getAvioni() {
		return avioni;
	}

	public void setAvioni(List<Avion> avioni) {
		this.avioni = avioni;
	}

}
