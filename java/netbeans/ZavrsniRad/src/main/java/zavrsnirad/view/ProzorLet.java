/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsnirad.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DateTimePicker;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import zavrsnirad.controller.ObradaAviokompanija;
import zavrsnirad.controller.ObradaAvion;
import zavrsnirad.controller.ObradaLet;
import zavrsnirad.model.Aviokompanija;
import zavrsnirad.model.Avion;
import zavrsnirad.model.Let;
import zavrsnirad.util.AppException;

/**
 *
 * @author lovre
 */
public class ProzorLet extends javax.swing.JFrame {

    private ObradaLet obrada;

    /**
     * Creates new form ProzorLet
     */
    public ProzorLet() {
        initComponents();
        obrada = new ObradaLet();

        ucitajAvione();
        ucitajAviokompanije();
        definirajDatumPolaska();
        definirajDatumDolaska();
        ucitaj();
    }

    private void ucitaj() {
        DefaultListModel<Let> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();
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
        jLabel1 = new javax.swing.JLabel();
        txtBrojLeta = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        txtCijena = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbAvioni = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbAviokompanija = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dtpVrijemeDolaska = new com.github.lgooddatepicker.components.DateTimePicker();
        dtpVrijemePolaska = new com.github.lgooddatepicker.components.DateTimePicker();
        jLabel7 = new javax.swing.JLabel();
        txtTrajanjeLeta = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Broj leta");

        txtBrojLeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrojLetaActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        txtCijena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCijenaActionPerformed(evt);
            }
        });

        jLabel2.setText("Cijena ");

        jLabel3.setText("Avion");

        jLabel4.setText("Aviokompanija");

        jLabel5.setText("Vrijeme polaska");

        jLabel6.setText("Vrijeme dolaska");

        jLabel7.setText("Trajanje leta");

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Izlaz");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDodaj)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(txtBrojLeta, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(txtCijena, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(cmbAvioni, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbAviokompanija, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(dtpVrijemeDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpVrijemePolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrajanjeLeta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBrojLeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbAvioni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbAviokompanija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(dtpVrijemePolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(dtpVrijemeDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTrajanjeLeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnDodaj)
                .addGap(99, 99, 99))
        );

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
        obrada.setEntitet(new Let());

        dodajNovi();

        try {
            obrada.create();
            ucitaj();
        } catch (AppException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());

        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void txtBrojLetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrojLetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrojLetaActionPerformed

    private void txtCijenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCijenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCijenaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     new ProzorIzbornik().setVisible(true);
     dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JComboBox<Aviokompanija> cmbAviokompanija;
    private javax.swing.JComboBox<Avion> cmbAvioni;
    private com.github.lgooddatepicker.components.DateTimePicker dtpVrijemeDolaska;
    private com.github.lgooddatepicker.components.DateTimePicker dtpVrijemePolaska;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Let> lstPodaci;
    private javax.swing.JTextField txtBrojLeta;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtTrajanjeLeta;
    // End of variables declaration//GEN-END:variables

    private void dodajNovi() {
        var l = obrada.getEntitet();

        try {
            l.setBr_leta(Integer.parseInt(txtBrojLeta.getText()));
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(getRootPane(), "Treba biti broj");

        }

    }

    private void napuniView() {
        var l = obrada.getEntitet();

        txtBrojLeta.setText(String.valueOf(l.getBr_leta()));
        txtCijena.setText(String.valueOf(l.getCijena()));
        cmbAvioni.setSelectedItem(l.getAvion());
        cmbAviokompanija.setSelectedItem(l.getAviokompanija());
        
        LocalDate ld = l.getVrijeme_polaska().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        dtpVrijemePolaska.datePicker.setDate(ld);
        LocalTime lt = l.getVrijeme_polaska().toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        dtpVrijemePolaska.timePicker.setTime(lt);
        
        LocalDate ldd = l.getVijeme_dolaska().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        dtpVrijemeDolaska.datePicker.setDate(ld);
        LocalTime ltd = l.getVijeme_dolaska().toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        dtpVrijemeDolaska.timePicker.setTime(lt);
        
         /* if(l.getVijeme_dolaska()!=null){
              LocalDate ld = l.getVijeme_dolaska().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
              dpDatumDolaska.setDate(ld);
        }else{
            dpDatumDolaska.setDate(null);
        }
          
            if(l.getVrijeme_polaska()!=null){
              LocalDate ld = l.getVrijeme_polaska().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
              dpDatumPolaska.setDate(ld);
        }else{
            dpDatumPolaska.setDate(null);*/
        //}
        
        

    }

    private void ucitajAvione() {
        DefaultComboBoxModel<Avion> m = new DefaultComboBoxModel<>();
        Avion a = new Avion();
        a.setSifra(0);
        a.setNaziv("Nije odabrano");
        m.addElement(a);

        m.addAll(new ObradaAvion().read());
        cmbAvioni.setModel(m);
        cmbAvioni.repaint();

    }

    private void ucitajAviokompanije() {
        DefaultComboBoxModel<Aviokompanija> m = new DefaultComboBoxModel<>();
        Aviokompanija a = new Aviokompanija();
        a.setSifra(0);
        a.setNaziv("Nije odabrano");
        m.addElement(a);

        m.addAll(new ObradaAviokompanija().read());
        cmbAviokompanija.setModel(m);
        cmbAviokompanija.repaint();
    }

    private void definirajDatumPolaska() {
        DatePickerSettings dps = new DatePickerSettings(Locale.of("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd. MM. YYY. ");
        dps.setTranslationClear("Očisti");
       dtpVrijemePolaska.datePicker.setSettings(dps);
        
       TimePickerSettings tps = new TimePickerSettings(Locale.of("hr", "HR"));
       tps.setFormatForDisplayTime("HH:MM");
      
       
        
       
        
        
        
        
    }
    
    private void definirajDatumDolaska(){
         DatePickerSettings dps = new DatePickerSettings(Locale.of("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd. MM. YYY. ");
        dps.setTranslationClear("Očisti");
       dtpVrijemeDolaska.datePicker.setSettings(dps);
        
       TimePickerSettings tps = new TimePickerSettings(Locale.of("hr", "HR"));
       tps.setFormatForDisplayTime("HH:MM");
      

}
}
