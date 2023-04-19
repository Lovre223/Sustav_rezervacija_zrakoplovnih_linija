/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.util;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.hibernate.Session;
import zavrsnirad.model.Aviokompanija;
import zavrsnirad.model.Avion;
import zavrsnirad.model.Korisnik;
import zavrsnirad.model.Let;
import zavrsnirad.model.Rezervacija;

/**
 *
 * @author lovre
 */
public class PocetniInsert {

    private static final int BROJ_AVIONA = 100;
    private static final int BROJ_AVIOKOMPANIJA = 50;
    private static final int BROJ_KORISNIKA = 500;
    private static final int BROJ_LETOVA = 400;
    private static final int BROJ_REZERVACIJA = 100;

    private Faker faker;
    private List<Avion> avioni;
    private List<Aviokompanija> aviokompanije;
    private List<Korisnik> korisnici;
    private List<Rezervacija> rezervacije;
    private List<Let> letovi;

    private Session session;

    public PocetniInsert() {
        faker = new Faker();
        avioni = new ArrayList<>();
        aviokompanije = new ArrayList<>();
        korisnici = new ArrayList<>();

        session = HibernateUtil.getSession();
        session.beginTransaction();

        kreirajAvione();
        kreirajAviokompanije();
        kreirajKorisnike();
        kreirajLetove();
        

        session.getTransaction().commit();

    }

    private void kreirajAvione() {
        Avion a;

        for (int i = 0; i < BROJ_AVIONA; i++) {
            a = new Avion();

            a.setNaziv(faker.aviation().aircraft());
            a.setKapacitet(faker.number().numberBetween(0, 300));

            session.persist(a);
            avioni.add(a);

        }

    }

    private void kreirajAviokompanije() {
        Aviokompanija a;

        for (int i = 0; i < BROJ_AVIOKOMPANIJA; i++) {

            a = new Aviokompanija();

            a.setNaziv(faker.company().name());

            session.persist(a);
            aviokompanije.add(a);

        }

    }

    private void kreirajKorisnike() {
        Korisnik k;
        for (int i = 0; i < BROJ_KORISNIKA; i++) {
            k = new Korisnik();

            k.setIme(faker.name().firstName());
            k.setPrezime(faker.name().lastName());
            k.setEmail(faker.internet().emailAddress());
            k.setAdresa(faker.address().streetAddress());
            //k.setOib(Alati.dovuciOib());

            session.persist(k);
            korisnici.add(k);

        }

    }

    private void kreirajLetove() {

        Let l;
        List<Rezervacija> k;
        Rezervacija r;
        for (int i = 0; i < BROJ_LETOVA; i++) {
            l = new Let();

            l.setBr_leta(faker.number().randomDigit());
            l.setCijena(new BigDecimal(faker.number().numberBetween(800, 1200)));
            l.setLuka_dolazak(faker.aviation().airport());
            l.setLuka_polazak(faker.aviation().airport());
            l.setVrijeme_polaska(faker.date().birthday());
            l.setVijeme_dolaska(faker.date().birthday());
            l.settrajanjeleta(faker.number().numberBetween(30, 1200));
            l.setAvion(avioni.get(sb(0, BROJ_AVIONA - 1)));
            l.setAviokompanija(aviokompanije.get(sb(0, BROJ_AVIOKOMPANIJA - 1)));
            
            
            
            k = new ArrayList<>();
            session.persist(l);

          
            for (int j = 0; j<sb(10,20); j++) {
                r = new Rezervacija();
                
                r.setLet(l);
                r.setKorisnik(korisnici.get(sb(0, BROJ_KORISNIKA - 1)));
                r.setKlasa(faker.animal().name());
                
                session.persist(r);

                k.add(r);

            }
            
            l.setRezervacije(k);
            session.persist(l);
            
        }

    }

    private int sb(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private String dovucioib() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
