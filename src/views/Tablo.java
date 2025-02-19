/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import librarydb.DbRead;
import librarydb.DbRead.DbItem;
import librarydb.LibraryDB;
import librarydb.LibraryDB.ZamanYonetici;




/**
 *
 * @author Aile
 */
public class Tablo extends javax.swing.JFrame {
   
    public static Object[][] oa = LibraryDB.oa;
    
    /**
     * Creates new form Tablo
     */
    public Tablo() {
        DbRead db = new DbRead();
        ArrayList<DbRead.DbItem> items = db.getItemList();
        if(items == null){
            oa = new Object[1][];
            Object[] arr = new Object[DbRead.DbItem.class.getFields().length];
            oa[0] = arr;
            return;
        }
        oa = new Object[items.size()][];
        for(int i = 0;i < items.size();i++){
            DbRead.DbItem read = items.get(i);
            Object[] arr = new Object[DbRead.DbItem.class.getFields().length];
            arr[0] = read.uyeno;
            arr[1] = read.uye_adi;
            arr[2] = read.uye_soyadi;
            arr[3] = read.uye_cinsiyeti;
            arr[4] = read.kitapKodu;
            arr[5] = read.kitapAdi;
            arr[6] = read.kitapTuru;
            arr[7] = read.kitap_yayinevi;
            arr[8] = read.yazar_no;
            arr[9] = read.yazar_adi;
            arr[10] = read.yazar_soyadi;
            arr[11] = read.yazar_cinsiyeti;
            arr[12] = read.odunc_tarihi;
            arr[13] = read.teslim_tarihi;
            oa[i] = arr;
        }
        initComponents();
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
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KÜTÜPHANE TABLOSU");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            oa,
            LibraryDB.TABLE_TITLES
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}