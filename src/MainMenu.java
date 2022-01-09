
public class MainMenu extends javax.swing.JFrame {
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDataMobil = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnSewaMobil = new javax.swing.JButton();
        btnDataSewa = new javax.swing.JButton();
        btnDataSupir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APLIKASI RENTAL MOBIL");

        btnDataMobil.setBackground(new java.awt.Color(51, 102, 255));
        btnDataMobil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDataMobil.setForeground(new java.awt.Color(255, 255, 255));
        btnDataMobil.setText("Data Mobil");
        btnDataMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataMobilActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(255, 0, 51));
        btnKeluar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnSewaMobil.setBackground(new java.awt.Color(51, 102, 255));
        btnSewaMobil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSewaMobil.setForeground(new java.awt.Color(255, 255, 255));
        btnSewaMobil.setText("Formulir Sewa Mobil");
        btnSewaMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSewaMobilActionPerformed(evt);
            }
        });

        btnDataSewa.setBackground(new java.awt.Color(51, 102, 255));
        btnDataSewa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDataSewa.setForeground(new java.awt.Color(255, 255, 255));
        btnDataSewa.setText("Data Penyewaan");
        btnDataSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataSewaActionPerformed(evt);
            }
        });

        btnDataSupir.setBackground(new java.awt.Color(51, 102, 255));
        btnDataSupir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDataSupir.setForeground(new java.awt.Color(255, 255, 255));
        btnDataSupir.setText("Data Supir");
        btnDataSupir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataSupirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDataMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSewaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDataSupir, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnDataSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDataMobil, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSewaMobil, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataSewa)
                    .addComponent(btnDataSupir))
                .addGap(18, 18, 18)
                .addComponent(btnKeluar)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnDataMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataMobilActionPerformed
        Mobil mobil = new Mobil();
        mobil.pack();
        mobil.setLocationRelativeTo(null);
        mobil.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDataMobilActionPerformed

    private void btnSewaMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSewaMobilActionPerformed
        SewaMobil sewa = new SewaMobil();
        sewa.pack();
        sewa.setLocationRelativeTo(null);
        sewa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSewaMobilActionPerformed

    private void btnDataSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataSewaActionPerformed
        DataSewa sewa = new DataSewa();
        sewa.pack();
        sewa.setLocationRelativeTo(null);
        sewa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDataSewaActionPerformed

    private void btnDataSupirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataSupirActionPerformed
        Supir supir = new Supir();
        supir.pack();
        supir.setLocationRelativeTo(null);
        supir.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_btnDataSupirActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataMobil;
    private javax.swing.JButton btnDataSewa;
    private javax.swing.JButton btnDataSupir;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSewaMobil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
