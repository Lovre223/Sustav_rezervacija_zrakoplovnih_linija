package burazer_paveskovic.terminal.obrada;

import java.util.ArrayList;
import java.util.List;

import burazer_paveskovic.terminal.Pomocno;
import burazer_paveskovic.terminal.Start;
import burazer_paveskovic.terminal.model.Aviokompanija;

public class Aviokompanije {

	private List<Aviokompanija> aviokompanije;
	private Start start;

	public Aviokompanije(Start start) {
		super();
		this.start = start;
		aviokompanije = new ArrayList<>();
	}

	public void izbornik() {
		System.out.println("");
		System.out.println("Aviokompanije izbornik");
		System.out.println("1. Pregled svih aviokompanija");
		System.out.println("2. Unos aviokompanija");
		System.out.println("3. Promjena aviokopanija");
		System.out.println("4. Brisanje aviokompanija");
		System.out.println("5. Izlaz");

		odabirUIzborniku();

	}

	private void odabirUIzborniku() {
		switch (Pomocno.unos("Odaberite jednu od opcija: ", 1, 5)) {

		case 1:
			pregled(true);
			break;
		case 2:
			unos();
			break;
		case 3:
			promjena();
			break;
		case 4:
			brisanje();
			break;
		case 5:
			start.glavniizbornik();
		}

	}

	private void brisanje() {
		pregled(false);
		
		int br = Pomocno.unos("Odaberite koju aviokompaniju želite obrisati: ", 1, aviokompanije.size());
		
		aviokompanije.remove(br-1);
		
		izbornik();
		
	}

	private void promjena() {
		pregled(false);
		
		int br = Pomocno.unos("Odaberite aviokopmaniju koju želite promijeniti: ", 1, aviokompanije.size());
		
		Aviokompanija a = aviokompanije.get(br-1);
		
		a.setNaziv(Pomocno.unosTeksta("Promijenite naziv: "));
		
		izbornik();
	}

	private void unos() {
		aviokompanije.add(unosaviokompanija());

		izbornik();

	}

	private Aviokompanija unosaviokompanija() {
		Aviokompanija a = new Aviokompanija();

		a.setNaziv(Pomocno.unosTeksta("Unesi naziv aviokopanije: "));

		return a;
	}

	public void pregled(boolean prikazGlavnogIzbornika) {

		int br = 1;
		for (Aviokompanija a : aviokompanije) {

			System.out.println(br++ + ". " + a);

		}

		System.out.println("*******");

		if (prikazGlavnogIzbornika) {

			izbornik();

		}

	}

	public Aviokompanije(List<Aviokompanija> aviokompanije, Start start) {
		super();
		this.aviokompanije = aviokompanije;
		this.start = start;
	}

	public List<Aviokompanija> getAviokompanije() {
		return aviokompanije;
	}

	public void setAviokompanije(List<Aviokompanija> aviokompanije) {
		this.aviokompanije = aviokompanije;
	}

	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		this.start = start;
	}

}
