/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import com.sun.jna.Native;
import jakarta.persistence.NoResultException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;
import zavrsnirad.model.Operater;
import zavrsnirad.util.Alati;
import zavrsnirad.util.AppException;

/**
 *
 * @author lovre
 */
public class ObradaOperater extends Obrada<Operater> {

    @Override
    public List<Operater> read() {
        return session.createQuery("from Operater ", Operater.class).list();

    }

    public void unosAdminOperatera() {
        Operater o = new Operater();

        o.setIme("Admin");
        o.setPrezime("Operater");
        o.setEmail("lovrep@gmail.com");
        o.setOib("23727908830");
        o.setLozinka(BCrypt.hashpw("lovre123", BCrypt.gensalt()).toCharArray());

        entitet = o;

        try {
            create();
        } catch (AppException ex) {
            System.out.println(ex.getPoruka());

        }

    }

    public Operater autoriziraj(String email, char[] lozinka) {
        Operater o;

        try {
            o = session.createQuery("from Operater o where o.email = :email", Operater.class).setParameter("email", email).getSingleResult();
        } catch (NoResultException e) {

            return null;

        }

        if (BCrypt.checkpw(new String(lozinka), new String(o.getLozinka()))) {

            return o;

        }

        return null;
    }

    @Override
    protected void kontrolaUnos() throws AppException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaEmail();
        kontrolaOib();
        kontrolaLozinka();

    }

    @Override
    protected void kontrolaPromjena() throws AppException {
    }

    @Override
    protected void kontrolaBrisanje() throws AppException {
    }

    private void kontrolaIme() throws AppException {
        kontrolaImeNull();

    }

    private void kontrolaImeNull() throws AppException {
        if (entitet.getIme() == null) {

            throw new AppException("Ime mora biti postavljeno");
        }

    }

    private void kontrolaPrezime() throws AppException {
        kontrolaPrezimeNull();

    }

    private void kontrolaPrezimeNull() throws AppException {
        if (entitet.getPrezime() == null) {

            throw new AppException("Ime mora biti postavljeno");
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

    private void kontrolaOib() throws AppException {
        if (!Alati.kontrolaOIB(entitet.getOib())) {

            throw new AppException("Oib nije valjan");
        }

    }

    private void kontrolaLozinka() throws AppException {
        kontrolaDuljine();
        kontrolaMaloVelikoSlovo();

    }

    private void kontrolaDuljine() throws AppException {
        if (entitet.getLozinka().length < 8) {

            throw new AppException("Premala duljina lozinke");

        }

    }

    private void kontrolaMaloVelikoSlovo() throws AppException {
        int brojacVelikih = 0;
        int brojacMalih = 0;
      
        
        char[] niz = entitet.getLozinka();

        for (char a : niz) {

            if (Character.isUpperCase(a)) {

                brojacVelikih++;
            } else {

                brojacMalih++;
            }

        }
        
        if(brojacVelikih == 0 || brojacMalih == 0){
        
            throw new AppException("Lozinka mora sadržavati barem jedno malo i veliko slovo");
        
        }

    }

}
