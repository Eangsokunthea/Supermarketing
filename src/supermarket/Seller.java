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
public class Seller extends javax.swing.JFrame {

    /**
     * Creates new form Seller
     */
    public Seller() {
        initComponents();
        SelectSeller();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectSeller(){
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.SELLERTBL");
            SellerTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogoutBtn = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SellId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SellName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SellPass = new javax.swing.JTextField();
        GenderCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SellerTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        CloseBtn = new javax.swing.JLabel();
        Categories = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Products = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        LogoutBtn.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("SELLERS LIST");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("SELLERID");

        SellId.setBackground(new java.awt.Color(204, 255, 204));
        SellId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SellId.setForeground(new java.awt.Color(255, 0, 0));
        SellId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("NAME");

        SellName.setBackground(new java.awt.Color(204, 255, 204));
        SellName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SellName.setForeground(new java.awt.Color(255, 0, 0));
        SellName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("PASSWORD");

        SellPass.setBackground(new java.awt.Color(204, 255, 204));
        SellPass.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SellPass.setForeground(new java.awt.Color(255, 0, 0));
        SellPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellPassActionPerformed(evt);
            }
        });

        GenderCb.setBackground(new java.awt.Color(204, 255, 204));
        GenderCb.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        GenderCb.setForeground(new java.awt.Color(255, 0, 0));
        GenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        GenderCb.setToolTipText("");
        GenderCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderCbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("GENDER");

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

        SellerTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "PASSWORD", "GENDER"
            }
        ));
        SellerTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        SellerTable.setRowHeight(25);
        SellerTable.setSelectionBackground(new java.awt.Color(204, 255, 204));
        SellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SellerTable);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("MANAGE SELLERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(SellId, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SellName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SellPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderCb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(346, 346, 346))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(377, 377, 377))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SellId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SellName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SellPass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(134, 134, 134)))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
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

        Categories.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Categories.setForeground(new java.awt.Color(255, 0, 0));
        Categories.setText("CATEGORIES");
        Categories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriesMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\shopping-cart.png")); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(512, 512));

        Products.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Products.setForeground(new java.awt.Color(255, 0, 0));
        Products.setText("PRODUCTS");
        Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsMouseClicked(evt);
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

        javax.swing.GroupLayout LogoutBtnLayout = new javax.swing.GroupLayout(LogoutBtn);
        LogoutBtn.setLayout(LogoutBtnLayout);
        LogoutBtnLayout.setHorizontalGroup(
            LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutBtnLayout.createSequentialGroup()
                .addGroup(LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LogoutBtnLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CloseBtn))
                    .addGroup(LogoutBtnLayout.createSequentialGroup()
                        .addGroup(LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LogoutBtnLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LogoutBtnLayout.createSequentialGroup()
                                .addGroup(LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(LogoutBtnLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(Products))
                                    .addGroup(LogoutBtnLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(Categories))
                                    .addGroup(LogoutBtnLayout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(Logout)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        LogoutBtnLayout.setVerticalGroup(
            LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutBtnLayout.createSequentialGroup()
                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LogoutBtnLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Products)
                        .addGap(18, 18, 18)
                        .addComponent(Categories)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SellIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellIdActionPerformed

    private void SellNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellNameActionPerformed

    private void SellPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellPassActionPerformed

    private void GenderCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderCbActionPerformed

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
        if(SellId.getText().isEmpty() || SellName.getText().isEmpty() || SellPass.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this, "Missing Information");
           
        }else{
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
                PreparedStatement add = Con.prepareStatement("insert into SELLERTBL values (?,?,?,?)");
                add.setInt(1, Integer.valueOf(SellId.getText()));
                add.setString(2, SellName.getText());
                add.setString(3, SellPass.getText());
                add.setString(4, GenderCb.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Seller Added Successfully");
                Con.close();
                SelectSeller();
            }catch(Exception e){ 
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_AddBtnMouseClicked

    private void SellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) SellerTable.getModel();
        int Myindex = SellerTable.getSelectedRow();
        SellId.setText(model.getValueAt(Myindex, 0).toString());
        SellName.setText(model.getValueAt(Myindex, 1).toString());
        SellPass.setText(model.getValueAt(Myindex, 2).toString());

    }//GEN-LAST:event_SellerTableMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        SellId.setText("");
        SellName.setText("");
        SellPass.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(SellId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter The Seller To be Deleted");

        }else{
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
                String SId = SellId.getText();
                String Query = "Delete from User1.SELLERTBL where SELID="+SId;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectSeller();
                JOptionPane.showMessageDialog(this, "Seller Deleted Successfully");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(SellId.getText().isEmpty() || SellName.getText().isEmpty() || SellPass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
                String Query = "Update User1.SELLERTBL set SELNAME='"+SellName.getText()
                        +"'"+",SELPASS='"+SellPass.getText()
                        +"'"+",SELGENDER='"+GenderCb.getSelectedItem().toString() 
                        +"'"+"where SELID="+SellId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Seller Updated Successfully");
                SelectSeller();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseClicked
       System.exit(0);
    }//GEN-LAST:event_CloseBtnMouseClicked

    private void ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMouseClicked
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductsMouseClicked

    private void CategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriesMouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategoriesMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel Categories;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> GenderCb;
    private javax.swing.JLabel Logout;
    private javax.swing.JPanel LogoutBtn;
    private javax.swing.JLabel Products;
    private javax.swing.JTextField SellId;
    private javax.swing.JTextField SellName;
    private javax.swing.JTextField SellPass;
    private javax.swing.JTable SellerTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
