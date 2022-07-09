package inventorymangementsystem;

import Database.ConnectionFactory;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class product extends javax.swing.JFrame {

    public product() {
        initComponents();
        SelectProd();
        GetCat();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ProdId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ProdName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ProdQty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ProdDesc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ProdCat = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProdTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ProdPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        close.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("X");
        close.setToolTipText("");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Uighur", 1, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inventory Management System");

        jLabel2.setFont(new java.awt.Font("Microsoft Uighur", 1, 56)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Product");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel6.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ProdId");

        ProdId.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        ProdId.setForeground(new java.awt.Color(153, 153, 153));
        ProdId.setText("Enter Product id");
        ProdId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProdIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProdIdFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Name");

        ProdName.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        ProdName.setForeground(new java.awt.Color(153, 153, 153));
        ProdName.setText("Enter Name of Product");
        ProdName.setToolTipText("");
        ProdName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProdNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProdNameFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quantity");

        ProdQty.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        ProdQty.setForeground(new java.awt.Color(153, 153, 153));
        ProdQty.setText("Enter Quantity");
        ProdQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProdQtyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProdQtyFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Description");

        ProdDesc.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        ProdDesc.setForeground(new java.awt.Color(153, 153, 153));
        ProdDesc.setText("Enter Description");
        ProdDesc.setToolTipText("");
        ProdDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProdDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProdDescFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Category");

        AddBtn.setBackground(new java.awt.Color(204, 204, 255));
        AddBtn.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddBtnMouseExited(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(204, 204, 255));
        UpdateBtn.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseExited(evt);
            }
        });

        HomeBtn.setBackground(new java.awt.Color(204, 204, 255));
        HomeBtn.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        HomeBtn.setText("Home");
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeBtnMouseExited(evt);
            }
        });

        ProdTable.setFont(new java.awt.Font("Microsoft Uighur", 1, 18)); // NOI18N
        ProdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProdId", "Name", "Quantity", "Description", "Price" , "Category"
            }
        ){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        ProdTable.setGridColor(new java.awt.Color(204, 204, 204));
        ProdTable.setName(""); // NOI18N
        ProdTable.setRowHeight(30);
        ProdTable.setSelectionBackground(new java.awt.Color(51, 102, 255));
        ProdTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ProdTable.setShowGrid(true);
        ProdTable.getTableHeader().setReorderingAllowed(false);
        ProdTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProdTable);

        jLabel9.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Product List");

        DeleteBtn.setBackground(new java.awt.Color(204, 204, 255));
        DeleteBtn.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Price");

        ProdPrice.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        ProdPrice.setForeground(new java.awt.Color(153, 153, 153));
        ProdPrice.setText("Enter Price");
        ProdPrice.setToolTipText("");
        ProdPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProdPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProdPriceFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UpdateBtn)
                        .addGap(126, 126, 126))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ProdCat, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(217, 217, 217))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(ProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProdCat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Blackcolor(){
        if(!ProdId.getText().equals("Enter Product id") )
             ProdId.setForeground(new Color(0,0,0));
        if(!ProdName.getText().equals("Enter Name of Product") )
             ProdName.setForeground(new Color(0,0,0));
        if(!ProdDesc.getText().equals("Enter Description") )
             ProdDesc.setForeground(new Color(0,0,0));
        if(!ProdQty.getText().equals("Enter Quantity") )
             ProdQty.setForeground(new Color(0,0,0));
        if(!ProdPrice.getText().equals("Enter Price"))
            ProdPrice.setForeground(new Color(0,0,0));
    }
    
     public void SelectProd(){
        try{
            Con = new ConnectionFactory().getConn();
            St =  Con.createStatement();
            Rs = St.executeQuery("Select * from ProductTABLE Order by PRODID");
            DefaultTableModel model = (DefaultTableModel) ProdTable.getModel();
            model.setRowCount(0);
           while(Rs.next()){
               String[] row = {Rs.getString(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getString(6),Rs.getString(5)};
               model.addRow(row);
           }
           
           St.close();
           Rs.close();
           Con.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
     
     
     private void GetCat(){
         try{
            Con = new ConnectionFactory().getConn();
            St =  Con.createStatement();
            Rs = St.executeQuery("Select * from CATEGORYTBL");
            while(Rs.next()){
                String MyCat = Rs.getString("CATNAME");
                ProdCat.addItem(MyCat);
            }
         }
         catch(Exception e){
             e.printStackTrace();
         }
     }
     
    private void ProdIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProdIdFocusGained
        if(ProdId.getText().equals("Enter Product id")){
            ProdId.setText("");
            ProdId.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_ProdIdFocusGained

    private void ProdIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProdIdFocusLost
        if(ProdId.getText().equals("")){
            ProdId.setText("Enter Product id");
            ProdId.setForeground(new Color(153,153,153));
        }
        Blackcolor();

    }//GEN-LAST:event_ProdIdFocusLost

    private void ProdNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProdNameFocusGained
        if(ProdName.getText().equals("Enter Name of Product")){
            ProdName.setText("");
            ProdName.setForeground(new Color(153,153,153));
        }
        
        Blackcolor();
    }//GEN-LAST:event_ProdNameFocusGained

    private void ProdNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProdNameFocusLost
        if(ProdName.getText().equals("")){
            ProdName.setText("Enter Name of Product");
            ProdName.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_ProdNameFocusLost

    private void ProdDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProdDescFocusGained
        if(ProdDesc.getText().equals("Enter Description")){
            ProdDesc.setText("");
            ProdDesc.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_ProdDescFocusGained

    private void ProdDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProdDescFocusLost
        if(ProdDesc.getText().equals("")){
            ProdDesc.setText("Enter Description");
            ProdDesc.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_ProdDescFocusLost

    private void ProdQtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProdQtyFocusGained
        if(ProdQty.getText().equals("Enter Quantity")){
            ProdQty.setText("");
            ProdQty.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_ProdQtyFocusGained

    private void ProdQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProdQtyFocusLost
        if(ProdQty.getText().equals("")){
            ProdQty.setText("Enter Quantity");
            ProdQty.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_ProdQtyFocusLost
    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(ProdId.getText().equals("Enter Product id") || ProdName.getText().equals("Enter Name of Product") || ProdQty.getText().equals("Enter Quantity") || ProdDesc.getText().equals("Enter Description") || ProdPrice.getText().equals("Enter Price") ){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                PreparedStatement add = Con.prepareStatement("insert into PRODUCTTABLE values(?,?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(ProdId.getText()));
                add.setString(2,ProdName.getText());
                add.setInt(3, Integer.valueOf(ProdQty.getText()));            
                add.setString(4,ProdDesc.getText());
                add.setString(5, ProdCat.getSelectedItem().toString());
                add.setDouble(6, Double.valueOf(ProdPrice.getText()));
                add.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Product Added Successfully");
                Con.close();
                SelectProd();
            }
            catch(SQLIntegrityConstraintViolationException e){            
                    JOptionPane.showMessageDialog(this, "Product Already Exists");
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(ProdId.getText().equals("Enter Product id")){
            JOptionPane.showMessageDialog(this, "Enter the Product to be deleted");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                String id = ProdId.getText();
                String query = "Delete from PRODUCTTABLE where PRODID="+id;
                Statement add = Con.createStatement();
                int row = add.executeUpdate(query);
                Con.close();
                SelectProd();
                if(row ==0)
                JOptionPane.showMessageDialog(this, "Product does not Exists ");
                else
                JOptionPane.showMessageDialog(this, "Product Deleted Successfully");

            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ProdTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProdTable.getModel();
        int MyIndex = ProdTable.getSelectedRow();
        ProdId.setText(model.getValueAt(MyIndex, 0).toString());
        ProdName.setText(model.getValueAt(MyIndex, 1).toString());
        ProdQty.setText(model.getValueAt(MyIndex, 2).toString());
        ProdDesc.setText(model.getValueAt(MyIndex, 3).toString());
        ProdPrice.setText(model.getValueAt(MyIndex, 4).toString());
        ProdCat.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
        Blackcolor();
    }//GEN-LAST:event_ProdTableMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if(ProdId.getText().equals("Enter Product id") || ProdName.getText().equals("Enter Name of Product") || ProdQty.getText().equals("Enter Quantity") || ProdDesc.getText().equals("Enter Description") || ProdPrice.getText().equals("Enter Price") ){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                String query = "update PRODUCTTABLE set PRODNAME = '"
                        + ProdName.getText() +"' , PRODQTY = "
                        + ProdQty.getText()+" , PRODDESC = '"
                        +ProdDesc.getText() + "' , PRODCAT = '"
                        +ProdCat.getSelectedItem().toString() 
                        + "' , ProPrice = "+  Double.valueOf(ProdPrice.getText() )
                        +" where PRODID ="+ProdId.getText();
                Statement add = Con.createStatement();
                int row = add.executeUpdate(query);
                Con.close();
                SelectProd();
                if(row ==0)
                JOptionPane.showMessageDialog(this, "Product does not Exists ");
                else
                JOptionPane.showMessageDialog(this, "Product Updated Successfully");
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void UpdateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseEntered
        UpdateBtn.setBackground(new Color(102,102,255));
        UpdateBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_UpdateBtnMouseEntered

    private void UpdateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseExited
        UpdateBtn.setBackground(new Color(204,204,255));
        UpdateBtn.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_UpdateBtnMouseExited

    private void AddBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseEntered
        AddBtn.setBackground(new Color(102,102,255));
        AddBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_AddBtnMouseEntered

    private void AddBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseExited
        AddBtn.setBackground(new Color(204,204,255));
        AddBtn.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_AddBtnMouseExited

    private void DeleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseEntered
        DeleteBtn.setBackground(new Color(102,102,255));
        DeleteBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_DeleteBtnMouseEntered

    private void DeleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseExited
        DeleteBtn.setBackground(new Color(204,204,255));
        DeleteBtn.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_DeleteBtnMouseExited

    private void HomeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseEntered
        HomeBtn.setBackground(new Color(102,102,255));
        HomeBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_HomeBtnMouseEntered

    private void HomeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseExited
        HomeBtn.setBackground(new Color(204,204,255));
        HomeBtn.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_HomeBtnMouseExited

    private void ProdPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProdPriceFocusGained
        if(ProdPrice.getText().equals("Enter Price")){
            ProdPrice.setText("");
            ProdPrice.setForeground(new Color(153,153,153));
        }
        
        Blackcolor();
    }//GEN-LAST:event_ProdPriceFocusGained

    private void ProdPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProdPriceFocusLost
        if(ProdPrice.getText().equals("")){
            ProdPrice.setText("Enter Price");
            ProdPrice.setForeground(new Color(153,153,153));
        }
        
        Blackcolor();
    }//GEN-LAST:event_ProdPriceFocusLost

    
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
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JComboBox<String> ProdCat;
    private javax.swing.JTextField ProdDesc;
    private javax.swing.JTextField ProdId;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdPrice;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProdTable;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
