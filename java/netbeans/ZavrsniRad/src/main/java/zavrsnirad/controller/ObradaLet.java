/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.math.BigDecimal;
import java.util.List;
import zavrsnirad.model.Let;
import zavrsnirad.util.AppException;

/**
 *
 * @author lovre
 */
public class ObradaLet extends Obrada<Let> {

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
       
        
        
        
    }

    @Override
    protected void kontrolaPromjena() throws AppException {
    }

    @Override
    protected void kontrolaBrisanje() throws AppException {
    }

    private void kontrolaBrojaLeta() throws AppException {
            kontrolaRaspon();
       
            
            

    }

    private void kontrolaRaspon() throws AppException {
            if(entitet.getBr_leta()<= 0 && entitet.getBr_leta()> Integer.MAX_VALUE){
            
                throw new AppException("Broj leta mora u željenom rasponu");
            }
        

    }       

    private void kontrolaCijena() throws AppException {
              if(entitet.getCijena() == null || entitet.getCijena().compareTo(BigDecimal.ZERO)<= 0 ||
                    entitet.getCijena().compareTo(new BigDecimal(1000)) == 1){
                    throw new AppException("Cijena mora biti postavljena, veća od 0 i manja od 10000");
            
            }

    }

    private void kontrolaTrajanjeLeta() {

        
    }

    private void kontrolaAvion() throws AppException {
            if(entitet.getAvion().getSifra()== 0){
            
                throw  new AppException("Obavezan unos aviona!!!");
            }

    }

    private void kontrolaAviokompanija() throws AppException {
            if(entitet.getAvion().getSifra()== 0){
            
            throw new  AppException("Obavezan unos aviokompanije!!!");
            }

    }

    
            
          
    
    

}
    

   
