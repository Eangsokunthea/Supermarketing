/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;  
import java.sql.Driver; 
import java.sql.ResultSet; 
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        SelectSeller();
        GetCat();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectSeller(){
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.PRODUCTTBL");
            ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void GetCat(){
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
            St = Con.createStatement();
            String query = "Select * from User1.CATEGORYTBL";
            Rs = St.executeQuery(query);
            while(Rs.next()){
                String MyCat = Rs.getString("CATNAME");
                CatCb.addItem(MyCat);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ProdId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ProdName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ProdQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ProdPrice = new javax.swing.JTextField();
        CatCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        CloseBtn = new javax.swing.JLabel();
        Seller = new javax.swing.JLabel();
        Categories = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AdUpdate = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("PRODUCTS LIST");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("PRODID");

        ProdId.setBackground(new java.awt.Color(204, 255, 204));
        ProdId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProdId.setForeground(new java.awt.Color(255, 0, 0));
        ProdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("NAME");

        ProdName.setBackground(new java.awt.Color(204, 255, 204));
        ProdName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProdName.setForeground(new java.awt.Color(255, 0, 0));
        ProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("QUANTITY");

        ProdQty.setBackground(new java.awt.Color(204, 255, 204));
        ProdQty.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProdQty.setForeground(new java.awt.Color(255, 0, 0));
        ProdQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdQtyActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("PRICE");

        ProdPrice.setBackground(new java.awt.Color(204, 255, 204));
        ProdPrice.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProdPrice.setForeground(new java.awt.Color(255, 0, 0));
        ProdPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdPriceActionPerformed(evt);
            }
        });

        CatCb.setBackground(new java.awt.Color(204, 255, 204));
        CatCb.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        CatCb.setForeground(new java.awt.Color(255, 0, 0));
        CatCb.setToolTipText("");
        CatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatCbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("CATEGORY");

        EditBtn.setBackground(new java.awt.Color(204, 255, 204));
        EditBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 0, 0));
        EditBtn.setText("EDIT");
        EditBtn.setBorder(null);
        EditBtn.setBorderPainted(false);
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(204, 255, 204));
        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 0, 0));
        ClearBtn.setText("CLEAR");
        ClearBtn.setBorder(null);
        ClearBtn.setBorderPainted(false);
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(204, 255, 204));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 0, 0));
        AddBtn.setText("ADD");
        AddBtn.setBorder(null);
        AddBtn.setBorderPainted(false);
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(204, 255, 204));
        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 0, 0));
        DeleteBtn.setText("DELETE");
        DeleteBtn.setBorder(null);
        DeleteBtn.setBorderPainted(false);
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ProductTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        ProductTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProductTable.setRowHeight(25);
        ProductTable.setSelectionBackground(new java.awt.Color(204, 255, 204));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("MANAGE PRODUCTS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(ProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProdName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProdQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProdPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CatCb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(355, 355, 355))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(326, 326, 326))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );

        CloseBtn.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(255, 0, 0));
        CloseBtn.setText("x");
        CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtnMouseClicked(evt);
            }
        });

        Seller.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Seller.setForeground(new java.awt.Color(255, 0, 0));
        Seller.setText("SELLER");
        Seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerMouseClicked(evt);
            }
        });

        Categories.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Categories.setForeground(new java.awt.Color(255, 0, 0));
        Categories.setText("CATEGORIES");
        Categories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriesMouseClicked(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 0, 0));
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\shopping-cart.png")); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(512, 512));

        AdUpdate.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        AdUpdate.setForeground(new java.awt.Color(255, 0, 0));
        AdUpdate.setText("ADMIN UPDATE");
        AdUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdUpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(Logout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AdUpdate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Categories))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Seller)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CloseBtn))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Seller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Categories)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdIdActionPerformed

    private void ProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdNameActionPerformed

    private void ProdQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdQtyActionPerformed

    private void ProdPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdPriceActionPerformed

    private void CatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatCbActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(ProdId.getText().isEmpty() || ProdName.getText().isEmpty() || ProdQty.getText().isEmpty() || ProdPrice.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this, "Missing Information");
           
        }else{
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
                PreparedStatement add = Con.prepareStatement("insert into PRODUCTTBL values (?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(ProdId.getText()));
                add.setString(2, ProdName.getText());
                add.setInt(3, Integer.valueOf(ProdQty.getText()));
                add.setInt(4, Integer.valueOf(ProdPrice.getText()));
                add.setString(5, CatCb.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Added Successfully");
                Con.close();
                SelectSeller();
            }catch(Exception e){ 
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        ProdId.setText("");
        ProdName.setText("");
        ProdQty.setText("");
        ProdPrice.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(ProdId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter The Product To be Deleted");

        }else{
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
                String PrId = ProdId.getText();
                String Query = "Delete from User1.PRODUCTTBL where PRODID="+PrId;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectSeller();
                JOptionPane.showMessageDialog(this, "Product Deleted Successfully");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(ProdId.getText().isEmpty() || ProdName.getText().isEmpty() || ProdQty.getText().isEmpty()|| ProdPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
                String Query = "Update User1.PRODUCTTBL set PRODNAME='"+ProdName.getText()
                        +"'"+",PRODQTY="+ProdQty.getText()
                        +""+",PRODPRICE="+ProdPrice.getText()
                        +""+",PRODCAT='"+CatCb.getSelectedItem().toString() 
                        +"'"+" where PRODID="+ProdId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Product Updated Successfully");
                SelectSeller();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
       DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow();
        ProdId.setText(model.getValueAt(Myindex, 0).toString());
        ProdName.setText(model.getValueAt(Myindex, 1).toString());
        ProdQty.setText(model.getValueAt(Myindex, 2).toString());
        ProdPrice.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseBtnMouseClicked

    private void SellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerMouseClicked
        new Seller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SellerMouseClicked

    private void CategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriesMouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategoriesMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void AdUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdUpdateMouseClicked
        new UpdateAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AdUpdateMouseClicked

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdUpdate;
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox<String> CatCb;
    private javax.swing.JLabel Categories;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel Logout;
    private javax.swing.JTextField ProdId;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdPrice;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JLabel Seller;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
