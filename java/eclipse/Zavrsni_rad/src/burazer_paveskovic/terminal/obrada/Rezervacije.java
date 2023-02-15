package burazer_paveskovic.terminal.obrada;

import java.util.ArrayList;
import java.util.List;

import burazer_paveskovic.terminal.model.Rezervacija;

public class Rezervacije {

	private List<Rezervacija> rezervacije;

	public Rezervacije() {
		super();
		rezervacije = new ArrayList<>();
	}

	public Rezervacije(List<Rezervacija> rezervacije) {
		super();
		this.rezervacije = rezervacije;
	}

	public List<Rezervacija> getRezervacije() {
		return rezervacije;
	}

	public void setRezervacije(List<Rezervacija> rezervacije) {
		this.rezervacije = rezervacije;
	}

}
