/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Avion;
import zavrsnirad.util.AppException;

/**
 *
 * @author lovre
 */
public class ObradaAvion extends Obrada<Avion> {

    @Override
    public List<Avion> read() {
        return session.createQuery("from Avion order by naziv ", Avion.class).list();

    }
    
     public List<Avion> read(String uvjet, boolean traziOdPocetka) {
            uvjet = uvjet.trim();
        if (traziOdPocetka) {
            uvjet = uvjet + "%";
        } else {
            uvjet = "%" + uvjet + "%";
        }

        return session.createQuery("from Avion " + "where naziv " + " like :uvjet " + "order by naziv",
                Avion.class).setParameter("uvjet", uvjet).setMaxResults(20).list();
            
            
        

    }

    

    @Override
    protected void kontrolaUnos() throws AppException {
        kontrolaNaziv();
        kontrolaKapacitet();

    }

    @Override
    protected void kontrolaPromjena() throws AppException {
          kontrolaKapacitet();
    
        
    }

    @Override
    protected void kontrolaBrisanje() throws AppException {
         if(entitet.getLetovi()!= null &&
                !entitet.getLetovi().isEmpty()){
        throw new AppException("Avion se ne može brisati"
                + " jer se nalazi na letu!! ");
    }

    }

    private void kontrolaNaziv() throws AppException {
        kontrolaNazivNull();
        kontrolaDupliuBazi();

    }

    private void kontrolaNazivNull() throws AppException {
        if (entitet.getNaziv() == null) {

            throw new AppException("Naziv mora biti postavljen");
        }

    }

    private void kontrolaDupliuBazi() throws AppException {
        List<Avion> avioni = null;

        try {
            avioni = session.createQuery("from Avion a " + "where a.naziv = :naziv ", Avion.class).setParameter("naziv", entitet.getNaziv()).list();
        } catch (Exception e) {

        }
        if (avioni != null && !avioni.isEmpty()) {

            throw new AppException("Avion s istim nazivom postoji u bazi");

        }

    }

    private void kontrolaKapacitet() throws AppException {
        kontrolaRaspon();

    }

    private void kontrolaRaspon() throws AppException {
        if (entitet.getKapacitet() > 300 || entitet.getKapacitet() <= 0) {

            throw new AppException("Kapacitet nije u željenom rasponu");

        }

    }

}
