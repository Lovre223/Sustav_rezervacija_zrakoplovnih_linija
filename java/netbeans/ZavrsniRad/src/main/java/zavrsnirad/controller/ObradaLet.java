/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

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
       
        
        
        
    }

    @Override
    protected void kontrolaPromjena() throws AppException {
    }

    @Override
    protected void kontrolaBrisanje() throws AppException {
    }

    private void kontrolaBrojaLeta() throws AppException {
            kontrolaRaspon();
            kontrolaSlovo();
           
            

    }

    private void kontrolaRaspon() throws AppException {
            if(entitet.getBr_leta()<= 0 && entitet.getBr_leta()> Integer.MAX_VALUE){
            
                throw new AppException("Broj leta mora u željenom rasponu");
            }
        

    }       

    private void kontrolaSlovo() throws AppException {
         String znak = Integer.toString(entitet.getBr_leta());
         char[] niz = znak.toCharArray();
                
           for(int i = 0;i<niz.length;i++){
                
                    if(!Character.isDigit(niz[i])){
                    
                        throw new AppException("Mora biti broj!!");
                    }
                    
           
           }     
            
          
    
    }

}
    

   
