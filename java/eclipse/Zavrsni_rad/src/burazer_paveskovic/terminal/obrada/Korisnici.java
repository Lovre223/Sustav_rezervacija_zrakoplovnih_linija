package burazer_paveskovic.terminal.obrada;

import java.util.ArrayList;
import java.util.List;

import burazer_paveskovic.terminal.Pomocno;
import burazer_paveskovic.terminal.Start;
import burazer_paveskovic.terminal.model.Korisnik;

public class Korisnici {

	private List<Korisnik> korisnici;
	private Start start;

	public void izbornik() {

		System.out.println("");
		System.out.println("Korisnik izbornik");
		System.out.println("Opcije");
		System.out.println("1. Pregled svih korisnika");
		System.out.println("2. Unos novog korisnika");
		System.out.println("3. Promjena postojećeg korisnika");
		System.out.println("4. Brisanje korisnika ");
		System.out.println("5. Natrag");

		odabirizbornik();

	}

	private void odabirizbornik() {
		switch (Pomocno.unos("Odaberite opciju", 1, 5)) {

		case 1:
			pregled(true);
			break;
		case 2:
			unoskorisnika();
			break;
		case 3:
			if (korisnici.size() == 0) {

				System.out.println("Nema korisnika koje bi mijenjali");
				izbornik();
			}
			promjena();
			break;

		case 4:
			if (korisnici.size() == 0) {

				System.out.println("Nema korisnika za brisanje");
				izbornik();
			}
			brisanje();
			break;
		case 5:
			start.glavniizbornik();
		}

	}

	private void brisanje() {
		pregled(false);
		int br = Pomocno.unos("Odaberite korisnika kojeg bi brisali: ", 1, korisnici.size());

		korisnici.remove(br - 1);

		izbornik();

	}

	private void promjena() {
		pregled(false);

		int br = Pomocno.unos("Odaberite korisnika kojeg bi promijenili: ", 1, korisnici.size());

		Korisnik k = korisnici.get(br - 1);

		k.setIme(Pomocno.unosTeksta("Unesite ime"));
		k.setSifra(Pomocno.unos("Unesi šifru korisnika: ", 1, Integer.MAX_VALUE));
		k.setPrezime(Pomocno.unosTeksta("Unesite prezime: "));
		k.setAdresa(Pomocno.unosTeksta("Unesite adresu: "));
		k.setEmail(Pomocno.unosTeksta("Unesite email: "));
		k.setOib(Pomocno.unosoiba("Unesite oib: "));

		izbornik();

	}

	private void unoskorisnika() {
		korisnici.add(unos());
		izbornik();
	}

	
	private Korisnik unos() {
		Korisnik k = new Korisnik();
		k.setSifra(Pomocno.unos("Unesi šifru korisnika: ", 1, Integer.MAX_VALUE));
		k.setIme(Pomocno.unosTeksta("Unesi ime: "));
		k.setPrezime(Pomocno.unosTeksta("Unesite prezime: "));
		k.setAdresa(Pomocno.unosTeksta("Unesite adresu: "));
		k.setEmail(Pomocno.unosTeksta("Unesite email: "));
		k.setOib(Pomocno.unosoiba("Unesite oib: "));

		return k;
	}

	public void pregled(boolean prikaziIzbornik) {
		System.out.println("Korisnici u aplikaciji");
		int rb = 1;
		for (Korisnik k : korisnici) {
			System.out.println(rb++ + ". " + k);
		}
		System.out.println("------");
		if (prikaziIzbornik) {
			izbornik();
		}

	}

	public Korisnici(Start start) {
		super();
		this.start = start;
		korisnici = new ArrayList<>();
	}

	public Korisnici(List<Korisnik> korisnici, Start start) {
		super();
		this.korisnici = korisnici;
		this.start = start;
	}

	public List<Korisnik> getKorisnici() {
		return korisnici;
	}

	public void setKorisnici(List<Korisnik> korisnici) {
		this.korisnici = korisnici;
	}

	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		this.start = start;
	}

}
