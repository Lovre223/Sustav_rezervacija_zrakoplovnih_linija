/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Rezervacija;
import zavrsnirad.util.AppException;

/**
 *
 * @author lovre
 */
public class ObradaRezervacija extends Obrada<Rezervacija> {

    @Override
    public List<Rezervacija> read() {
       return  session.createQuery("from Rezervacija", Rezervacija.class).list();
    }

    @Override
    protected void kontrolaUnos() throws AppException {
        
    }

    @Override
    protected void kontrolaPromjena() throws AppException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws AppException {
       
    }
    
}
