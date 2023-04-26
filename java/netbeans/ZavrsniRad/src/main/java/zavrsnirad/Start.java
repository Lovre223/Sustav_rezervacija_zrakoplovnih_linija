/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zavrsnirad;

import org.hibernate.Hibernate;
import zavrsnirad.controller.ObradaOperater;
import zavrsnirad.util.HibernateUtil;
import zavrsnirad.util.PocetniInsert;
import zavrsnirad.view.SplashScreen;

/**
 *
 * @author lovre
 */
public class Start {

    public static void main(String[] args) {
        
        
      //new PocetniInsert();
     //new ObradaOperater().unosAdminOperatera();
     new SplashScreen().setVisible(true);
    }
}
