/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsnirad.view;

import zavrsnirad.controller.ObradaOperater;
import zavrsnirad.model.Operater;
import zavrsnirad.util.Aplikacija;

/**
 *
 * @author lovre
 */
public class ProzorLogin extends javax.swing.JFrame {
        
        private ObradaOperater obrada;
    /**
     * Creates new form ProzorLogin
     */
    public ProzorLogin() {
        initComponents();
        obrada = new ObradaOperater();
        setTitle("Airline Reservation System Login");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pswLozinka = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnPrijava = new javax.swing.JButton();
        lblPoruka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Email");

        jLabel2.setText("Passsword");

        txtEmail.setText("lovrep@gmail.com");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        pswLozinka.setText("lovre123");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Login Page");

        btnPrijava.setText("Prijava");
        btnPrijava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrijavaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnPrijava))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(pswLozinka))
                            .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pswLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrijava)
                .addGap(18, 18, 18)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrijavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrijavaActionPerformed
        autoriziraj();
    }//GEN-LAST:event_btnPrijavaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrijava;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JPasswordField pswLozinka;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

    private void autoriziraj() {
             if(txtEmail.getText().isEmpty()){
                    lblPoruka.setText("Obavezan email");
                 
              return;
             } 
             
             if(pswLozinka.getPassword().length == 0){
                    
                lblPoruka.setText("Obavezno lozinka");
                return;
             
             }
             
             
             Operater o = obrada.autoriziraj(txtEmail.getText(), pswLozinka.getPassword());
             
            if(o == null){
                lblPoruka.setText("Neispravna kombinacija email i lozinka");
                return;
                
            }
            
            Aplikacija.OPERATER = o;
            
            new ProzorIzbornik().setVisible(true);
            dispose();
            
    
    }
}