package burazer_paveskovic.terminal.obrada;

import java.util.ArrayList;
import java.util.List;

import burazer_paveskovic.terminal.Pomocno;
import burazer_paveskovic.terminal.Start;
import burazer_paveskovic.terminal.model.Let;

public class Letovi {

	private List<Let> letovi;
	private Start start;

	public void izbornik() {
		System.out.println("");
		System.out.println("Let izbornik");
		System.out.println("1. Pregled svih letova");
		System.out.println("2. Unos letova");
		System.out.println("3. Promjena leta");
		System.out.println("4. Brisanje leta");
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
		
		int br = (Pomocno.unos("Odaberite let koji bi brisali: ", 1, letovi.size()));
		
		letovi.remove(br-1);
		
		izbornik();
		
	}

	private void promjena() {
		pregled(false);

		int br = (Pomocno.unos("Odaberite koji bi let promijenili: ", 1, letovi.size()));

		Let l = letovi.get(br - 1);
		l.setSifra(Pomocno.unos("Unesite šifru leta: ", 1, Integer.MAX_VALUE));
		l.setBr_leta(Pomocno.unos("Unesite broj leta: ", 1, Integer.MAX_VALUE));
		l.setLuka_dolazak(Pomocno.unosTeksta("Unesite luku iz koje krečete: "));
		l.setLuka_polazak(Pomocno.unosTeksta("Unesite luku u koju dolazite: "));
		l.setCijena(Pomocno.unosdecimala("Upisi cijenu: "));
		// l.setVijeme_dolaska(Pomocno.unosDolazakPolazak("Unesi vrijeme dolaska: "));
		// l.setVrijeme_polaska(Pomocno.unosDolazakPolazak("Unesi vrijeme polaska: "));

		start.getAvioni().pregled(false);

		int br1 = Pomocno.unos("Odaberi avion koji ćeš dodati: ", 1, start.getAvioni().getAvioni().size());

		l.setAvion(start.getAvioni().getAvioni().get(br1 - 1));

		start.getAviokompanije().pregled(false);

		br1 = Pomocno.unos("Odaberi aviokompaniju: ", 1, start.getAviokompanije().getAviokompanije().size());
		l.setAviokompanija(start.getAviokompanije().getAviokompanije().get(br1 - 1));

		while (true) {

			start.getKorisnici().pregled(false);

			br1 = Pomocno.unos("Odaberite korisnika za dodavanje: ", 1, start.getKorisnici().getKorisnici().size());
			l.getKorisnici().add(start.getKorisnici().getKorisnici().get(br - 1));

			if (Pomocno.unos("0 za kraj dodavanja polaznika:  ", 0, Integer.MAX_VALUE) == 0) {

				break;

			}
		}

		izbornik();

	}

	private void unos() {
		Let l = new Let();
		l.setSifra(Pomocno.unos("Unesite šifru leta: ", 1, Integer.MAX_VALUE));
		l.setBr_leta(Pomocno.unos("Unesite broj leta: ", 1, Integer.MAX_VALUE));
		l.setLuka_dolazak(Pomocno.unosTeksta("Unesite luku iz koje krečete: "));
		l.setLuka_polazak(Pomocno.unosTeksta("Unesite luku u koju dolazite: "));
		l.setCijena(Pomocno.unosdecimala("Upisi cijenu: "));
		// l.setVijeme_dolaska(Pomocno.unosDolazakPolazak("Unesi vrijeme dolaska: "));
		// l.setVrijeme_polaska(Pomocno.unosDolazakPolazak("Unesi vrijeme polaska: "));

		start.getAvioni().pregled(false);

		int br = Pomocno.unos("Odaberi avion koji ćeš dodati: ", 1, start.getAvioni().getAvioni().size());

		l.setAvion(start.getAvioni().getAvioni().get(br - 1));

		start.getAviokompanije().pregled(false);

		br = Pomocno.unos("Odaberi aviokompaniju: ", 1, start.getAviokompanije().getAviokompanije().size());
		l.setAviokompanija(start.getAviokompanije().getAviokompanije().get(br - 1));

		while (true) {

			start.getKorisnici().pregled(false);

			br = Pomocno.unos("Odaberite korisnika za dodavanje: ", 1, start.getKorisnici().getKorisnici().size());
			l.getKorisnici().add(start.getKorisnici().getKorisnici().get(br - 1));

			if (Pomocno.unos("0 za kraj dodavanja polaznika:  ", 0, Integer.MAX_VALUE) == 0) {

				break;

			}
		}

		letovi.add(l);

		izbornik();
	}

	private void pregled(boolean prikazizbornika) {
		System.out.println("Prikaz svih letova");
		int br = 1;
		for (Let l : letovi) {

			System.out.println(br++ + ". " + l);

		}
		System.out.println("*******");

		if (prikazizbornika) {

			izbornik();
		}

	}

	public Letovi(Start start) {
		super();
		this.start = start;
		letovi = new ArrayList<>();
	}

	public Letovi(List<Let> letovi, Start start) {
		super();
		this.letovi = letovi;
		this.start = start;
	}

	public List<Let> getLetovi() {
		return letovi;
	}

	public void setLetovi(List<Let> letovi) {
		this.letovi = letovi;
	}

}
