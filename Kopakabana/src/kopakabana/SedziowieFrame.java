/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopakabana;

import java.util.Iterator;
import static kopakabana.Baza.sedziowie;

/**
 *
 * @author tuptu
 */
public class SedziowieFrame extends javax.swing.JFrame {
    String wpisany_tekst = null;

    SedziowieFrame(){ 
        initComponents();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelka = new javax.swing.JTable();
        lyse_pole = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        podaj_imie.setText("Podaj imię :");

        DodajSedzie.setText("Dodaj Sędziego");
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

        usun_sedziego.setText("Usuń sędziego");
        usun_sedziego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usun_sedziegoActionPerformed(evt);
            }
        });

        pokaz.setText("Pokaż Sędziów");
        pokaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokazActionPerformed(evt);
            }
        });

        tabelka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Imie", "Nazwisko"
            }
        ));
        jScrollPane3.setViewportView(tabelka);

        lyse_pole.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lyse_pole, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(podaj_imie, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(podaj_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DodajSedzie)
                    .addComponent(usun_sedziego)
                    .addComponent(pokaz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lyse_pole, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DodajSedzieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajSedzieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DodajSedzieActionPerformed

    private void DodajSedzieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DodajSedzieMouseClicked
        // TODO add your handling code here:
        Sedzia nowy = new Sedzia();
        nowy.imie = wpis_imie.getText(); 
        nowy.nazwisko = wpis_nazwisko.getText(); 
        sedziowie.add(nowy);
        output.setText("Dodano do bazy: "+nowy.imie+" "+nowy.nazwisko);
    }//GEN-LAST:event_DodajSedzieMouseClicked

    private void usun_sedziegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usun_sedziegoActionPerformed
        // TODO add your handling code here:
        String im = wpis_imie.getText();
        String nazw = wpis_nazwisko.getText();
        boolean znaleziono = false;
        for (Sedzia s : sedziowie) {
            if(s.nazwisko.equals(nazw) && s.imie.equals(im)){
                sedziowie.remove(s);
                output.setText("Usunięto "+s.imie+" "+s.nazwisko);   
                znaleziono = true;
             }
        }
        if(znaleziono == false){
            output.setText("Nie znaleziono takiej osoby ");
        }
    }//GEN-LAST:event_usun_sedziegoActionPerformed

    private void pokazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokazActionPerformed
        // TODO add your handling code here:
        String wypisani = "";
        for(Sedzia s : sedziowie){
           // output.
           wypisani += s.imie;
           wypisani +=" "+s.nazwisko;
           wypisani += "\n";
        }
        lyse_pole.setText(wypisani);
    }//GEN-LAST:event_pokazActionPerformed

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
            java.util.logging.Logger.getLogger(SedziowieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SedziowieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SedziowieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SedziowieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SedziowieFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DodajSedzie;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lyse_pole;
    private javax.swing.JLabel output;
    private javax.swing.JLabel podaj_imie;
    private javax.swing.JLabel podaj_nazwisko;
    private javax.swing.JButton pokaz;
    private javax.swing.JTable tabelka;
    private javax.swing.JButton usun_sedziego;
    private javax.swing.JTextArea wpis_imie;
    private javax.swing.JTextArea wpis_nazwisko;
    // End of variables declaration//GEN-END:variables
}
