/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsnirad.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DateTimePicker;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import zavrsnirad.controller.ObradaAviokompanija;
import zavrsnirad.controller.ObradaAvion;
import zavrsnirad.controller.ObradaKorisnik;
import zavrsnirad.controller.ObradaLet;
import zavrsnirad.model.Aviokompanija;
import zavrsnirad.model.Avion;
import zavrsnirad.model.Korisnik;
import zavrsnirad.model.Let;
import zavrsnirad.model.Rezervacija;
import zavrsnirad.util.AppException;

/**
 *
 * @author lovre
 */
public class ProzorLet extends javax.swing.JFrame {

    private ObradaLet obrada;
    private ObradaKorisnik obradaKorisnik;
    private DecimalFormat df;

    /**
     * Creates new form ProzorLet
     */
    public ProzorLet() {
        initComponents();
        obrada = new ObradaLet();
        obradaKorisnik  = new ObradaKorisnik();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.of("hr", "HR"));
        df = new DecimalFormat("###,##0.00", dfs);
        btnTrazi.setText("🔍");

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
        jLabel8 = new javax.swing.JLabel();
        txtLukaDolazak = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLukaPolazak = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstKorisniciNaLetu = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstKorisniciUBazi = new javax.swing.JList<>();
        btnTrazi = new javax.swing.JButton();
        btnDodajKorisnika = new javax.swing.JButton();
        txtKlasa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
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

        jLabel8.setText("Luka dolazak");

        jLabel9.setText("Luka polazak");

        jButton1.setText("Promjeni");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Obriši");

        jScrollPane2.setViewportView(lstKorisniciNaLetu);

        lstKorisniciUBazi.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstKorisniciUBaziValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstKorisniciUBazi);

        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        btnDodajKorisnika.setText("<<");
        btnDodajKorisnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajKorisnikaActionPerformed(evt);
            }
        });

        jLabel10.setText("Klasa");

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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLukaPolazak, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtLukaDolazak, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKlasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(txtBrojLeta)
                                    .addComponent(jLabel2)
                                    .addComponent(txtCijena)
                                    .addComponent(cmbAvioni, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbAviokompanija, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTrazi))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtTrajanjeLeta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(dtpVrijemeDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtpVrijemePolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btnDodajKorisnika)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBrojLeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbAvioni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4)
                                .addGap(11, 11, 11)
                                .addComponent(cmbAviokompanija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)
                                .addComponent(dtpVrijemePolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtpVrijemeDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTrajanjeLeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(btnDodaj))
                                .addGap(28, 28, 28)
                                .addComponent(jButton2)))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(btnDodajKorisnika)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLukaDolazak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtKlasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLukaPolazak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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

        napuniModel();

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lstKorisniciUBaziValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstKorisniciUBaziValueChanged
       if(lstKorisniciNaLetu.getSelectedValue()==null){
           return;
       }
    }//GEN-LAST:event_lstKorisniciUBaziValueChanged

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitajKorisnike();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void btnDodajKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajKorisnikaActionPerformed
        if(lstKorisniciUBazi.getSelectedValuesList()==null || lstKorisniciUBazi.getSelectedValuesList().isEmpty()){
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite korisnika");
            return;
        
        }
        
        if(lstKorisniciNaLetu.getModel()==null || !(lstKorisniciNaLetu.getModel() instanceof DefaultListModel<Rezervacija>)){
        
            lstKorisniciNaLetu.setModel(new DefaultListModel<Rezervacija>());
        
               
   }
        
        DefaultListModel<Rezervacija> m = (DefaultListModel<Rezervacija>) lstKorisniciNaLetu.getModel();
        
        DefaultListModel<Rezervacija> korisnici= (DefaultListModel<Rezervacija>) lstKorisniciNaLetu.getModel();
        boolean postoji;
        
        for(Korisnik kub: lstKorisniciUBazi.getSelectedValuesList()){
            postoji = false;
            for(int i = 0;i< korisnici.getSize();i++){
            
                if(kub.getSifra() == korisnici.get(i).getKorisnik().getSifra()){
                    postoji = true;
                    break;
                
                }
            }
            
            if(!postoji){
                
                Rezervacija r = new Rezervacija(obrada.getEntitet(),kub, txtKlasa.getText());
                
                korisnici.addElement(r);
            
            }
            
        
        }
        
        
        lstKorisniciNaLetu.repaint();
 
        
        
    }//GEN-LAST:event_btnDodajKorisnikaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajKorisnika;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Aviokompanija> cmbAviokompanija;
    private javax.swing.JComboBox<Avion> cmbAvioni;
    private com.github.lgooddatepicker.components.DateTimePicker dtpVrijemeDolaska;
    private com.github.lgooddatepicker.components.DateTimePicker dtpVrijemePolaska;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Rezervacija> lstKorisniciNaLetu;
    private javax.swing.JList<Korisnik> lstKorisniciUBazi;
    private javax.swing.JList<Let> lstPodaci;
    private javax.swing.JTextField txtBrojLeta;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtKlasa;
    private javax.swing.JTextField txtLukaDolazak;
    private javax.swing.JTextField txtLukaPolazak;
    private javax.swing.JTextField txtTrajanjeLeta;
    // End of variables declaration//GEN-END:variables

    private void napuniModel() {
        var l = obrada.getEntitet();

        try {
            l.setBr_leta(Integer.parseInt(txtBrojLeta.getText()));
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(getRootPane(), "Treba biti broj");

        }

        l.setLuka_dolazak(txtLukaDolazak.getText());
        l.setLuka_polazak(txtLukaPolazak.getText());

        try {
            l.setCijena(
                    BigDecimal.valueOf(df.parse(txtCijena.getText()).doubleValue()));
        } catch (Exception e) {
            l.setCijena(BigDecimal.ZERO);
        }
        try {
            l.settrajanjeleta(Integer.parseInt(txtTrajanjeLeta.getText()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(getRootPane(), "Treba biti broj");

        }

        l.setAvion((Avion) cmbAvioni.getSelectedItem());
        l.setAviokompanija((Aviokompanija) cmbAviokompanija.getSelectedItem());

        LocalDate ld = dtpVrijemePolaska.datePicker.getDate();

        LocalTime lt = dtpVrijemePolaska.timePicker.getTime();

        LocalDateTime fromDateAndTime = LocalDateTime.of(ld,
                lt);

        Date datum = Date.from(fromDateAndTime.atZone(ZoneId.systemDefault()).toInstant());

        l.setVrijeme_polaska(datum);

        /* l.setVijeme_dolaska(dtpVrijemeDolaska.datePicker.getDate()!=null? 
       Date.from(dtpVrijemeDolaska.datePicker.getDate()
       .atStartOfDay()
       .atZone(ZoneId.systemDefault())
       .toInstant()): null);
       
        l.setVrijeme_polaska(dtpVrijemePolaska.datePicker.getDate()!=null? 
       Date.from(dtpVrijemeDolaska.datePicker.getDate()
       .atStartOfDay()
       .atZone(ZoneId.systemDefault())
       .toInstant()): null);*/
    }

    private void napuniView() {
        var l = obrada.getEntitet();

        txtBrojLeta.setText(String.valueOf(l.getBr_leta()));
        txtCijena.setText(String.valueOf(l.getCijena()));
        cmbAvioni.setSelectedItem(l.getAvion());
        cmbAviokompanija.setSelectedItem(l.getAviokompanija());
        txtLukaDolazak.setText(l.getLuka_dolazak());
        txtLukaPolazak.setText(l.getLuka_polazak());
        txtTrajanjeLeta.setText(String.valueOf(l.gettrajanjeleta()));

       
    
        /*if(l.getVijeme_dolaska()!=null){
              LocalDate ld = l.getVijeme_dolaska().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
              dpDatumDolaska.setDate(ld);
        }else{
            dpDatumDolaska.setDate(null);
        }*/
          
            if(l.getVrijeme_polaska()!=null){
              LocalDate ld = l.getVrijeme_polaska().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
              dtpVrijemePolaska.datePicker.setDate(ld);
        }else{
            dtpVrijemePolaska.datePicker.setDate(null);
        }
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
        dps.setFormatForDatesCommonEra("dd. MM. YYY.");
        dps.setTranslationClear("Očisti");
        dps.setTranslationToday("Danas");
        dtpVrijemePolaska.datePicker.setSettings(dps);

        TimePickerSettings tps = new TimePickerSettings(Locale.of("hr", "HR"));
        tps.setFormatForDisplayTime("HH:mm");
        dtpVrijemePolaska.timePicker.getSettings().use24HourClockFormat();

        ArrayList<LocalTime> lista = new ArrayList<>();

        for (int j = 0; j < 24; j++) {
            for (int i = 0; i < 60; i += 5) {
                lista.add(LocalTime.of(j, i));
            }
        }

        dtpVrijemePolaska.timePicker.getSettings()
                .generatePotentialMenuTimes(lista);

    }

    private void definirajDatumDolaska() {
        DatePickerSettings dps = new DatePickerSettings(Locale.of("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd. MM. YYY. ");
        dps.setTranslationClear("Očisti");
        dtpVrijemeDolaska.datePicker.setSettings(dps);

        TimePickerSettings tps = new TimePickerSettings(Locale.of("hr", "HR"));
        tps.setFormatForDisplayTime("HH:MM");

    }
    
    private void ucitajKorisnike(){
        DefaultListModel<Korisnik> m = new DefaultListModel<>();
        m.addAll(obradaKorisnik.read());
        lstKorisniciUBazi.setModel(m);
        lstKorisniciUBazi.repaint();
    
    
    
    }
}
