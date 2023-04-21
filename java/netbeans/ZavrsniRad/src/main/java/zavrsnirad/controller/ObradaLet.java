/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.math.BigDecimal;
import java.util.List;
import zavrsnirad.model.Let;
import zavrsnirad.model.Rezervacija;
import zavrsnirad.util.AppException;

/**
 *
 * @author lovre
 */
public class ObradaLet extends Obrada<Let> {
    
    
     @Override
    public void create() throws AppException {
        if (entitet == null) {
            throw new AppException("Entitet je null");
        }

        kontrolaUnos();
         session.beginTransaction();
        session.persist(entitet);
        for(Rezervacija r : entitet.getRezervacije()){
            session.persist(r);
        }
        session.getTransaction().commit();

    }
    
    @Override
    public void update() throws AppException {
        if (entitet == null) {
            throw new AppException("Entitet je null");
        }

        kontrolaPromjena();
         session.beginTransaction();
        session.persist(entitet);
        for(Rezervacija r : entitet.getRezervacije()){
            session.persist(r);
        }
        session.getTransaction().commit();

    }

    @Override
    public List<Let> read() {

        return session.createQuery("from Let", Let.class).list();
    }

    @Override
    protected void kontrolaUnos() throws AppException {
        kontrolaBrojaLeta();
        kontrolaCijena();
        kontrolaTrajanjeLeta();
        kontrolaAvion();
        kontrolaAviokompanija();

        for (Rezervacija r : entitet.getRezervacije()) {
            kontrolaRezervacija(r);
        }

    }

    @Override
    protected void kontrolaPromjena() throws AppException {
        kontrolaCijena();
        kontrolaTrajanjeLeta();
        kontrolaAvion();
        kontrolaAviokompanija();

        for (Rezervacija r : entitet.getRezervacije()) {
            kontrolaRezervacija(r);
        }

    }

    public void kontrolaRezervacija(Rezervacija r) throws AppException {

        if (r.getKlasa() == null || r.getKlasa().isBlank()) {
            throw new AppException("Korisniku " + r.getKorisnik().getPrezime() + " nije unesena klasa");
        }

    }

    @Override
    protected void kontrolaBrisanje() throws AppException {
        if (entitet.getRezervacije() != null
                && !entitet.getRezervacije().isEmpty()) {
            throw new AppException("Let se ne može brisati"
                    + " jer ima rezervaciju/e ");
        }
    }

    private void kontrolaBrojaLeta() throws AppException {
        kontrolaRaspon();
        kontrolaDupliUBazi();

    }

    private void kontrolaRaspon() throws AppException {
        if (entitet.getBr_leta() <= 0 && entitet.getBr_leta() > Integer.MAX_VALUE) {

            throw new AppException("Broj leta mora biti u željenom rasponu");
        }

    }

    private void kontrolaCijena() throws AppException {
        if (entitet.getCijena() == null
                || entitet.getCijena().compareTo(BigDecimal.ZERO) <= 0
                || entitet.getCijena().compareTo(new BigDecimal(10000)) == 1) {
            throw new AppException("Cijena mora biti postavljena, "
                    + "veća od 0 i manja od 10000");
        }

    }

    private void kontrolaTrajanjeLeta() throws AppException {

        if (entitet.gettrajanjeleta() <= 0 && entitet.gettrajanjeleta() > Integer.MAX_VALUE) {

            throw new AppException("Trajanje leta mora biti u željenom rasponu");
        }

    }

    private void kontrolaAvion() throws AppException {
        if (entitet.getAvion().getSifra() == 0) {

            throw new AppException("Obavezan unos aviona!!!");
        }

    }

    private void kontrolaAviokompanija() throws AppException {
        if (entitet.getAvion().getSifra() == 0) {

            throw new AppException("Obavezan unos aviokompanije!!!");
        }

    }

    private void kontrolaDupliUBazi() throws AppException {
        List<Let> letovi = null;

        try {
            letovi = session.createQuery("from Let l " + "where l.br_leta = :br_leta ", Let.class).setParameter("br_leta", entitet.getBr_leta()).list();
        } catch (Exception e) {

        }
        if (letovi != null && !letovi.isEmpty()) {

            throw new AppException("Let s istim brojem postoji u bazi");

        }

    }

}
