
package prolab3;

/**
 *
 * @author ahmet
 */
public class GirisEkrani extends javax.swing.JFrame {


    Musteri musteriislem = new Musteri();
    Temsilci temsilciislem = new Temsilci();
    Mudur mudurislem = new Mudur();
    
    
    
    public GirisEkrani() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hastagiris = new javax.swing.JTabbedPane();
        musterigiris = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        musteritcnoalani = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        musterigirisbuton = new javax.swing.JButton();
        musterigirisdogrulamayazisi = new javax.swing.JLabel();
        musterisifrealani = new javax.swing.JTextField();
        temsilcigiris = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        temsilcitcnoalani = new javax.swing.JTextField();
        temsilcigirisbuton = new javax.swing.JButton();
        temsilcisifrealani = new javax.swing.JTextField();
        temsilcigirisdogrulamayazisi = new javax.swing.JLabel();
        mudurgiris = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mudurtcnoalani = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mudurgirisbuton = new javax.swing.JButton();
        mudurgirisdogrulamayazisi = new javax.swing.JLabel();
        mudursifrealani = new javax.swing.JTextField();
        girisyazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        hastagiris.setBackground(new java.awt.Color(102, 255, 102));

        musterigiris.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("      TC No");

        musteritcnoalani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteritcnoalaniActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("     Şifre");

        musterigirisbuton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        musterigirisbuton.setText("Giriş Yap");
        musterigirisbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musterigirisbutonActionPerformed(evt);
            }
        });

        musterigirisdogrulamayazisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout musterigirisLayout = new javax.swing.GroupLayout(musterigiris);
        musterigiris.setLayout(musterigirisLayout);
        musterigirisLayout.setHorizontalGroup(
            musterigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musterigirisLayout.createSequentialGroup()
                .addGroup(musterigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(musterigirisLayout.createSequentialGroup()
                        .addGroup(musterigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(musterigirisLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, musterigirisLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(musterigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(musteritcnoalani, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(musterisifrealani)))
                    .addGroup(musterigirisLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(musterigirisbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, musterigirisLayout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addComponent(musterigirisdogrulamayazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        musterigirisLayout.setVerticalGroup(
            musterigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musterigirisLayout.createSequentialGroup()
                .addGroup(musterigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(musterigirisLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(musteritcnoalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, musterigirisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(musterigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musterisifrealani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(musterigirisbuton)
                .addGap(18, 18, 18)
                .addComponent(musterigirisdogrulamayazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        hastagiris.addTab("Musteri Giriş", musterigiris);

        temsilcigiris.setBackground(new java.awt.Color(102, 255, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("TC No");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Şifre");

        temsilcitcnoalani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temsilcitcnoalaniActionPerformed(evt);
            }
        });

        temsilcigirisbuton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        temsilcigirisbuton.setText("Giriş Yap");
        temsilcigirisbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temsilcigirisbutonActionPerformed(evt);
            }
        });

        temsilcisifrealani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temsilcisifrealaniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout temsilcigirisLayout = new javax.swing.GroupLayout(temsilcigiris);
        temsilcigiris.setLayout(temsilcigirisLayout);
        temsilcigirisLayout.setHorizontalGroup(
            temsilcigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(temsilcigirisLayout.createSequentialGroup()
                .addGroup(temsilcigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(temsilcigirisLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(temsilcigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(temsilcigirisLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(temsilcisifrealani, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(temsilcigirisLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temsilcitcnoalani, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(temsilcigirisLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(temsilcigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temsilcigirisdogrulamayazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temsilcigirisbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        temsilcigirisLayout.setVerticalGroup(
            temsilcigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(temsilcigirisLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(temsilcigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(temsilcitcnoalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(temsilcigirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temsilcisifrealani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(temsilcigirisbuton)
                .addGap(18, 18, 18)
                .addComponent(temsilcigirisdogrulamayazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        hastagiris.addTab("Temsilci Giriş", temsilcigiris);

        mudurgiris.setBackground(new java.awt.Color(102, 255, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("     TC No");

        mudurtcnoalani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudurtcnoalaniActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("   Şifre");

        mudurgirisbuton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mudurgirisbuton.setText("Giriş Yap");
        mudurgirisbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudurgirisbutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mudurgirisLayout = new javax.swing.GroupLayout(mudurgiris);
        mudurgiris.setLayout(mudurgirisLayout);
        mudurgirisLayout.setHorizontalGroup(
            mudurgirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mudurgirisLayout.createSequentialGroup()
                .addGroup(mudurgirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mudurgirisLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mudurgirisLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(mudurgirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mudurtcnoalani, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(mudursifrealani))
                .addGap(100, 100, 100))
            .addGroup(mudurgirisLayout.createSequentialGroup()
                .addGroup(mudurgirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mudurgirisLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(mudurgirisdogrulamayazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mudurgirisLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(mudurgirisbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mudurgirisLayout.setVerticalGroup(
            mudurgirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mudurgirisLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(mudurgirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mudurtcnoalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mudurgirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mudursifrealani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mudurgirisbuton)
                .addGap(20, 20, 20)
                .addComponent(mudurgirisdogrulamayazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        hastagiris.addTab("Müdür Giriş", mudurgiris);

        girisyazisi.setBackground(new java.awt.Color(255, 255, 255));
        girisyazisi.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        girisyazisi.setText("BANKA SİSTEMİNE HOŞGELDİNİZ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(girisyazisi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(hastagiris, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(girisyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hastagiris, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void musteritcnoalaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteritcnoalaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musteritcnoalaniActionPerformed

    private void mudurtcnoalaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudurtcnoalaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mudurtcnoalaniActionPerformed

    private void temsilcitcnoalaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temsilcitcnoalaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temsilcitcnoalaniActionPerformed

    private void temsilcigirisbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temsilcigirisbutonActionPerformed
        
        temsilcigirisdogrulamayazisi.setText("");
        String temsilcitcno= temsilcitcnoalani.getText();
        String temsilcisifre =temsilcisifrealani.getText();
        
       
        
        boolean temsilcigirisDogrulama= temsilciislem.temsilcigirisDogrulama(temsilcitcno, temsilcisifre);
        
       
        if(temsilcigirisDogrulama){
            temsilcigirisdogrulamayazisi.setText("Giriş Başarılı");
            
            TemsilciFrame temsilciframe= new TemsilciFrame();
            temsilciframe.setVisible(true);
            setVisible(false);
            
        }
        else{
            temsilcigirisdogrulamayazisi.setText("Giriş Başarısız");
        }
        
        
        
    }//GEN-LAST:event_temsilcigirisbutonActionPerformed

    private void musterigirisbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musterigirisbutonActionPerformed
       
        musterigirisdogrulamayazisi.setText("");
        String musteritcno= musteritcnoalani.getText();
        String musterisifre =musterisifrealani.getText();
        
        
        
        boolean girisdogrumu= musteriislem.musterigirisDogrulama(musteritcno,musterisifre);
        
       
        if(girisdogrumu){
            
            
            musterigirisdogrulamayazisi.setText("Giriş Başarılı");
            
             
            MusteriFrame musterijf=new MusteriFrame();
            musterijf.setVisible(true);
             setVisible(false); 
           
        }
        else{
            musterigirisdogrulamayazisi.setText("Giriş Başarısız");
        }
        
               
        
        
    }//GEN-LAST:event_musterigirisbutonActionPerformed

    private void temsilcisifrealaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temsilcisifrealaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temsilcisifrealaniActionPerformed

    private void mudurgirisbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudurgirisbutonActionPerformed
        
        
        musterigirisdogrulamayazisi.setText("");
        String mudurtcno= mudurtcnoalani.getText();
        String mudursifre =mudursifrealani.getText();
        
        
        
        boolean mudurgirisDogrulama= mudurislem.mudurgirisDogrulama(mudurtcno,mudursifre);
        
       
        if(mudurgirisDogrulama){
            mudurgirisdogrulamayazisi.setText("Giriş Başarılı");
            
            
            MudurFrame musterijf=new MudurFrame();
            musterijf.setVisible(true);
             setVisible(false); 
             
             
             
        }
        else{
            mudurgirisdogrulamayazisi.setText("Giriş Başarısız");
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_mudurgirisbutonActionPerformed

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel girisyazisi;
    private javax.swing.JTabbedPane hastagiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel mudurgiris;
    private javax.swing.JButton mudurgirisbuton;
    private javax.swing.JLabel mudurgirisdogrulamayazisi;
    private javax.swing.JTextField mudursifrealani;
    private javax.swing.JTextField mudurtcnoalani;
    private javax.swing.JPanel musterigiris;
    private javax.swing.JButton musterigirisbuton;
    private javax.swing.JLabel musterigirisdogrulamayazisi;
    private javax.swing.JTextField musterisifrealani;
    private javax.swing.JTextField musteritcnoalani;
    private javax.swing.JPanel temsilcigiris;
    private javax.swing.JButton temsilcigirisbuton;
    private javax.swing.JLabel temsilcigirisdogrulamayazisi;
    private javax.swing.JTextField temsilcisifrealani;
    private javax.swing.JTextField temsilcitcnoalani;
    // End of variables declaration//GEN-END:variables
}
