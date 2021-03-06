
package mesmotors;
//Bu araba ekleme ekranı oluyor.

import static mesmotors.JLoginScreen.carList;

/**
 * Bütün programda kullanilan static nesneler ayni nesne üzerinde islem
 * yapabilmek icin import edilmistir.
 */
public class JAddCar extends javax.swing.JFrame {

    /**
     * JAddCar olusturulur.
     */

    public JAddCar() {
        initComponents();
    }

    /**
     * Designerdan otomatik olarak yazdirilan ayarlardir.
     */
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGoBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBrandName = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtColour = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtKm = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSaveCar = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Araç Ekleme Ekranı");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnGoBack.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnGoBack.setText("Yönetici Ekranına Dön");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesmotors/mes motors.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnGoBack)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        txtBrandName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBrandName.setText("Marka");
        txtBrandName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBrandNameMouseClicked(evt);
            }
        });
        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });

        txtModel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtModel.setText("Model");
        txtModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModelMouseClicked(evt);
            }
        });
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        txtColour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtColour.setText("Renk");
        txtColour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtColourMouseClicked(evt);
            }
        });

        txtYear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtYear.setText("Yıl");
        txtYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtYearMouseClicked(evt);
            }
        });

        txtKm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtKm.setText("Kilometre");
        txtKm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtKmMouseClicked(evt);
            }
        });

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPrice.setText("Fiyat");
        txtPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPriceMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ekleyeceğiniz Aracın Bilgilerini Giriniz:");

        btnSaveCar.setBackground(new java.awt.Color(0, 0, 51));
        btnSaveCar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveCar.setForeground(new java.awt.Color(204, 0, 51));
        btnSaveCar.setText("Aracı Ekle");
        btnSaveCar.setBorder(null);
        btnSaveCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCarActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(txtBrandName,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtModel,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtColour,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtYear,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtKm, javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 229,
                                                                Short.MAX_VALUE)
                                                        .addComponent(txtPrice,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblResult,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSaveCar, javax.swing.GroupLayout.PREFERRED_SIZE, 71,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtColour, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnSaveCar, javax.swing.GroupLayout.DEFAULT_SIZE, 23,
                                                Short.MAX_VALUE)
                                        .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param saveCar(
     */
    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGoBackActionPerformed
        JLoginScreen.jInterfaceScreen.show();
        dispose();
    }// GEN-LAST:event_btnGoBackActionPerformed

    /**
     * @param saveCar(
     */
    private void btnSaveCarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSaveCarActionPerformed
        saveCar();
        clean();
    }// GEN-LAST:event_btnSaveCarActionPerformed

    /**
     * @param saveCar(
     */
    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtModelActionPerformed

    /**
     * @param saveCar(
     */
    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtBrandNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtBrandNameActionPerformed

    /**
     * @param saveCar() icin Marka ismi alinir
     */
    private void txtBrandNameMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtBrandNameMouseClicked
        txtBrandName.setText("");
    }// GEN-LAST:event_txtBrandNameMouseClicked

    /**
     * @param saveCar() icin model ismi alinir
     */
    private void txtModelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtModelMouseClicked
        txtModel.setText("");
    }// GEN-LAST:event_txtModelMouseClicked

    /**
     * @param saveCar() icin renk alinir
     */
    private void txtColourMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtColourMouseClicked
        txtColour.setText("");
    }// GEN-LAST:event_txtColourMouseClicked

    /**
     * @param saveCar() icin yil bilgisi alinir
     */
    private void txtYearMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtYearMouseClicked
        txtYear.setText("");
    }// GEN-LAST:event_txtYearMouseClicked

    /**
     * @param saveCar() icin km bilgisi alinir
     */
    private void txtKmMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtKmMouseClicked
        txtKm.setText("");
    }// GEN-LAST:event_txtKmMouseClicked

    /**
     * @param saveCar() icin fiyat bilgisi alinir
     */
    private void txtPriceMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtPriceMouseClicked
        txtPrice.setText("");
    }// GEN-LAST:event_txtPriceMouseClicked

    /**
     * Programin text alanlarina girilen degerler parametre olarak gelir ve
     * yeni araba olusturulur ve carList´e eklenir.
     */
    public void saveCar() {
        String brandName = txtBrandName.getText();
        String model = txtModel.getText();
        String colour = txtColour.getText();
        int year = Integer.parseInt(txtYear.getText());
        int km = Integer.parseInt(txtKm.getText());
        int price = Integer.parseInt(txtPrice.getText());

        if ((brandName.equals(null)) || (model.equals(null)) || (colour.equals(null))
                || (year == 0) || (km == 0) || (price == 0)) {
            lblResult.setText("Kayıt işlemi başarısız.");
        } else {
            lblResult.setText("Kayıt işlemi başarılı.");
            carList.addCar(new Car(brandName, model, colour, year, km, price));
        }
    }

    /**
     * Text alanlari temizlenir.
     */

    public void clean() {
        txtBrandName.setText("");
        txtModel.setText("");
        txtColour.setText("");
        txtYear.setText("");
        txtKm.setText("");
        txtPrice.setText("");
    }

    /**
     * @param args[]
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JAddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* JAddCar ekrani görünür hale getirilr. */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAddCar().setVisible(true);
            }
        });
    }

    // Degiskenler designer tarafindan tanimlanmistir.
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnSaveCar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtColour;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
