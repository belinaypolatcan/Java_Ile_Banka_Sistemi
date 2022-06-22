
package prolab3;

import com.mysql.cj.protocol.Resultset;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class HesapGoruntule extends javax.swing.JFrame {

    
     private Connection con = null;
    private Connection con1=null;
    private Statement statement =null;
    private Statement statement1 =null;
    private PreparedStatement preparedStatement=null; 
    private PreparedStatement preparedStatement1=null;
    
    
    
    
    public HesapGoruntule() {
        initComponents();
        
        
        String url = "jdbc:mysql://" + VeriTabani.host + ":" + VeriTabani.port + "/" + VeriTabani.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
         try {
             con = DriverManager.getConnection(url, VeriTabani.kullanici_adi, VeriTabani.parola);
         } catch (SQLException ex) {
             Logger.getLogger(MusteriGoruntule.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        goruntulebuton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Müşteri İD", "Hesap No", "Para Türü", "Bakiye"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        goruntulebuton.setBackground(new java.awt.Color(255, 51, 51));
        goruntulebuton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        goruntulebuton.setText("Goruntule");
        goruntulebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goruntulebutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(goruntulebuton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goruntulebuton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goruntulebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goruntulebutonActionPerformed
        
            
     String sql= "Select * From hesaplar";
     
         try {
             preparedStatement=con.prepareStatement(sql);
             
             ResultSet rs= (ResultSet)preparedStatement.executeQuery();
             
             DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
             model.setRowCount(0);
             
             while(rs.next()){
                 
                 model.addRow(new String[]{ rs.getString(1) , rs.getString(2) , rs.getString(3) , rs.getString(4)});
                      
                 
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(MusteriGoruntule.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
        
        
        
        
        
    }//GEN-LAST:event_goruntulebutonActionPerformed

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
            java.util.logging.Logger.getLogger(HesapGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapGoruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapGoruntule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goruntulebuton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
