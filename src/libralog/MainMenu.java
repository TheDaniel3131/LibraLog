/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libralog;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Daniel
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    public MainMenu() {
        initComponents();
        this.setSize(850, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
        this.setTitle("Main Menu | LibraLog");
        this.setIconImage(new ImageIcon(getClass().getResource("assets/original/books.jpg")).getImage());
    
        // View Books Table
        tbViewBooks.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 16));
        tbViewBooks.getTableHeader().setBackground(new Color(36,56,62));
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Book ID");
        tableModel.addColumn("Title");
        tableModel.addColumn("Author");
        tableModel.addColumn("Quantity");
        tbViewBooks.setModel(tableModel);
     
        // Set connection 
        
        con = db.mycon();
        
        // Retrieve Books Information from Books
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/libralog", "root", "")) {
            String sql = "SELECT * FROM books";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Iterate through the result set and add rows to the DefaultTableModel
                    tableModel.setRowCount(0); // Clear existing rows

                    while (resultSet.next()) {
                        // Add each row of book information to the DefaultTableModel
                        Object[] row = {
                            resultSet.getInt("book_id"),
                            resultSet.getString("title"),
                            resultSet.getString("author"),
                            resultSet.getInt("copies_available")
                        };
                        tableModel.addRow(row);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to view books.");
        }
        con = db.mycon();
    
    }

    // Created Constructor. Allowing to pass Student ID from login to Main Menu here.
    MainMenu(String studentID) {
        this();
        showStudentID.setText(studentID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbViewBooks = new javax.swing.JTable();
        btnCheckHistory = new javax.swing.JButton();
        btnSearchNow = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtSearchBook = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnReturnBook = new javax.swing.JButton();
        btnBorrowBook = new javax.swing.JButton();
        showStudentID = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(116, 114, 100));
        jPanel1.setForeground(new java.awt.Color(224, 205, 210));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 600));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Poppins Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(224, 204, 190));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LibraLog");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 40, 190, 40);

        jLabel16.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 237, 235));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("If any problem, email help@libralog.com");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 600, 380, 30);

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(224, 226, 152));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome,");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 20, 190, 30);

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(224, 205, 210));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Come & Check Our LibraLog Books. Everyone Can Read.");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 100, 600, 30);

        backBtn.setBackground(new java.awt.Color(60, 54, 51));
        backBtn.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        backBtn.setForeground(new java.awt.Color(224, 205, 210));
        backBtn.setText("Logout");
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn);
        backBtn.setBounds(630, 30, 120, 40);

        tbViewBooks.setBackground(new java.awt.Color(60, 54, 51));
        tbViewBooks.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbViewBooks.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        tbViewBooks.setForeground(new java.awt.Color(224, 205, 210));
        tbViewBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Title", "Author Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbViewBooks);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 150, 720, 270);

        btnCheckHistory.setBackground(new java.awt.Color(149, 119, 81));
        btnCheckHistory.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnCheckHistory.setForeground(new java.awt.Color(230, 208, 170));
        btnCheckHistory.setText("Check My Book History");
        btnCheckHistory.setBorder(null);
        btnCheckHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckHistoryActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheckHistory);
        btnCheckHistory.setBounds(50, 520, 370, 40);

        btnSearchNow.setBackground(new java.awt.Color(149, 119, 81));
        btnSearchNow.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnSearchNow.setForeground(new java.awt.Color(230, 208, 170));
        btnSearchNow.setText("Search Now");
        btnSearchNow.setBorder(null);
        btnSearchNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNowActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchNow);
        btnSearchNow.setBounds(470, 530, 170, 40);

        jLabel15.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(230, 208, 170));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Search Book Name");
        jLabel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(530, 440, 200, 30);

        txtSearchBook.setBackground(new java.awt.Color(60, 54, 51));
        txtSearchBook.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        txtSearchBook.setForeground(new java.awt.Color(224, 205, 210));
        txtSearchBook.setAlignmentX(0.0F);
        txtSearchBook.setAlignmentY(0.0F);
        txtSearchBook.setAutoscrolls(false);
        txtSearchBook.setBorder(null);
        jPanel1.add(txtSearchBook);
        txtSearchBook.setBounds(580, 480, 220, 33);

        jLabel17.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(238, 237, 235));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Book Title:");
        jLabel17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel17);
        jLabel17.setBounds(460, 480, 110, 30);

        btnReturnBook.setBackground(new java.awt.Color(149, 119, 81));
        btnReturnBook.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnReturnBook.setForeground(new java.awt.Color(230, 208, 170));
        btnReturnBook.setText("Return Book");
        btnReturnBook.setBorder(null);
        btnReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturnBook);
        btnReturnBook.setBounds(250, 460, 170, 40);

        btnBorrowBook.setBackground(new java.awt.Color(149, 119, 81));
        btnBorrowBook.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnBorrowBook.setForeground(new java.awt.Color(230, 208, 170));
        btnBorrowBook.setText("Borrow Book");
        btnBorrowBook.setBorder(null);
        btnBorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrowBook);
        btnBorrowBook.setBounds(50, 460, 170, 40);

        showStudentID.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        showStudentID.setForeground(new java.awt.Color(224, 226, 152));
        showStudentID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(showStudentID);
        showStudentID.setBounds(410, 20, 190, 30);

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(224, 205, 210));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Welcome to LibraLog Library!");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 70, 640, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        StaffLogin sl = new StaffLogin();
        this.setVisible(false);
        sl.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnCheckHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckHistoryActionPerformed
        String studentID = showStudentID.getText();
        
        // Passing Student ID value to Main Menu.
        this.setVisible(false);
        MyBookHistory mbh = new MyBookHistory(studentID);
        mbh.setVisible(true);
        // new MainMenu(studentID).setVisible(true);    
    }//GEN-LAST:event_btnCheckHistoryActionPerformed

    private void btnSearchNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNowActionPerformed
        String filter = txtSearchBook.getText();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>((DefaultTableModel) tbViewBooks.getModel());
        tbViewBooks.setRowSorter(trs);

        if (filter.trim().length() == 0) {
            trs.setRowFilter(null);
        } else {
            trs.setRowFilter(RowFilter.regexFilter("(?i)" + filter));
        }
    }//GEN-LAST:event_btnSearchNowActionPerformed

    private void btnReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBookActionPerformed
           
        // Get the selected row index
        int selectedRowIndex = tbViewBooks.getSelectedRow();

        // Check if a row is actually selected
        if (selectedRowIndex != -1) {
            // Assuming 'tbViewBooks' is your JTable and column 0 is the book ID
            int bookID = (int) tbViewBooks.getValueAt(selectedRowIndex, 0);
            String title = (String) tbViewBooks.getValueAt(selectedRowIndex, 1);
            String author = (String) tbViewBooks.getValueAt(selectedRowIndex, 2);

            try {
                Statement s = db.mycon().createStatement();
                s.executeUpdate("UPDATE books SET copies_available = copies_available + 1 WHERE book_id = " + bookID);
                s.executeUpdate("INSERT INTO pasthistory (studentID, bookID, title, author, status) VALUES ('" + showStudentID.getText() + "', " + bookID + ", '" + title + "', '" + author + "', 'return')");
                JOptionPane.showMessageDialog(rootPane, "The book has been returned.", "Success!", JOptionPane.INFORMATION_MESSAGE);

                // Refresh JFrame
                this.setVisible(false);
                this.dispose();
                MainMenu mm = new MainMenu(showStudentID.getText());
                mm.setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "An error occurred while trying to return the book.");
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please select a book to return.");
        }
    }//GEN-LAST:event_btnReturnBookActionPerformed

    private void btnBorrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowBookActionPerformed
        // Get the selected row index
        int selectedRowIndex = tbViewBooks.getSelectedRow();

        // Check if a row is actually selected
        if (selectedRowIndex != -1) {
            // Assuming 'tbViewBooks' is your JTable and column 0 is the book ID
            int bookID = (int) tbViewBooks.getValueAt(selectedRowIndex, 0);
            String title = (String) tbViewBooks.getValueAt(selectedRowIndex, 1);
            String author = (String) tbViewBooks.getValueAt(selectedRowIndex, 2);
           
            try {
                Statement s = db.mycon().createStatement();
                s.executeUpdate("UPDATE books SET copies_available = copies_available - 1 WHERE book_id = " + bookID);
                s.executeUpdate("INSERT INTO pasthistory (studentID, bookID, title, author, status) VALUES ('" + showStudentID.getText() + "', " + bookID + ", '" + title + "', '" + author + "', 'borrow')");
                int confirm = JOptionPane.showConfirmDialog(rootPane, "The book has been borrowed. Continue?", "Borrowing Book Confirmation", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(rootPane, "The book has been borrowed.", "Success!", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Borrowed!");
                } else {
                    return;
                }

                // SwingUtilities.updateComponentTreeUI(this);
                // this.invalidate();
                // this.validate();
                // this.repaint();
                
                // Refresh JFrame
                this.setVisible(false);
                this.dispose();
                MainMenu mm = new MainMenu(showStudentID.getText());
                mm.setVisible(true);
                
                
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "An error occurred while trying to borrow the book.");
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please select a book to borrow.");
        }
    }//GEN-LAST:event_btnBorrowBookActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnBorrowBook;
    private javax.swing.JButton btnCheckHistory;
    private javax.swing.JButton btnReturnBook;
    private javax.swing.JButton btnSearchNow;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel showStudentID;
    private javax.swing.JTable tbViewBooks;
    private javax.swing.JTextField txtSearchBook;
    // End of variables declaration//GEN-END:variables
}
