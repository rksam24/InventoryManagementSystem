package inventorymangementsystem;


import Database.ConnectionFactory;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class order extends javax.swing.JFrame {

    public order() {
        initComponents();
        SelectProd();
        SelectCustomer();
        GetToday();
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
        OrderId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Qty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        AddOrder = new javax.swing.JButton();
        ViewOrder = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        AddToOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        CustName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ProdTable = new javax.swing.JTable();
        PrintBill = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        CustId = new javax.swing.JTextField();
        GrandTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();

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
        jLabel2.setText("Manage Order");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(jLabel2)
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
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
        jLabel4.setText("OrderId");

        OrderId.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        OrderId.setForeground(new java.awt.Color(153, 153, 153));
        OrderId.setText("Enter Order id");
        OrderId.setToolTipText("");
        OrderId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                OrderIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                OrderIdFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quantity");

        Qty.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        Qty.setForeground(new java.awt.Color(153, 153, 153));
        Qty.setText("Enter Quantity");
        Qty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                QtyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                QtyFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Date");

        AddOrder.setBackground(new java.awt.Color(204, 204, 255));
        AddOrder.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        AddOrder.setText("Add Order");
        AddOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddOrderMouseExited(evt);
            }
        });

        ViewOrder.setBackground(new java.awt.Color(204, 204, 255));
        ViewOrder.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        ViewOrder.setText("View Order");
        ViewOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ViewOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ViewOrderMouseExited(evt);
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

        BillTable.setFont(new java.awt.Font("Microsoft Uighur", 1, 18)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "ProductName", "Quantity", "Price", "Total Price"
            }
        ){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        BillTable.setGridColor(new java.awt.Color(204, 204, 204));
        BillTable.setName(""); // NOI18N
        BillTable.setRowHeight(30);
        BillTable.setSelectionBackground(new java.awt.Color(51, 102, 255));
        BillTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        BillTable.setShowGrid(true);
        BillTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(BillTable);

        jLabel9.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Customer List");

        AddToOrder.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        AddToOrder.setText("Add To Order");
        AddToOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToOrderMouseExited(evt);
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
        jScrollPane2.setViewportView(CustTable);

        jLabel10.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Product List");

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

        jLabel11.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Customer Name");

        ProdTable.setFont(new java.awt.Font("Microsoft Uighur", 1, 18)); // NOI18N
        ProdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "Name", "Quantity", "Description", "Price" ,"Category"
            }
        ){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        ProdTable.setFocusable(false);
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
        jScrollPane3.setViewportView(ProdTable);

        PrintBill.setBackground(new java.awt.Color(204, 204, 255));
        PrintBill.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        PrintBill.setText("Print");
        PrintBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBillMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Customer Id");

        CustId.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        CustId.setForeground(new java.awt.Color(153, 153, 153));
        CustId.setText("Enter Customer Id");
        CustId.setToolTipText("");
        CustId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CustIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CustIdFocusLost(evt);
            }
        });

        GrandTotal.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        GrandTotal.setText("0.0");

        jLabel5.setFont(new java.awt.Font("Microsoft Uighur", 0, 28)); // NOI18N
        jLabel5.setText("Rs.");

        Date.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(242, 242, 242))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(AddOrder)))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OrderId, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(CustName, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(CustId, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(ViewOrder))
                                    .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddToOrder)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(GrandTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addGap(18, 26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Blackcolor(){
        if(!OrderId.getText().equals("Enter Order id") )
             OrderId.setForeground(new Color(0,0,0));
        if(!CustName.getText().equals("Enter Customer Name") )
             CustName.setForeground(new Color(0,0,0));
        if(!Qty.getText().equals("Enter Quantity") )
             Qty.setForeground(new Color(0,0,0));
        if(!CustId.getText().equals("Enter Customer Id"))
             CustId.setForeground(new Color(0,0,0));
    }
    
    public void GetToday(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
        LocalDateTime now = LocalDateTime.now();  
        Date.setText(dtf.format(now));
    }
    
    private void update(){
        try{
                Con = new ConnectionFactory().getConn();
                String query = "update PRODUCTTABLE set PRODQTY = PRODUCTTABLE.PRODQTY - "+ Qty.getText() +" where PRODID ="+prodId;
                Statement add = Con.createStatement();
                add.executeUpdate(query);
                Con.close();
                SelectProd();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            
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
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void OrderIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OrderIdFocusGained
        if(OrderId.getText().equals("Enter Order id")){
            OrderId.setText("");
            OrderId.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_OrderIdFocusGained

    private void OrderIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OrderIdFocusLost
        if(OrderId.getText().equals("")){
            OrderId.setText("Enter Order id");
            OrderId.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_OrderIdFocusLost

    private void QtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_QtyFocusGained
        if(Qty.getText().equals("Enter Quantity")){
            Qty.setText("");
            Qty.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_QtyFocusGained

    private void QtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_QtyFocusLost
        if(Qty.getText().equals("")){
            Qty.setText("Enter Quantity");
            Qty.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_QtyFocusLost

    private void AddOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOrderMouseClicked
        if(OrderId.getText().equals("Enter Order id") || CustName.getText().equals("Enter Customer Name") || CustId.getText().equals("Enter Customer Id") ){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();                
                
                DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
                int N = model.getRowCount();                
                String bill = "";
                int j =0;
                System.out.print("start");
                while(j<N){
                    String num = model.getValueAt(j, 0).toString();
                    String pName = model.getValueAt(j, 1).toString();
                    String qty = model.getValueAt(j, 2).toString();
                    String price = model.getValueAt(j,3).toString();
                    String tot = model.getValueAt(j, 4).toString();

                    bill += num+","+pName+","+qty+","+price+","+tot +" : ";
                    j++;
                }
                System.out.println(bill);
                
                
                
                PreparedStatement add = Con.prepareStatement("insert into ORDERTBL values(?,?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(OrderId.getText()));
                add.setInt(2, Integer.valueOf(CustId.getText()));
                add.setString(3,CustName.getText());
                add.setString(4,Date.getText());
                add.setDouble(5,Double.valueOf(GrandTotal.getText()));
                add.setString(6,bill);                
                add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Order Added Successfully");
                
                
            
                Con.close();               
            }
            catch(SQLIntegrityConstraintViolationException e){
                JOptionPane.showMessageDialog(this, "Order Id  Already Exists");
            }
            catch(SQLException e){
                e.printStackTrace();
            }    
        }
    }//GEN-LAST:event_AddOrderMouseClicked

    private void AddOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOrderMouseEntered
        AddOrder.setBackground(new Color(102,102,255));
        AddOrder.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_AddOrderMouseEntered

    private void AddOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOrderMouseExited
        AddOrder.setBackground(new Color(204,204,255));
        AddOrder.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_AddOrderMouseExited

    private void ViewOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderMouseClicked
        if(OrderId.getText().equals("Enter Order id") ){
            JOptionPane.showMessageDialog(this, "Enter Order Id");
        }
        else{
            try{
                Con = new ConnectionFactory().getConn();
                String query = "select * from ORDERTBL  where ORDERID = " + OrderId.getText() ;
                St = Con.createStatement();
                Rs = St.executeQuery(query);
                
                if(!Rs.next())
                    JOptionPane.showMessageDialog(this, "Enter Correct Order Id");
                else{
                    DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
                    model.setRowCount(0);
                    String bill = Rs.getString("BILL");
                    CustId.setText(Rs.getString("CUSTID"));
                    CustName.setText(Rs.getString("CUSTNAME"));                    
                    Date.setText(Rs.getString("DATE"));
                    String[] AllOrder = bill.split(" : ");
                    for(int j=0;j<AllOrder.length;j++){
                        String[] item = AllOrder[j].split(",");
                        model.addRow(item);
                    }
                }
                Con.close();
                St.close();
                Rs.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            Blackcolor();
        }
    }//GEN-LAST:event_ViewOrderMouseClicked

    private void ViewOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderMouseEntered
        ViewOrder.setBackground(new Color(102,102,255));
        ViewOrder.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ViewOrderMouseEntered

    private void ViewOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderMouseExited
        ViewOrder.setBackground(new Color(204,204,255));
        ViewOrder.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_ViewOrderMouseExited

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void HomeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseEntered
        HomeBtn.setBackground(new Color(102,102,255));
        HomeBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_HomeBtnMouseEntered

    private void HomeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseExited
        HomeBtn.setBackground(new Color(204,204,255));
        HomeBtn.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_HomeBtnMouseExited

    int i=1;
    Double prodPrice,total,grandTotal=0.0;
    String prodName;
    private void AddToOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToOrderMouseClicked
       if(flag==0 || Qty.getText().equals("Enter Quantity") ){
            JOptionPane.showMessageDialog(this, "Select Product and Enter Quantity");
       }
       else if(Integer.valueOf( Qty.getText())>prodQty ){
           JOptionPane.showMessageDialog(this, "Quantity Exceeds Available Quantity ");
       }
       else if(Integer.valueOf( Qty.getText())==0){
           JOptionPane.showMessageDialog(this, "Enter Quantity 1 or more");
       }
       else{
           total = prodPrice * Integer.valueOf(Qty.getText());
           String[] row = {""+i,prodName,Qty.getText(),""+prodPrice, ""+total };
           DefaultTableModel dt = (DefaultTableModel)BillTable.getModel();
           dt.addRow(row);
           i++;
           grandTotal += total;
           GrandTotal.setText(""+grandTotal);
           prodPrice -= Integer.valueOf( Qty.getText());
           flag=0;
           update();
       }
    }//GEN-LAST:event_AddToOrderMouseClicked

    private void AddToOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToOrderMouseEntered
        AddToOrder.setBackground(new Color(102,102,255));
        AddToOrder.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_AddToOrderMouseEntered

    private void AddToOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToOrderMouseExited
        AddToOrder.setBackground(new Color(204,204,255));
        AddToOrder.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_AddToOrderMouseExited

    private void CustTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CustTable.getModel();
        int MyIndex = CustTable.getSelectedRow();
        CustId.setText(model.getValueAt(MyIndex, 0).toString());
        CustName.setText(model.getValueAt(MyIndex, 1).toString());
        Blackcolor();
    }//GEN-LAST:event_CustTableMouseClicked

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

    int flag = 0,prodId,prodQty;
    private void ProdTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProdTable.getModel();
        int MyIndex = ProdTable.getSelectedRow();
        prodId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        prodQty = Integer.valueOf(model.getValueAt(MyIndex, 2).toString());
        prodName  = model.getValueAt(MyIndex, 1).toString();
        prodPrice  = Double.valueOf(model.getValueAt(MyIndex, 4).toString());
        flag = 1;
    }//GEN-LAST:event_ProdTableMouseClicked

    private void PrintBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBillMouseClicked
        try{
            BillTable.print();
        }
        catch(Exception exp){
            exp.printStackTrace();
        }
    }//GEN-LAST:event_PrintBillMouseClicked

    private void CustIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CustIdFocusGained
        if(CustId.getText().equals("Enter Customer Id")){
            CustId.setText("");
            CustId.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CustIdFocusGained

    private void CustIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CustIdFocusLost
        if(CustId.getText().equals("")){
            CustId.setText("Enter Customer Id");
            CustId.setForeground(new Color(153,153,153));
        }
        Blackcolor();
    }//GEN-LAST:event_CustIdFocusLost

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
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrder;
    private javax.swing.JButton AddToOrder;
    private javax.swing.JTable BillTable;
    private javax.swing.JTextField CustId;
    private javax.swing.JTextField CustName;
    private javax.swing.JTable CustTable;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel GrandTotal;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextField OrderId;
    private javax.swing.JButton PrintBill;
    private javax.swing.JTable ProdTable;
    private javax.swing.JTextField Qty;
    private javax.swing.JButton ViewOrder;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
