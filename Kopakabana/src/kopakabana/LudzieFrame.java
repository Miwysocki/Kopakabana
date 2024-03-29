/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopakabana;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import static kopakabana.Baza.druzyny;
import static kopakabana.Baza.gracze;
import static kopakabana.Baza.sedziowie;

/**
 *
 * @author tuptu
 */

public class LudzieFrame extends javax.swing.JFrame {
    String wpisany_tekst = null;
    String wybrano = "Sędziowie";
    
    FileWriter writer;
    
    private File graczeFile;
    
    private File sedzieFile;

    private File meczeFile;

    LudzieFrame(){ 
        initComponents();
        
        graczeFile = new File("gracze.txt");
        sedzieFile = new File("dataText/sedzie.txt"); // @TODO change to "sedzie.txt"
        meczeFile = new File("dataText/mecze.txt");
    }
   void  podano_dane(){ 
    wpisany_tekst = wpis_imie.getText();
    }
    /**
     * Creates new form LudzieFrame
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        podaj_imie = new javax.swing.JLabel();
        DodajSedzie = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        wpis_imie = new javax.swing.JTextArea();
        output = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        wpis_nazwisko = new javax.swing.JTextArea();
        podaj_nazwisko = new javax.swing.JLabel();
        usun_sedziego = new javax.swing.JButton();
        pokaz = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        pole = new javax.swing.JTextArea();
        wybor = new javax.swing.JComboBox<>();
        tmp = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Zapisz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        podaj_imie.setText("Podaj imię :");

        DodajSedzie.setText("Dodaj ");
        DodajSedzie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DodajSedzieMouseClicked(evt);
            }
        });
        DodajSedzie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajSedzieActionPerformed(evt);
            }
        });

        wpis_imie.setColumns(20);
        wpis_imie.setRows(5);
        jScrollPane1.setViewportView(wpis_imie);

        wpis_nazwisko.setColumns(20);
        wpis_nazwisko.setRows(5);
        jScrollPane2.setViewportView(wpis_nazwisko);

        podaj_nazwisko.setText("Podaj nazwisko :");

        usun_sedziego.setText("Usuń ");
        usun_sedziego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usun_sedziegoActionPerformed(evt);
            }
        });

        pokaz.setText("Pokaż ");
        pokaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazActionPerformed(evt);
            }
        });

        pole.setColumns(20);
        pole.setRows(5);
        jScrollPane4.setViewportView(pole);

        wybor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sędziowie", "Gracze", "Drużyny" }));
        wybor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyborActionPerformed(evt);
            }
        });
        wybor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                wyborPropertyChange(evt);
            }
        });

        tmp.setText("jLabel1");

        jButton1.setText("<-Wróć");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Zapisz.setText("jButton2");
        Zapisz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZapiszMouseClicked(evt);
            }
        });
        Zapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZapiszActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 39, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(podaj_imie)
                                    .addComponent(podaj_nazwisko))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DodajSedzie)
                                .addGap(18, 18, 18)
                                .addComponent(usun_sedziego, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(pokaz, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Zapisz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wybor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(wybor)
                            .addComponent(podaj_imie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(podaj_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DodajSedzie)
                            .addComponent(usun_sedziego)
                            .addComponent(pokaz)
                            .addComponent(Zapisz)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tmp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DodajSedzieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajSedzieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DodajSedzieActionPerformed

    private void DodajSedzieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DodajSedzieMouseClicked
        // TODO add your handling code here:
   if("Sędziowie".equals(wybrano)){        
        Sedzia nowy = new Sedzia();
        nowy.imie = wpis_imie.getText(); 
        nowy.nazwisko = wpis_nazwisko.getText();
        sedziowie.add(nowy);
        output.setText("Dodano do bazy: "+nowy.imie+" "+nowy.nazwisko);
        }
   if(wybrano.equals("Gracze")){
        Osoba nowy = new Osoba();
        nowy.imie = wpis_imie.getText(); 
        nowy.nazwisko = wpis_nazwisko.getText(); 
        gracze.add(nowy);
        output.setText("Dodano do bazy: "+nowy.imie+" "+nowy.nazwisko);
        }  
   if(wybrano.equals("Drużyny")){
        Druzyna nowy = new Druzyna();
        nowy.nazwa = wpis_nazwisko.getText(); 
        druzyny.add(nowy);
        output.setText("Dodano do bazy: "+nowy.nazwa);
        }   
    }//GEN-LAST:event_DodajSedzieMouseClicked

    private void usun_sedziegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usun_sedziegoActionPerformed
        // TODO add your handling code here:
        String im = wpis_imie.getText();
        String nazw = wpis_nazwisko.getText();
        boolean znaleziono = false;
    if("Sędziowie".equals(wybrano)){    
        for (Sedzia s : sedziowie) {
            if(s.nazwisko.equals(nazw) && s.imie.equals(im)){
                sedziowie.remove(s);
                output.setText("Usunięto "+s.imie+" "+s.nazwisko);   
                znaleziono = true;
             }
        }
    }
    if(wybrano.equals("Gracze")){
        for (Osoba s : gracze) {
            if(s.nazwisko.equals(nazw) && s.imie.equals(im)){
                gracze.remove(s);
                output.setText("Usunięto "+s.imie+" "+s.nazwisko);   
                znaleziono = true;
             }
        }        
    }
    if(wybrano.equals("Druzyny")){
        for (Druzyna s : druzyny) {
            if(s.nazwa.equals(nazw)){
                druzyny.remove(s);
                output.setText("Usunięto "+s.nazwa);   
                znaleziono = true;
             }
        }        
    }    
        if(znaleziono == false){
            output.setText("Nie znaleziono w bazie ");
        }
        
    }//GEN-LAST:event_usun_sedziegoActionPerformed

    private void pokazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazActionPerformed
        // TODO add your handling code here:
        pole.setText(null);
        if("Sędziowie".equals(wybrano)){
        for(Sedzia s : sedziowie){
           // output.
           pole.append(s.imie+" ");
           pole.append(s.nazwisko);
           pole.append("\n");
        }
      }
        
        
        if(wybrano.equals("Gracze")){
        for(Osoba s : gracze){
           // output.
           pole.append(s.imie+" ");
           pole.append(s.nazwisko);
           pole.append("\n");
        }            
        }
        if(wybrano.equals("Drużyny")){
        for(Druzyna s : druzyny){
           // output.
           pole.append(s.nazwa);
           pole.append("\n");
        }            
        }        
    }//GEN-LAST:event_pokazActionPerformed

    private void wyborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyborActionPerformed
        // TODO add your handling code here:
        wybrano = (String) wybor.getSelectedItem();
        if("Drużyny".equals(wybrano)){
            podaj_nazwisko.setText("Podaj nazwę:");
            podaj_imie.setText("");
        }
        else{
            podaj_nazwisko.setText("Podaj imię:");
            podaj_imie.setText("Podaj nazwisko");
        }
        tmp.setText(wybrano);
    }//GEN-LAST:event_wyborActionPerformed

    private void wyborPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_wyborPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_wyborPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StartFrame f = new StartFrame();
        f.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapiszActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZapiszActionPerformed

    private void ZapiszMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZapiszMouseClicked
     
        try {                                    
            
           
            writer = new FileWriter("gracze.txt");
            writer.write("");
          
            
            for(Osoba o : Baza.gracze){
               writer.append(o.imie +" " + o.nazwisko + "\r\n");
            }
            
         
            writer.close();
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(LudzieFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
        
    }//GEN-LAST:event_ZapiszMouseClicked

    String wczytaj_tekst(){
        String napis = null;
        if(wpisany_tekst != null){ //nie jest nullem kiedy kliknięto ok
        napis = wpisany_tekst;
        wpisany_tekst = null;
        }   
        return napis;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LudzieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LudzieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LudzieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LudzieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LudzieFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DodajSedzie;
    private javax.swing.JButton Zapisz;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel output;
    private javax.swing.JLabel podaj_imie;
    private javax.swing.JLabel podaj_nazwisko;
    private javax.swing.JButton pokaz;
    private javax.swing.JTextArea pole;
    private javax.swing.JLabel tmp;
    private javax.swing.JButton usun_sedziego;
    private javax.swing.JTextArea wpis_imie;
    private javax.swing.JTextArea wpis_nazwisko;
    private javax.swing.JComboBox<String> wybor;
    // End of variables declaration//GEN-END:variables
}
