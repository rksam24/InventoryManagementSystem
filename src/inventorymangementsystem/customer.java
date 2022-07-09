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

public class customer extends javax.swing.JFrame {

    public customer() {
        initComponents();
        SelectCustomer();
    }

    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CustId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CustName = new javax.swing.JTextField();
        CustEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CustPh = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        OrderAmt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        OrderNo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        jLabel2.setText("Customer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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
        jLabel4.setText("CustId");

        CustId.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        CustId.setForeground(new java.awt.Color(153, 153, 153));
        CustId.setText("Enter Customer id");
        CustId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CustIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CustIdFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Name");

        CustName.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        CustName.setForeground(new java.awt.Color(153, 153, 153));
        CustName.setText("Enter Customer Name");
        CustName.setToolTipText("");
        CustName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CustNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CustNameFocusLost(evt);
            }
        });

        CustEmail.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        CustEmail.setForeground(new java.awt.Color(153, 153, 153));
        CustEmail.setText("Enter Email Id");
        CustEmail.setToolTipText("");
        CustEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CustEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CustEmailFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email Id");

        jLabel7.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Phone");

        CustPh.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        CustPh.setForeground(new java.awt.Color(153, 153, 153));
        CustPh.setText("Enter Phone No.");
        CustPh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CustPhFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CustPhFocusLost(evt);
            }
        });

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

        CustTable.setFont(new java.awt.Font("Microsoft Uighur", 1, 18)); // NOI18N
        CustTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustId", "Name", "Phone", "Email Id"
            }
        ){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        CustTable.setGridColor(new java.awt.Color(204, 204, 204));
        CustTable.setName(""); // NOI18N
        CustTable.setRowHeight(25);
        CustTable.setSelectionBackground(new java.awt.Color(51, 102, 255));
        CustTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CustTable.getTableHeader().setResizingAllowed(false);
        CustTable.getTableHeader().setReorderingAllowed(false);
        CustTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustTable);

        jLabel9.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Customer List");

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));

        OrderAmt.setFont(new java.awt.Font("Microsoft Uighur", 0, 28)); // NOI18N
        OrderAmt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrderAmt.setText("X");

        jLabel8.setFont(new java.awt.Font("Microsoft Uighur", 0, 28)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Order Amount");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OrderAmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderAmt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 255, 255));

        OrderNo.setFont(new java.awt.Font("Microsoft Uighur", 0, 28)); // NOI18N
        OrderNo.setText("X");

        jLabel3.setFont(new java.awt.Font("Microsoft Uighur", 0, 28)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Number of Order");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(OrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrderNo)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CustId, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CustName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CustPh, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeleteBtn)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(257, 257, 257))))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CustId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustPh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
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
        if(!CustId.getText().equals("Enter Customer id") )
             CustId.setForeground(new Color(0,0,0));
        if(!CustName.getText().equals("Enter Customer Name") )
             CustName.setForeground(new Color(0,0,0)); 
        if(!CustPh.getText().equals("Enter Phone No."))
            CustPh.setForeground(new Color(0,0,0));
        if(!CustEmail.getText().equals("Enter Email Id") )
             CustEmail.setForeground(new Color(0,0,0));
    }
    
     public void SelectCustomer(){
        try{
            Con = new ConnectionFactory().getConn();
            St =  Con.createStatement();
            Rs = St.executeQuery("Select * from CUSTOMERTBL Order by CUSTID");
            DefaultTableModel model = (DefaultTableModel) CustTable.getModel();
            model.setRowCount(0);
            while(Rs.next()){
               String[] row = {Rs.getString(1),Rs.getString(2),Rs.getString(3),Rs.getString(4)};
               model.addRow(row);
            }
           
            St.close();
            Rs.close();
            Con.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    private void CustIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CustIdFocusGained
        if(CustId.getText().equals("Enter Customer id")){
            CustId.setText("");
            CustId.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CustIdFocusGained

    private void CustIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CustIdFocusLost
        if(CustId.getText().equals("")){
            CustId.setText("Enter Customer id");
            CustId.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CustIdFocusLost

    private void CustNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CustNameFocusGained
        if(CustName.getText().equals("Enter Customer Name")){
            CustName.setText("");
            CustName.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CustNameFocusGained

    private void CustNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CustNameFocusLost
        if(CustName.getText().equals("")){
            CustName.setText("Enter Customer Name");
            CustName.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CustNameFocusLost

    private void CustEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CustEmailFocusGained
        if(CustEmail.getText().equals("Enter Email Id")){
            CustEmail.setText("");
            CustEmail.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CustEmailFocusGained

    private void CustEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CustEmailFocusLost
        if(CustEmail.getText().equals("")){
            CustEmail.setText("Enter Email Id");
            CustEmail.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CustEmailFocusLost

    private void CustPhFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CustPhFocusGained
        if(CustPh.getText().equals("Enter Phone No.")){
            CustPh.setText("");
            CustPh.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CustPhFocusGained

    private void CustPhFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CustPhFocusLost
        if(CustPh.getText().equals("")){
            CustPh.setText("Enter Phone No.");
            CustPh.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CustPhFocusLost

    private void AddBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseEntered
        AddBtn.setBackground(new Color(102,102,255));
        AddBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_AddBtnMouseEntered

    private void AddBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseExited
        AddBtn.setBackground(new Color(204,204,255));
        AddBtn.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_AddBtnMouseExited

    private void UpdateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseEntered
        UpdateBtn.setBackground(new Color(102,102,255));
        UpdateBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_UpdateBtnMouseEntered

    private void UpdateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseExited
        UpdateBtn.setBackground(new Color(204,204,255));
        UpdateBtn.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_UpdateBtnMouseExited

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

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
       if(CustId.getText().equals("Enter Customer id") || CustName.getText().equals("Enter Customer Name") || CustName.getText().equals("Enter Email Id")){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                PreparedStatement add = Con.prepareStatement("insert into CUSTOMERTBL values(?,?,?,?)");
                add.setInt(1, Integer.valueOf(CustId.getText()));
                add.setString(2,CustName.getText());
                add.setString(3, CustPh.getText());                
                add.setString(4,CustEmail.getText());
                add.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Customer Added Successfully");
                Con.close();
            }
            catch(SQLIntegrityConstraintViolationException e){            
                    JOptionPane.showMessageDialog(this, "Customer Already Exists");
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            SelectCustomer();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if(CustId.getText().equals("Enter Customer id") || CustName.getText().equals("Enter Customer Name") || CustName.getText().equals("Enter Email Id")){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                String query = "update CUSTOMERTBL set CUSTNAME = '"+ CustName.getText() + "' , CUSTPH = '"+CustPh.getText() + "' ,CUSTEMAIL = '"+ CustEmail.getText()  +"' where CustID ="+Integer.valueOf(CustId.getText());
                Statement add = Con.createStatement();
                int row = add.executeUpdate(query);
                Con.close();
                if(row ==0)
                    JOptionPane.showMessageDialog(this, "Customer not Exists ");
                else
                    JOptionPane.showMessageDialog(this, "Customer Updated Successfully");
                SelectCustomer();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(CustId.getText().equals("Enter Customer id")){
            JOptionPane.showMessageDialog(this, "Enter the Customer to be deleted");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                String id = CustId.getText();
                String query = "Delete from CUSTOMERTBL where CUSTID="+id;
                Statement add = Con.createStatement();
                int row = add.executeUpdate(query);
                Con.close();
                if(row ==0)
                    JOptionPane.showMessageDialog(this, "Customer does not Exists ");
                else
                    JOptionPane.showMessageDialog(this, "Customer Deleted Successfully");
                SelectCustomer();

            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void CustTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CustTable.getModel();
        int MyIndex = CustTable.getSelectedRow();
        CustId.setText(model.getValueAt(MyIndex, 0).toString());
        CustName.setText(model.getValueAt(MyIndex, 1).toString());
        CustPh.setText(model.getValueAt(MyIndex, 2).toString());
        CustEmail.setText(model.getValueAt(MyIndex, 3).toString());
        try{
            Con = new ConnectionFactory().getConn();
            St = Con.createStatement();
            Statement St1 = Con.createStatement();
            Rs = St.executeQuery("Select count(*) from ORDERTBL where CUSTID = "+model.getValueAt(MyIndex, 0));
            ResultSet Rs1 = St1.executeQuery("Select sum(AMOUNT) from ORDERTBL where CUSTID = "+ model.getValueAt(MyIndex, 0) );
            while(Rs.next()){
                OrderNo.setText(""+Rs.getInt(1));
            }
            
            while(Rs1.next()){
                OrderAmt.setText("Rs. "+ Rs1.getDouble(1));
            }
            
        }
        catch(Exception e){
            
        }
        Blackcolor();
    }//GEN-LAST:event_CustTableMouseClicked
                        
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField CustEmail;
    private javax.swing.JTextField CustId;
    private javax.swing.JTextField CustName;
    private javax.swing.JTextField CustPh;
    private javax.swing.JTable CustTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JLabel OrderAmt;
    private javax.swing.JLabel OrderNo;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
