/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Korisnik;
import zavrsnirad.util.Alati;
import zavrsnirad.util.AppException;

/**
 *
 * @author lovre
 */
public  class ObradaKorisnik extends Obrada<Korisnik>{

     public List<Korisnik> read() {
        return session.createQuery("from Korisnik", 
                Korisnik.class).list();
    }
     
     public List<Korisnik> read(String uvjet) {
        uvjet=uvjet.trim();
        uvjet = "%" + uvjet + "%";
       return session.createQuery("from Korisnik "
               + " where concat(ime,' ',prezime,' ',ime) "
               + " like :uvjet "
               + " order by prezime, ime ", 
               Korisnik.class)
               .setParameter("uvjet", uvjet)
               .setMaxResults(100)
               .list();
    }
     
     
     public List<Korisnik> read(String uvjet, boolean traziOdPocetkaImena){
            uvjet = uvjet.trim();
            if(traziOdPocetkaImena){
                uvjet = uvjet + "%";
                
            }else{
                   uvjet = "%" + uvjet + "%";
            }
     
            return session.createQuery("from Korisnik "
               + " where concat(ime,' ',prezime,' ',ime) "
               + " like :uvjet "
               + " order by prezime, ime ", 
               Korisnik.class)
               .setParameter("uvjet", uvjet)
               .setMaxResults(12)
               .list();
     
     }
  

    @Override
    protected void kontrolaUnos() throws AppException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaEmail();
        kontrolaOib();
        kontrolaAdresa();

    }

    @Override
    protected void kontrolaPromjena() throws AppException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaEmail();
        kontrolaOib();
        kontrolaAdresa();

    }

    @Override
    protected void kontrolaBrisanje() throws AppException {
      if(entitet.getLetovi()!= null &&
                !entitet.getLetovi().isEmpty()){
        throw new AppException("Korisnik se ne može brisati"
                + " jer ima rezervaciju!! ");
        }
      }

    private void kontrolaIme() throws AppException {
        //kontrolaImeBroj();
        kontrolaImeNull();
        kontrolaImeSadrziBroj();

    }

    private void kontrolaImeBroj() throws AppException {
        boolean broj = false;

        try {
            Double.parseDouble(entitet.getIme());
            broj = true;
        } catch (Exception e) {
        }

        if (broj) {

            throw new AppException("Ime ne može biti broj");

        }

    }

    private void kontrolaImeNull() throws AppException {
        if (entitet.getIme() == null) {

            throw new AppException("Ime mora biti postavljeno");
        }

    }

    private void kontrolaImeSadrziBroj() throws AppException {

        char[] c = entitet.getIme().toCharArray();

        for (char ch : c) {

            if (Character.isDigit(ch)) {

                throw new AppException("Ime sadrži broj");

            }

        }

    }

    private void kontrolaPrezime() throws AppException {
        kontrolaPrezimeNull();
        kontrolaPrezimeSadrziBroj();

    }

    private void kontrolaPrezimeNull() throws AppException {
        if (entitet.getPrezime() == null) {

            throw new AppException("Ime mora biti postavljeno");
        }

    }

    private void kontrolaPrezimeSadrziBroj() throws AppException {
        char[] c = entitet.getPrezime().toCharArray();

        for (char ch : c) {

            if (Character.isDigit(ch)) {

                throw new AppException("Ime sadrži broj");

            }

        }

    }

    private void kontrolaOib() throws AppException {
        if (!Alati.kontrolaOIB(entitet.getOib())) {

            throw new AppException("Oib nije valjan");
        }

    }

    private void kontrolaEmail() throws AppException {
        kontrolaEmailNull();
    }

    private void kontrolaEmailNull() throws AppException {
        if (entitet.getEmail() == null) {

            throw new AppException("Email mora biti unesen");
        }

    }

    private void kontrolaAdresa() throws AppException {
        kontrolaAdresaNull();

    }

    private void kontrolaAdresaNull() throws AppException {
        if (entitet.getAdresa() == null) {

            throw new AppException("Adresa mora biti unesena");

        }
    }
}
