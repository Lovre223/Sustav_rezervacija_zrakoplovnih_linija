package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Let extends Entitet {

    private int br_leta;
    private Date vrijeme_polaska;
    private Date vijeme_dolaska;
    private BigDecimal cijena;
    private String luka_polazak;
    private String luka_dolazak;
    private int trajanjeleta;

    @ManyToOne
    private Avion avion;
    @ManyToOne
    private Aviokompanija aviokompanija;

    @OneToMany(mappedBy = "let")
    private List<Rezervacija> rezervacije;
   
    public Let() {
        super();

    }

    public Let(int sifra, int br_leta, Date vrijeme_polaska, Date vijeme_dolaska, BigDecimal cijena,
            String luka_polazak, String luka_dolazak, int trajanjeleta, Avion avion,
            Aviokompanija aviokompanija, List<Rezervacija> rezervacije) {
        super(sifra);
        this.br_leta = br_leta;
        this.vrijeme_polaska = vrijeme_polaska;
        this.vijeme_dolaska = vijeme_dolaska;
        this.cijena = cijena;
        this.luka_polazak = luka_polazak;
        this.luka_dolazak = luka_dolazak;
        this.trajanjeleta = trajanjeleta;
        this.avion = avion;
        this.aviokompanija = aviokompanija;
        this.rezervacije = rezervacije;

    }

    public int getBr_leta() {
        return br_leta;
    }

    public void setBr_leta(int br_leta) {
        this.br_leta = br_leta;
    }

    public Date getVrijeme_polaska() {
        return vrijeme_polaska;
    }

    public void setVrijeme_polaska(Date vrijeme_polaska) {
        this.vrijeme_polaska = vrijeme_polaska;
    }

    public Date getVijeme_dolaska() {
        return vijeme_dolaska;
    }

    public void setVijeme_dolaska(Date vijeme_dolaska) {
        this.vijeme_dolaska = vijeme_dolaska;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public String getLuka_polazak() {
        return luka_polazak;
    }

    public void setLuka_polazak(String luka_polazak) {
        this.luka_polazak = luka_polazak;
    }

    public String getLuka_dolazak() {
        return luka_dolazak;
    }

    public void setLuka_dolazak(String luka_dolazak) {
        this.luka_dolazak = luka_dolazak;
    }

    public int gettrajanjeleta() {
        return trajanjeleta;
    }

    public void settrajanjeleta(int trajanjeleta) {
        this.trajanjeleta = trajanjeleta;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Aviokompanija getAviokompanija() {
        return aviokompanija;
    }

    public void setAviokompanija(Aviokompanija aviokompanija) {
        this.aviokompanija = aviokompanija;
    }


    public List<Rezervacija> getRezervacije() {
        return rezervacije;
    }

    public void setRezervacije(List<Rezervacija> rezervacije) {
        //this.rezervacije = rezervacije;
    }
    
    
    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (br_leta + " " + avion + " " + aviokompanija + " " + cijena);
    }

}
