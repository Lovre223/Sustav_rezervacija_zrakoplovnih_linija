/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsnirad.view;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import zavrsnirad.controller.ObradaAvion;
import zavrsnirad.model.Avion;
import zavrsnirad.model.Let;
import zavrsnirad.util.AppException;

/**
 *
 * @author lovre
 */
public class ProzorAvioni extends javax.swing.JFrame {

    private ObradaAvion obrada;

    /**
     * Creates new form ProzorAvioni
     */
    public ProzorAvioni() {
        initComponents();
        obrada = new ObradaAvion();
        
        btnTrazi.setText("🔍");
        
        setTitle("Pregled aviona");

        ucitaj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKapacitet = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnBrisanje = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstLet = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        btnPromjeni = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, 138, 227));

        jLabel2.setText("Naziv");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 34, -1, -1));

        txtNaziv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNazivActionPerformed(evt);
            }
        });
        getContentPane().add(txtNaziv, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 56, 219, -1));

        jLabel3.setText("Kapacitet");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 96, 73, 14));

        txtKapacitet.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtKapacitet, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 128, 219, -1));

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });
        getContentPane().add(btnDodaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 177, -1, -1));

        btnBrisanje.setText("Brisanje");
        btnBrisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeActionPerformed(evt);
            }
        });
        getContentPane().add(btnBrisanje, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 212, -1, -1));

        lstLet.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstLet);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 34, 193, 240));

        jLabel4.setText("Letovi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 9, -1, -1));

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });
        getContentPane().add(btnPromjeni, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 177, -1, -1));
        getContentPane().add(txtUvjet, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 82, -1));

        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrazi, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 6, -1, 22));

        jPanel1.setBackground(new java.awt.Color(253, 253, 216));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 290));

        jMenu2.setText("Izlaz");

        jMenuItem1.setText("Izlaz");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        if (lstPodaci.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstPodaci.getSelectedValue());

        napuniView();


    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Avion());

        dodajNovi();

        try {
            obrada.create();
            ucitaj();
        } catch (AppException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());

        }


    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
        if (lstPodaci.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Odaberite jedan od aviona");
            return;

        }

        if (JOptionPane.showConfirmDialog(getRootPane(), "Sigurno želite obrisati " + obrada.getEntitet().getNaziv() + "?", "Brisanje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {

            return;

        }
        try {

            obrada.delete();
            ucitaj();

        } catch (AppException ex) {

            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }


    }//GEN-LAST:event_btnBrisanjeActionPerformed

    private void txtNazivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNazivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNazivActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed

        if (lstPodaci.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Odaberite jedan od aviona za promjenu");
            return;

        }

        dodajNovi();

        try {
            obrada.update();
            ucitaj();
        } catch (AppException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());

        }


    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
       ucitaj();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new ProzorIzbornik().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ucitaj() {
        DefaultListModel<Avion> m = new DefaultListModel<>();
        m.addAll(obrada.read(txtUvjet.getText(), true));
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Let> lstLet;
    private javax.swing.JList<Avion> lstPodaci;
    private javax.swing.JTextField txtKapacitet;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private void napuniView() {
        var a = obrada.getEntitet();

        txtNaziv.setText(a.getNaziv());

        try {
            txtKapacitet.setText(String.valueOf(a.getKapacitet()));
        } catch (Exception e) {
            txtKapacitet.setText("");

        }

        DefaultListModel<Let> m = new DefaultListModel<>();

        if (a.getLetovi() != null && !a.getLetovi().isEmpty()) {

            for (Let l : a.getLetovi()) {

                m.addElement(l);

            }

        }

        lstLet.setModel(m);
        lstLet.repaint();

      
    }

    private void dodajNovi() {

        var a = obrada.getEntitet();

        a.setNaziv(txtNaziv.getText());

        try {
            a.setKapacitet(Integer.parseInt(txtKapacitet.getText()));
        } catch (Exception e) {

            a.setKapacitet(0);
        }

    }
}
