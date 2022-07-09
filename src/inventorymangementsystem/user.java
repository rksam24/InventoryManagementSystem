package inventorymangementsystem;

import Database.ConnectionFactory;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class user extends javax.swing.JFrame {

    public user() {
        initComponents();
        SelectUser();
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
        UName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UPassword = new javax.swing.JTextField();
        UEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        UPhone = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inventory Management System");

        jLabel2.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
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
        jLabel4.setText("Uname");

        UName.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        UName.setForeground(new java.awt.Color(153, 153, 153));
        UName.setText("Enter user name");
        UName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UNameFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");

        UPassword.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        UPassword.setForeground(new java.awt.Color(153, 153, 153));
        UPassword.setText("Enter Password");
        UPassword.setToolTipText("");
        UPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UPasswordFocusLost(evt);
            }
        });

        UEmail.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        UEmail.setForeground(new java.awt.Color(153, 153, 153));
        UEmail.setText("Enter Email Id");
        UEmail.setToolTipText("");
        UEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UEmailFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email Id");

        jLabel7.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Phone");

        UPhone.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        UPhone.setForeground(new java.awt.Color(153, 153, 153));
        UPhone.setText("Enter Phone No.");
        UPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UPhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UPhoneFocusLost(evt);
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

        UserTable.setFont(new java.awt.Font("Microsoft Uighur", 1, 18)); // NOI18N
        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Uname", "Password", "Phone", "Email Id"
            }
        ){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        UserTable.setGridColor(new java.awt.Color(204, 204, 204));
        UserTable.setName(""); // NOI18N
        UserTable.setRowHeight(25);
        UserTable.setSelectionBackground(new java.awt.Color(51, 102, 255));
        UserTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        UserTable.getTableHeader().setResizingAllowed(false);
        UserTable.getTableHeader().setReorderingAllowed(false);
        UserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UserTable);

        jLabel9.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("User List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(UName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(UPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(UPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(DeleteBtn)
                                            .addComponent(UEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(UpdateBtn)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(296, 296, 296))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(UName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void Blackcolor(){
        if(!UName.getText().equals("Enter user name") )
             UName.setForeground(new Color(0,0,0));
        if(!UPassword.getText().equals("Enter Password") )
             UPassword.setForeground(new Color(0,0,0)); 
        if(!UPhone.getText().equals("Enter Phone No."))
            UPhone.setForeground(new Color(0,0,0));
        if(!UEmail.getText().equals("Enter Email Id") )
             UEmail.setForeground(new Color(0,0,0));
    }
    
     public void SelectUser(){
        try{
            Con = new ConnectionFactory().getConn();
            St =  Con.createStatement();
            Rs = St.executeQuery("Select * from USERTBL Order by UNAME");
            DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
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
    private void UNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UNameFocusGained
        if(UName.getText().equals("Enter user name")){
            UName.setText("");
            UName.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_UNameFocusGained

    private void UNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UNameFocusLost
        if(UName.getText().equals("")){
            UName.setText("Enter user name");
            UName.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_UNameFocusLost

    private void UPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPasswordFocusGained
        if(UPassword.getText().equals("Enter Password")){
            UPassword.setText("");
            UPassword.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_UPasswordFocusGained

    private void UPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPasswordFocusLost
        if(UPassword.getText().equals("")){
            UPassword.setText("Enter Password");
            UPassword.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_UPasswordFocusLost

    private void UEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UEmailFocusGained
        if(UEmail.getText().equals("Enter Email Id")){
            UEmail.setText("");
            UEmail.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_UEmailFocusGained

    private void UEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UEmailFocusLost
        if(UEmail.getText().equals("")){
            UEmail.setText("Enter Email Id");
            UEmail.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_UEmailFocusLost

    private void UPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPhoneFocusGained
        if(UPhone.getText().equals("Enter Phone No.")){
            UPhone.setText("");
            UPhone.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_UPhoneFocusGained

    private void UPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPhoneFocusLost
        if(UPhone.getText().equals("")){
            UPhone.setText("Enter Phone No.");
            UPhone.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_UPhoneFocusLost

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

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(UName.getText().equals("Enter user name") || UPassword.getText().equals("Enter Password") || UPhone.getText().equals("Enter Phone No.") || UEmail.getText().equals("Enter Email Id")){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                PreparedStatement add = Con.prepareStatement("insert into USERTBL values(?,?,?,?)");
                add.setString(1, UName.getText());
                add.setString(2,UPassword.getText());
                add.setString(3, UPhone.getText());                
                add.setString(4,UEmail.getText());
                add.executeUpdate();
                    JOptionPane.showMessageDialog(this, "User Added Successfully");
                Con.close();
                SelectUser();
            }
            catch(SQLIntegrityConstraintViolationException e){            
                    JOptionPane.showMessageDialog(this, "User Already Exists");
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if(UName.getText().equals("Enter user name") || UPassword.getText().equals("Enter Password") || UPhone.getText().equals("Enter Phone No.") || UEmail.getText().equals("Enter Email Id")){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                String query = "update USERTBL set UPASSWORD = '"+ UPassword.getText() + "' , UPHONE = '"+UPhone.getText() + "' ,UEMAIL = '"+ UEmail.getText()  +"' where UNAME ='"+UName.getText()+"'";
                Statement add = Con.createStatement();
                int row = add.executeUpdate(query);
                Con.close();
                if(row ==0)
                    JOptionPane.showMessageDialog(this, "User not Exists ");
                else
                    JOptionPane.showMessageDialog(this, "User details Updated Successfully");
                SelectUser();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(UName.getText().equals("Enter user name")){
            JOptionPane.showMessageDialog(this, "Enter the Customer to be deleted");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                String name = UName.getText();
                String query = "Delete from USERTBL where UNAME= '"+ name +"'";
                Statement add = Con.createStatement();
                int row = add.executeUpdate(query);
                Con.close();
                if(row ==0)
                    JOptionPane.showMessageDialog(this, "User does not Exists ");
                else
                    JOptionPane.showMessageDialog(this, "User Deleted Successfully");
                SelectUser();

            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void UserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        int MyIndex = UserTable.getSelectedRow();
        UName.setText(model.getValueAt(MyIndex, 0).toString());
        UPassword.setText(model.getValueAt(MyIndex, 1).toString());
        UPhone.setText(model.getValueAt(MyIndex, 2).toString());
        UEmail.setText(model.getValueAt(MyIndex, 3).toString());
        Blackcolor();
    }//GEN-LAST:event_UserTableMouseClicked

    
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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextField UEmail;
    private javax.swing.JTextField UName;
    private javax.swing.JTextField UPassword;
    private javax.swing.JTextField UPhone;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTable UserTable;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
