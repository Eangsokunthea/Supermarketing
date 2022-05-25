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
public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    public Selling() {
        initComponents();
        SelectSeller();
        GetCat();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectSeller(){
        try{
            Con = java.sql.DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
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
    
    int Prid, newQty;
    public void Update(){
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
            String Query = "Update User1.PRODUCTTBL set PRODQTY="+newQty
                    +""+" where PRODID="+Prid;
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
//            JOptionPane.showMessageDialog(this, "Product Updated Successfully");
            SelectSeller();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BillId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ProdName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ProdQty = new javax.swing.JTextField();
        CatCb = new javax.swing.JComboBox<>();
        PrintBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        Grdtotallbl = new javax.swing.JLabel();
        FilterBtn = new javax.swing.JButton();
        CloseBtn = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("BILLID");

        BillId.setBackground(new java.awt.Color(204, 255, 204));
        BillId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BillId.setForeground(new java.awt.Color(255, 0, 0));
        BillId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillIdActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("NAME");

        ProdName.setBackground(new java.awt.Color(204, 255, 204));
        ProdName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProdName.setForeground(new java.awt.Color(255, 0, 0));
        ProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("QUANTITY");

        ProdQty.setBackground(new java.awt.Color(204, 255, 204));
        ProdQty.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProdQty.setForeground(new java.awt.Color(255, 0, 0));
        ProdQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdQtyActionPerformed(evt);
            }
        });

        CatCb.setBackground(new java.awt.Color(204, 255, 204));
        CatCb.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        CatCb.setForeground(new java.awt.Color(255, 0, 0));
        CatCb.setToolTipText("");
        CatCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CatCbItemStateChanged(evt);
            }
        });
        CatCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatCbMouseClicked(evt);
            }
        });
        CatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatCbActionPerformed(evt);
            }
        });

        PrintBtn.setBackground(new java.awt.Color(204, 255, 204));
        PrintBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 0, 0));
        PrintBtn.setText("PRINT");
        PrintBtn.setBorder(null);
        PrintBtn.setBorderPainted(false);
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(204, 255, 204));
        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 0, 0));
        ClearBtn.setText("REFRESH");
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
        AddBtn.setText("ADD TO BILL");
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

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("BILLING POINT");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("PRODUCTS LIST");

        BillTxt.setColumns(20);
        BillTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        Grdtotallbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Grdtotallbl.setForeground(new java.awt.Color(255, 0, 0));
        Grdtotallbl.setText("Result");

        FilterBtn.setBackground(new java.awt.Color(204, 255, 204));
        FilterBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        FilterBtn.setForeground(new java.awt.Color(255, 0, 0));
        FilterBtn.setText("Filter");
        FilterBtn.setBorder(null);
        FilterBtn.setBorderPainted(false);
        FilterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterBtnMouseClicked(evt);
            }
        });
        FilterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FilterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(Grdtotallbl)
                                            .addGap(40, 40, 40)))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ProdName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                                    .addComponent(ProdQty, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BillId))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Grdtotallbl)
                        .addGap(28, 28, 28)
                        .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        CloseBtn.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(255, 0, 0));
        CloseBtn.setText("x");
        CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtnMouseClicked(evt);
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

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\shopping-cart.png")); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(512, 512));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Logout)))
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(513, 513, 513)
                        .addComponent(Logout))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BillIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIdActionPerformed

    private void ProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdNameActionPerformed

    private void ProdQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdQtyActionPerformed

    private void CatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatCbActionPerformed

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        try{
            BillTxt.print();
        }catch(Exception e){
            
        }
      
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        BillId.setText("");
        ProdName.setText("");
        ProdQty.setText("");
//        ProdPrice.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

   
    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed
    
    int i = 0;
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(ProdQty.getText().isEmpty() || ProdName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else if(AvailQty <= Integer.valueOf(ProdQty.getText())){
            JOptionPane.showMessageDialog(this, "Not Enough In Stock");
        }
        else{
           i++;
           ProdTot = Uprice * Integer.valueOf(ProdQty.getText());
           GrdTotal = GrdTotal + ProdTot;
           if(i == 1)
           {
               BillTxt.setText(BillTxt.getText()+
                       "=======================FAMILY SEA=======================\n"+
                       "NUM             PRODUCT            PRICE           QUANTITY           TOTAL\n"+i+"                  "+
                       ProdName.getText()+"           "+
                       Uprice+"             "+
                       ProdQty.getText()+"                           "+
                       ProdTot+"\n");
           }
           else{
               BillTxt.setText(BillTxt.getText()
                       +i+"                  "+
                       ProdName.getText()+"           "+
                       Uprice+"             "+
                       ProdQty.getText()+"                           "+
                       ProdTot+"\n");
           }
           Grdtotallbl.setText("Result : " + GrdTotal);
           Update();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        SelectSeller();
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    Double Uprice, ProdTot=0.0, GrdTotal=0.0;
    int AvailQty;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow();
        ProdName.setText(model.getValueAt(Myindex, 1).toString());
        Uprice = Double.valueOf(model.getValueAt(Myindex, 3).toString());
        AvailQty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        Prid = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        newQty = AvailQty - Integer.valueOf(ProdQty.getText());
//        ProdTot = Uprice * Integer.valueOf(ProdQty.getText());

    }//GEN-LAST:event_ProductTableMouseClicked

    private void CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseBtnMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void CatCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatCbMouseClicked
      
    }//GEN-LAST:event_CatCbMouseClicked

    private void CatCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CatCbItemStateChanged
        
    }//GEN-LAST:event_CatCbItemStateChanged

    private void FilterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterBtnMouseClicked
        try{
            Con = java.sql.DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb", "User1", "12345");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.CATEGORYTBL where CATNAME='"+CatCb.getSelectedItem().toString()+"'");
            ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_FilterBtnMouseClicked

    private void FilterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField BillId;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JComboBox<String> CatCb;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton FilterBtn;
    private javax.swing.JLabel Grdtotallbl;
    private javax.swing.JLabel Logout;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
