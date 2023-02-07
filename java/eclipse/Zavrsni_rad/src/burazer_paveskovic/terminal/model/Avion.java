package burazer_paveskovic.terminal.model;

public class Avion extends Entitet {

	private String naziv;
	private int kapacitet;

	public Avion() {
		super();
	}

	public Avion(int sifra, String naziv, int kapacitet) {
		super(sifra);
		this.naziv = naziv;
		this.kapacitet = kapacitet;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	
	@Override
	public String toString() {
		
		return naziv;
	}

}
