/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import jakarta.persistence.NoResultException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;
import zavrsnirad.model.Operater;
import zavrsnirad.util.AppException;

/**
 *
 * @author lovre
 */
public class ObradaOperater extends Obrada<Operater>{

      @Override
    public List<Operater> read() {
            return session.createQuery("from Operater ", Operater.class).list();
        
    }
    
    
    public void unosAdminOperatera(){
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
    
    
    public Operater autoriziraj(String email, char[] lozinka){
            Operater o;
                
        try {
            o = session.createQuery("from Operater o where o.email = :email", Operater.class).setParameter("email", email).getSingleResult();
        } catch (NoResultException e) {
            
            return null;
            
        }
            
         if(BCrypt.checkpw(new String(lozinka), new String(o.getLozinka()))){
         
             return o;
         
         } 
                
       return null;
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
