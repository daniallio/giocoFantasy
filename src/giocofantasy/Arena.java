/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giocofantasy;

import java.awt.Color;
import personaggi.ElencoPersonaggi;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import personaggi.Arma;
import personaggi.Cavaliere;
import personaggi.MagoBianco;
import personaggi.Personaggio;
import personaggi.PersonaggioSelezionato;

import personaggi.Stregone;

/**
 *
 * @author tss
 */
public class Arena extends javax.swing.JFrame {
    
    Stregone stregone;
    Cavaliere cavaliere;
    Cavaliere cavaliere2;
    MagoBianco magobianco;
    Arma arma;
    ArrayList<JLabel> lista_label = new ArrayList<>();
    ElencoPersonaggi lista_personaggi;
    ArrayList<Personaggio> elenco;
    PersonaggioSelezionato personaggioSelezionato;
    String msgBoss,msgCav,msgMago; //variabile che conterrà del testo da aggiungere nelle label
    JLabel lblSelezionata;
    int posizionePersonaggio;
    
    public Arena() {
        initComponents();
       
        
        
        lista_personaggi = new ElencoPersonaggi();
        //istanzio un nuovo stregone Boss
        stregone = new Stregone(100, 100, "Sauron", 1000);
        //aggiungo lo stregone all'elenco dei personaggi
        lista_personaggi.getLista().add(stregone);
        //istanzio un nuovo magobianco 
        magobianco = new MagoBianco(lMago.getX(), lMago.getY(), 20, "Gandalf", 250);
        //aggiungo il magobianco alla listadei personaggi
        lista_personaggi.getLista().add(magobianco);
        msgMago ="Mago " + magobianco.getNome_personaggio() + " Vita - " + magobianco.getHp();
        lMago.setText(msgMago);
        //istanzio una nuova arma
        arma = new Arma("spada", 2);
        //istanzio un nuovo cavaliere passandole anche l'arma appena istanziata
        cavaliere = new Cavaliere(lCavaliere1.getX(), lCavaliere1.getY(), 20, arma, "Frodo", 400);
        //aggiungo il cavaliere alla lista dei personaggi
        lista_personaggi.getLista().add(cavaliere);
        msgCav ="Cavliere " + cavaliere.getNome_personaggio() + " Vita - " + cavaliere.getHp();
        lCavaliere1.setText(msgCav);
        //istanzio un nuovo cavaliere passandole anche l'arma appena istanziata
        cavaliere2 = new Cavaliere(lCavaliere2.getX(), lCavaliere2.getY(), 30, arma, "Aragon", 550);
        //aggiungo il cavaliere alla lista dei personaggi
        lista_personaggi.getLista().add(cavaliere);
        msgCav ="Cavliere " + cavaliere2.getNome_personaggio() + " Vita - " + cavaliere2.getHp();
        lCavaliere2.setText(msgCav);
        //aggiungo all'ArrayLIst di tipo Label le 4 label Create
        lista_label.add(lBoss); lista_label.add(lMago); lista_label.add(lCavaliere1); lista_label.add(lCavaliere2);
        //jArena.add(lBoss); jArena.add(lMago); jArena.add(lCavaliere1); jArena.add(lCavaliere2);
        msgBoss="BOSS - " + stregone.getNome_personaggio() + "\n Vita - " + stregone.getHp();
        lBoss.setText(msgBoss); 
        
                 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jArena = new javax.swing.JPanel();
        lBoss = new javax.swing.JLabel();
        lMago = new javax.swing.JLabel();
        lCavaliere1 = new javax.swing.JLabel();
        lCavaliere2 = new javax.swing.JLabel();
        bAttacco = new javax.swing.JButton();
        bGuardia = new javax.swing.JButton();
        bRecupera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jArena.setBackground(new java.awt.Color(255, 204, 204));
        jArena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jArenaMouseClicked(evt);
            }
        });

        lBoss.setBackground(new java.awt.Color(0, 102, 0));
        lBoss.setText("Stregone");
        lBoss.setOpaque(true);
        lBoss.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lBoss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lBossMouseClicked(evt);
            }
        });
        lBoss.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lBossPropertyChange(evt);
            }
        });

        lMago.setBackground(new java.awt.Color(204, 255, 255));
        lMago.setText("Mago");
        lMago.setOpaque(true);
        lMago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lMagoMouseClicked(evt);
            }
        });

        lCavaliere1.setBackground(new java.awt.Color(153, 153, 153));
        lCavaliere1.setText("Cavaliere");
        lCavaliere1.setOpaque(true);
        lCavaliere1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCavaliere1MouseClicked(evt);
            }
        });

        lCavaliere2.setBackground(new java.awt.Color(153, 153, 153));
        lCavaliere2.setText("Cavaliere2");
        lCavaliere2.setOpaque(true);
        lCavaliere2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCavaliere2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jArenaLayout = new javax.swing.GroupLayout(jArena);
        jArena.setLayout(jArenaLayout);
        jArenaLayout.setHorizontalGroup(
            jArenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArenaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lBoss, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jArenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lCavaliere1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lCavaliere2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(lMago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jArenaLayout.setVerticalGroup(
            jArenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jArenaLayout.createSequentialGroup()
                .addGroup(jArenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jArenaLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lBoss, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jArenaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lMago, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lCavaliere1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lCavaliere2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bAttacco.setText("Attacca");
        bAttacco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAttaccoActionPerformed(evt);
            }
        });

        bGuardia.setText("Guardia");
        bGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardiaActionPerformed(evt);
            }
        });

        bRecupera.setText("Recupera");
        bRecupera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRecuperaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jArena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bAttacco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bGuardia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bRecupera, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jArena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAttacco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bRecupera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(237, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardiaActionPerformed
        
        
    }//GEN-LAST:event_bGuardiaActionPerformed

    private void bRecuperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRecuperaActionPerformed
        // TODO add your handling code here:
        
        if(posizionePersonaggio == 1){ 
            
                
                cavaliere.setHp(cavaliere.getHp()+100);
                msgCav ="Cavliere " + cavaliere.getNome_personaggio() + " Vita - " + cavaliere.getHp();
                lCavaliere1.setText(msgCav);
                cavaliere2.setHp(cavaliere.getHp()+100);
                msgCav ="Cavliere " + cavaliere2.getNome_personaggio() + " Vita - " + cavaliere2.getHp();
                lCavaliere2.setText(msgCav);
            
        }
        else{ 
            JOptionPane.showMessageDialog(null, "Il Cavaliere non ha abilità di RECUPERO");
        }
    }//GEN-LAST:event_bRecuperaActionPerformed

    private void lBossPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lBossPropertyChange
       
    }//GEN-LAST:event_lBossPropertyChange

    private void lBossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBossMouseClicked
        
        
     
    }//GEN-LAST:event_lBossMouseClicked

    private void lMagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lMagoMouseClicked
        //quando clicco la label del Boss deve selezionarmi il personaggio
        posizionePersonaggio = 1;
        lblSelezionata = lista_label.get(posizionePersonaggio);
        lblSelezionata.setBackground(Color.red);
        lCavaliere1.setBackground(Color.gray);
        lCavaliere2.setBackground(Color.gray);
        
    }//GEN-LAST:event_lMagoMouseClicked

    private void lCavaliere1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCavaliere1MouseClicked
        posizionePersonaggio =2;
        lblSelezionata = lista_label.get(posizionePersonaggio);
        lblSelezionata.setBackground(Color.red); 
        lMago.setBackground(Color.cyan);
        lCavaliere2.setBackground(Color.gray);
        
        
    }//GEN-LAST:event_lCavaliere1MouseClicked

    private void bAttaccoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAttaccoActionPerformed
        //quando clicco il personaggio selezionato deve attaccare
        
        double attacco=0;
        Random handicap = new Random ();
        if(posizionePersonaggio ==2){
            attacco = cavaliere.attaccoFisico();
            stregone.setHp(stregone.getHp()-attacco);
            msgBoss="BOSS - " + stregone.getNome_personaggio() + "\n Vita - " + stregone.getHp();
            lBoss.setText(msgBoss);
            if(handicap.nextInt(10) >= 6){
                attacco = stregone.fuoco();

                cavaliere.setHp(cavaliere.getHp()-attacco);
                msgCav ="Cavliere " + cavaliere.getNome_personaggio() + " Vita - " + cavaliere.getHp();
                lblSelezionata.setText(msgCav);
             }
             else
             {  
                 attacco = stregone.fuoco()/10;

                cavaliere.setHp(cavaliere.getHp()-attacco);
                msgCav ="Cavliere " + cavaliere.getNome_personaggio() + " Vita - " + cavaliere.getHp();
                lblSelezionata.setText(msgCav);   
             } 
            
        }
          if(posizionePersonaggio ==3){
            attacco = cavaliere.attaccoFisico();
            stregone.setHp(stregone.getHp()-attacco);
            msgBoss="BOSS - " + stregone.getNome_personaggio() + "\n Vita - " + stregone.getHp();
            lBoss.setText(msgBoss);
            if(handicap.nextInt(10) >= 6){
                attacco = stregone.fuoco();

                cavaliere.setHp(cavaliere.getHp()-attacco);
                msgCav ="Cavliere " + cavaliere.getNome_personaggio() + " Vita - " + cavaliere.getHp();
                lblSelezionata.setText(msgCav);
             }
             else
             {  
                 attacco = stregone.fuoco()/10;

                cavaliere.setHp(cavaliere.getHp()-attacco);
                msgCav ="Cavliere " + cavaliere.getNome_personaggio() + " Vita - " + cavaliere.getHp();
                lblSelezionata.setText(msgCav);   
             } 
            
        }
    }//GEN-LAST:event_bAttaccoActionPerformed

    private void jArenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jArenaMouseClicked
        //quando clicco sul panel risetto i colori delle label a quelle di partenza
        lMago.setBackground(Color.cyan);
        lCavaliere1.setBackground(Color.GRAY);
        lCavaliere2.setBackground(Color.GRAY);
        posizionePersonaggio = 0;
    }//GEN-LAST:event_jArenaMouseClicked

    private void lCavaliere2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCavaliere2MouseClicked
        posizionePersonaggio =3;
        lblSelezionata = lista_label.get(posizionePersonaggio);
        lblSelezionata.setBackground(Color.red); 
        lMago.setBackground(Color.cyan);
        lCavaliere1.setBackground(Color.GRAY);
    }//GEN-LAST:event_lCavaliere2MouseClicked

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
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAttacco;
    private javax.swing.JButton bGuardia;
    private javax.swing.JButton bRecupera;
    private javax.swing.JPanel jArena;
    private javax.swing.JLabel lBoss;
    private javax.swing.JLabel lCavaliere1;
    private javax.swing.JLabel lCavaliere2;
    private javax.swing.JLabel lMago;
    // End of variables declaration//GEN-END:variables
}
