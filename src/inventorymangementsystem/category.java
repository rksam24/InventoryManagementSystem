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


public class category extends javax.swing.JFrame {

    
    public category() {
        initComponents();
        SelectCategory();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    @SuppressWarnings("unchecked")
    
    public void Blackcolor(){
        if(!CatId.getText().equals("Enter Category Id") )
             CatId.setForeground(new Color(0,0,0));
        if(!CatName.getText().equals("Enter Category Name") )
             CatName.setForeground(new Color(0,0,0));
    }
    
     public void SelectCategory(){
        try{
            Con = new ConnectionFactory().getConn();
            St =  Con.createStatement();
            Rs = St.executeQuery("Select * from CATEGORYTBL Order by CATID");
            DefaultTableModel model = (DefaultTableModel) CatTable.getModel();
            model.setRowCount(0);
            while(Rs.next()){
               String[] row = {Rs.getString(1),Rs.getString(2)};
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CatId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CatName = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CatTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

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
        jLabel2.setText("Categories");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(207, 207, 207)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jLabel4.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CatID");

        CatId.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        CatId.setForeground(new java.awt.Color(153, 153, 153));
        CatId.setText("Enter Category Id");
        CatId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CatIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CatIdFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CatName");

        CatName.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        CatName.setForeground(new java.awt.Color(153, 153, 153));
        CatName.setText("Enter Category Name");
        CatName.setToolTipText("");
        CatName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CatNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CatNameFocusLost(evt);
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

        CatTable.setFont(new java.awt.Font("Microsoft Uighur", 1, 18)); // NOI18N
        CatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CatId", "Catname"
            }
        ){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    CatTable.setFocusable(false);
    CatTable.setGridColor(new java.awt.Color(204, 204, 204));
    CatTable.setName(""); // NOI18N
    CatTable.setRowHeight(30);
    CatTable.setSelectionBackground(new java.awt.Color(51, 102, 255));
    CatTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
    CatTable.setShowGrid(true);
    CatTable.getTableHeader().setResizingAllowed(false);
    CatTable.getTableHeader().setReorderingAllowed(false);
    CatTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            CatTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(CatTable);

    jLabel9.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel9.setText("Categories List");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteBtn))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CatId, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CatName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 30, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(UpdateBtn)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(132, 132, 132)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(184, 184, 184)
                    .addComponent(jLabel9)
                    .addGap(233, 233, 233))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29))))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CatId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CatName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(54, 54, 54)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(71, Short.MAX_VALUE))
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

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CatIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CatIdFocusGained
        if(CatId.getText().equals("Enter Category Id")){
            CatId.setText("");
            CatId.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CatIdFocusGained

    private void CatIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CatIdFocusLost
        if(CatId.getText().equals("")){
            CatId.setText("Enter Category Id");
            CatId.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CatIdFocusLost

    private void CatNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CatNameFocusGained
        if(CatName.getText().equals("Enter Category Name")){
            CatName.setText("");
            CatName.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CatNameFocusGained

    private void CatNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CatNameFocusLost
        if(CatName.getText().equals("")){
            CatName.setText("Enter Category Name");
            CatName.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CatNameFocusLost

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
       if(CatId.getText().equals("Enter Category Id") || CatName.getText().equals("Enter Category Name")){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                PreparedStatement add = Con.prepareStatement("insert into CATEGORYTBL values(?,?)");
                add.setInt(1, Integer.valueOf(CatId.getText()));
                add.setString(2,CatName.getText());
                add.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Category Added Successfully");
                Con.close();
                SelectCategory();
            }
            catch(SQLIntegrityConstraintViolationException e){            
                    JOptionPane.showMessageDialog(this, "Category Already Exists");
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if(CatId.getText().equals("Enter Category Id") || CatName.getText().equals("Enter Category Name")){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                String query = "update CATEGORYTBL set CATNAME = '"+ CatName.getText() +"' where CATID ="+Integer.valueOf(CatId.getText());
                Statement add = Con.createStatement();
                int row = add.executeUpdate(query);
                Con.close();
                if(row ==0)
                    JOptionPane.showMessageDialog(this, "Category not Exists ");
                else
                    JOptionPane.showMessageDialog(this, "Category Updated Successfully");
                SelectCategory();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(CatId.getText().equals("Enter Category Id")){
            JOptionPane.showMessageDialog(this, "Enter the Category to be deleted");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                String id = CatId.getText();
                String query = "Delete from CATEGORYTBL where CATID="+id;
                Statement add = Con.createStatement();
                int row = add.executeUpdate(query);
                Con.close();
                if(row ==0)
                    JOptionPane.showMessageDialog(this, "Category does not Exists ");
                else
                    JOptionPane.showMessageDialog(this, "Category Deleted Successfully");
                SelectCategory();

            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void CatTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CatTable.getModel();
        int MyIndex = CatTable.getSelectedRow();
        CatId.setText(model.getValueAt(MyIndex, 0).toString());
        CatName.setText(model.getValueAt(MyIndex, 1).toString());
        Blackcolor();
    }//GEN-LAST:event_CatTableMouseClicked
                                                                   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField CatId;
    private javax.swing.JTextField CatName;
    private javax.swing.JTable CatTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
