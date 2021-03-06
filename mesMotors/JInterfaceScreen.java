package mesmotors;
//Bu yönetici arayüz ekranı oluyor.

import javax.swing.table.DefaultTableModel;
/**
 * Bütün programda kullanilan static nesneler ayni nesne üzerinde islem yapabilmek icin import edilmistir.
*/
import static mesmotors.JLoginScreen.carList;

public class JInterfaceScreen extends javax.swing.JFrame {

    /**
     * Public ve static olarak JInterfaceScreen,CarList,CustomerQueue nesneleri
     * olusturulmustur.
     * Cünkü tek bir tane bu nesnelerden kullanilmasi ve bütün ekranlarda
     * kullanilmasi gerekirse ayni
     * nesne üzerinden islem yapabilmemiz icin.
     */
    public static JCustomerList jCustomerList = new JCustomerList();
    public static JLoginScreen jLoginScreen = new JLoginScreen();
    public static JAddCar jAddCar = new JAddCar();

    /**
     * JInterfaceScreen olusturulur.
     */
    public JInterfaceScreen() {
        initComponents();

    }

    /**
     * Designerdan otomatik olarak yazdirilan ayarlardir.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAddCar = new javax.swing.JButton();
        btnSellCar = new javax.swing.JButton();
        btnCustomerList = new javax.swing.JButton();
        btnSaleHistory = new javax.swing.JButton();
        btnExitLogin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtSearchStick = new javax.swing.JTextField();
        lblErrorMessage = new javax.swing.JLabel();
        btnPrintCars = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnFindCar = new javax.swing.JButton();
        btnSortIncrease = new javax.swing.JButton();
        btnSortDecrease = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetici Ekranı");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnAddCar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddCar.setText("Araba ekle");
        btnAddCar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarActionPerformed(evt);
            }
        });

        btnSellCar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSellCar.setText("Araba Satışı");
        btnSellCar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSellCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellCarActionPerformed(evt);
            }
        });

        btnCustomerList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCustomerList.setText("Müşteri Listesi");
        btnCustomerList.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCustomerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerListActionPerformed(evt);
            }
        });

        btnSaleHistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaleHistory.setText("Satış Geçmişi");
        btnSaleHistory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSaleHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleHistoryActionPerformed(evt);
            }
        });

        btnExitLogin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnExitLogin.setText("Çıkış");
        btnExitLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExitLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCustomerList, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addComponent(btnAddCar, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSaleHistory, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSellCar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btnExitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSellCar, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSaleHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));

        txtSearchStick.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSearchStick.setText("Id Griniz");
        txtSearchStick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchStickMouseClicked(evt);
            }
        });
        txtSearchStick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchStickActionPerformed(evt);
            }
        });

        lblErrorMessage.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblErrorMessage.setText(" ");

        btnPrintCars.setBackground(new java.awt.Color(0, 0, 51));
        btnPrintCars.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintCars.setForeground(new java.awt.Color(204, 0, 51));
        btnPrintCars.setText("Araç Listesini Yazdır");
        btnPrintCars.setBorder(null);
        btnPrintCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintCarsActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Id", "Marka", "Model", "Renk", "Yıl", "Kilometre", "Fiyat"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        btnFindCar.setBackground(new java.awt.Color(0, 0, 51));
        btnFindCar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFindCar.setForeground(new java.awt.Color(204, 0, 51));
        btnFindCar.setText("Ara");
        btnFindCar.setBorder(null);
        btnFindCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCarActionPerformed(evt);
            }
        });

        btnSortIncrease.setBackground(new java.awt.Color(0, 0, 51));
        btnSortIncrease.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSortIncrease.setForeground(new java.awt.Color(204, 0, 51));
        btnSortIncrease.setText("Artan Fiyata Göre ");
        btnSortIncrease.setBorder(null);
        btnSortIncrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortIncreaseActionPerformed(evt);
            }
        });

        btnSortDecrease.setBackground(new java.awt.Color(0, 0, 51));
        btnSortDecrease.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSortDecrease.setForeground(new java.awt.Color(204, 0, 51));
        btnSortDecrease.setText("Azalan Fiyata Göre");
        btnSortDecrease.setBorder(null);
        btnSortDecrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortDecreaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(427, 427, 427)
                                                .addComponent(btnFindCar, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnPrintCars,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 144,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSortIncrease,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSortDecrease,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblErrorMessage,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 276,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtSearchStick,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 363,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(4, 10, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSearchStick, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnFindCar, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addComponent(btnSortDecrease, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSortIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblErrorMessage)
                                        .addComponent(btnPrintCars, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param printCars(); methodu calisir.
     */
    private void btnPrintCarsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPrintCarsActionPerformed
        printCars();
    }// GEN-LAST:event_btnPrintCarsActionPerformed

    /**
     * @param printCars(
     */
    private void txtSearchStickActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSearchStickActionPerformed

    }// GEN-LAST:event_txtSearchStickActionPerformed

    /**
     * @param findCar() methodu calisir.
     */
    private void btnFindCarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFindCarActionPerformed
        findCar();
    }// GEN-LAST:event_btnFindCarActionPerformed

    /**
     * @param printCars(
     */
    private void txtSearchStickMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtSearchStickMouseClicked
        txtSearchStick.setText("");
    }// GEN-LAST:event_txtSearchStickMouseClicked

    /**
     * jAddCar isimli yeni araba ekleme frame´i acilir.
     */
    private void btnAddCarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddCarActionPerformed
        jAddCar.show();
        dispose();
    }// GEN-LAST:event_btnAddCarActionPerformed

    /**
     * Araba satis fonksiyonu calisir ve liste yeniden yazdirilir.
     */
    private void btnSellCarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSellCarActionPerformed
        sellCar();
        printCars();
    }// GEN-LAST:event_btnSellCarActionPerformed

    /**
     * Satis gecmisi yazdirilir.
     */
    private void btnSaleHistoryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSaleHistoryActionPerformed
        printSaleCar();
    }// GEN-LAST:event_btnSaleHistoryActionPerformed

    /**
     * jCustomerList isimli müsteri listesnin bulundugu frame acilir.
     */
    private void btnCustomerListActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCustomerListActionPerformed
        jCustomerList.show();
        dispose();
    }// GEN-LAST:event_btnCustomerListActionPerformed

    /**
     * Araba listesini azalan fiyata göre siralanmistir.
     */
    private void btnSortDecreaseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSortDecreaseActionPerformed
        sortDecrease();
    }// GEN-LAST:event_btnSortDecreaseActionPerformed

    /**
     * Giris ekranina geri döndürülür.
     */
    private void btnExitLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitLoginActionPerformed
        jLoginScreen.show();
        dispose();
    }// GEN-LAST:event_btnExitLoginActionPerformed

    /**
     * Araba listesini artan fiyata göre siralanmistir.
     */
    private void btnSortIncreaseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSortIncreaseActionPerformed
        sortIncrease();
    }// GEN-LAST:event_btnSortIncreaseActionPerformed

    // Burada jtable'a ekleme işlemini yapıyoruz.
    public void printCars() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[7];

        Node temp = carList.head;
        Node next;

        model.getDataVector().removeAllElements(); // jtable´daki satirlar temizlenir.

        while (temp != null) {
            rowData[0] = ((Car) temp.data).getId();
            rowData[1] = ((Car) temp.data).brandName;
            rowData[2] = ((Car) temp.data).model;
            rowData[3] = ((Car) temp.data).colour;
            rowData[4] = ((Car) temp.data).year;
            rowData[5] = ((Car) temp.data).km;
            rowData[6] = ((Car) temp.data).price;

            temp = temp.next;
            model.addRow(rowData);
        }
    }

    /**
     * Araba arama ve sonucunda gösterme fonksiyonudur.
     * enterProblem() fonksiyonuna dallanir.
     */

    public void findCar() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[7];

        Car temp = new Car();

        temp = enterProblem(temp);

        rowData[0] = temp.getId();
        rowData[1] = temp.brandName;
        rowData[2] = temp.model;
        rowData[3] = temp.colour;
        rowData[4] = temp.year;
        rowData[5] = temp.km;
        rowData[6] = temp.price;

        model.getDataVector().removeAllElements();
        model.addRow(rowData);
    }

    /**
     * @param temp ismi ile araba nesnesi parametre alinir.
     *             CarList sinifinda bulunan linearSearchCar() methodu calisir ve
     *             araba lsitesinde gönderilen araba aranir.
     *             Bulunur ise döndürülür.
     * @return Car
     */
    public Car enterProblem(Car temp) {

        try {
            temp = carList.linearSearchCar(
                    Integer.parseInt(txtSearchStick.getText()));
            lblErrorMessage.setText("");
        } catch (Exception exception) {
            lblErrorMessage.setText("Hatalı id girdiniz.");
            enterProblem(temp);
        } finally {
            return temp;
        }

    }

    /**
     * Araba satis methodudur.
     * Alinan id deleteCar() fonksiyonuna gönderilir.
     */

    public void sellCar() {
        try {
            int id = Integer.parseInt(txtSearchStick.getText());
            carList.deleteCar(id);
            lblErrorMessage.setText("");
        } catch (Exception exception) {
            lblErrorMessage.setText("Hatalı id girdiniz.");
            sellCar();
        }

    }

    /**
     * SoldCars sinifi olan satilan araba gecmisi olarak kullanilan stack yapisi
     * jtable´da gösterilir.
     */

    public void printSaleCar() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[7];
        SoldCars saleCars = new SoldCars();

        Node temp = carList.saleCars.head;
        Node next;

        model.getDataVector().removeAllElements();

        while (temp != null) {
            rowData[0] = ((Car) temp.data).getId();
            rowData[1] = ((Car) temp.data).brandName;
            rowData[2] = ((Car) temp.data).model;
            rowData[3] = ((Car) temp.data).colour;
            rowData[4] = ((Car) temp.data).year;
            rowData[5] = ((Car) temp.data).km;
            rowData[6] = ((Car) temp.data).price;

            temp = temp.next;
            model.addRow(rowData);
        }
    }

    // Araba listesi azalan fiyata göre siralanip yazdirilir.

    public void sortDecrease() {
        carList.sortDecreasePrice();
        printCars();
    }

    // Araba listesi artan fiyata göre siralanip yazdirilir.

    public void sortIncrease() {
        carList.sortIncreasePrice();
        printCars();
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
            java.util.logging.Logger.getLogger(JInterfaceScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JInterfaceScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JInterfaceScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JInterfaceScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Yönetici arayüzü ekrani görünür hale getirilr. */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JInterfaceScreen().setVisible(true);
            }
        });

    }

    // Degiskenler designer tarafindan tanimlanmistir.
    private javax.swing.JButton btnAddCar;
    private javax.swing.JButton btnCustomerList;
    private javax.swing.JButton btnExitLogin;
    private javax.swing.JButton btnFindCar;
    private javax.swing.JButton btnPrintCars;
    private javax.swing.JButton btnSaleHistory;
    private javax.swing.JButton btnSellCar;
    private javax.swing.JButton btnSortDecrease;
    private javax.swing.JButton btnSortIncrease;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JTextField txtSearchStick;
    // End of variables declaration//GEN-END:variables
}
