/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Aviokompanija;
import zavrsnirad.util.AppException;

/**
 *
 * @author lovre
 */
public class ObradaAviokompanija extends Obrada<Aviokompanija> {

    @Override
    public List<Aviokompanija> read() {

        return session.createQuery("from Aviokompanija", Aviokompanija.class).list();

    }

    public List<Aviokompanija> read(String uvjet, boolean traziOdPocetka) {
        uvjet = uvjet.trim();

        if (traziOdPocetka) {
            uvjet = uvjet + "%";
        } else {
            uvjet = "%" + uvjet + "%";

        }

        return session.createQuery("from Aviokompanija "
                + " where naziv "
                + " like :uvjet "
                + " order by naziv ",
                Aviokompanija.class)
                .setParameter("uvjet", uvjet)
                .setMaxResults(100)
                .list();

    }

    @Override
    protected void kontrolaUnos() throws AppException {
        kontrolaNaziv();

    }

    @Override
    protected void kontrolaPromjena() throws AppException {
        kontrolaNazivNull();

    }

    @Override
    protected void kontrolaBrisanje() throws AppException {
        if (entitet.getLetovi() != null
                && !entitet.getLetovi().isEmpty()) {
            throw new AppException("Aviokompanija se ne može brisati"
                    + " jer se nalazi na letu ");
        }

    }

    private void kontrolaNaziv() throws AppException {
        kontrolaNazivNull();
        kontrolaDupliUBazi();

    }

    private void kontrolaNazivNull() throws AppException {
        if (entitet.getNaziv() == null) {

            throw new AppException("Naziv mora biti postavljen");

        }

    }

    private void kontrolaDupliUBazi() throws AppException {
        List<Aviokompanija> aviokompanije = null;

        try {
            aviokompanije = session.createQuery("from Aviokompanija a" + " where a.naziv =: naziv", Aviokompanija.class).setParameter("naziv", entitet.getNaziv()).list();

        } catch (Exception e) {
        }

        if (aviokompanije != null && !aviokompanije.isEmpty()) {

            throw new AppException("Aviokomanija s istim nazivom postoji u bazi");
        }

    }

}
