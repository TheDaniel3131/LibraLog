/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libralog;

import javax.swing.ImageIcon;

/**
 *
 * @author Daniel
 */
public class StaffMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public StaffMainMenu() {
        initComponents();
        this.setSize(850, 650);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
        this.setTitle("Staff/Admin Main Menu | LibraLog");
        this.setIconImage(new ImageIcon(getClass().getResource("assets/original/books.jpg")).getImage());
    }

    // Created Constructor. Allowing to pass Student ID from login to Main Menu here.
    StaffMainMenu(String staffUsername) {
        this();
        lblwelcomeStaff.setText("Welcome Back, " +staffUsername +".");
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
        lblwelcomeStaff = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnEditBooks = new javax.swing.JButton();
        btnAddBooks = new javax.swing.JButton();
        btnDeleteBooks2 = new javax.swing.JButton();
        btnViewBooks = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAddUsers = new javax.swing.JButton();
        btnDeleteUsers = new javax.swing.JButton();
        btnViewUsers = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(71, 74, 79));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 650));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Poppins Black", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(190, 199, 224));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LibraLog - Library Management System");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 30, 650, 40);

        lblwelcomeStaff.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblwelcomeStaff.setForeground(new java.awt.Color(101, 106, 184));
        lblwelcomeStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblwelcomeStaff);
        lblwelcomeStaff.setBounds(200, 70, 320, 30);

        jPanel5.setBackground(new java.awt.Color(50, 67, 72));
        jPanel5.setLayout(null);

        jTabbedPane2.setBackground(new java.awt.Color(71, 99, 129));
        jTabbedPane2.setForeground(new java.awt.Color(170, 215, 230));
        jTabbedPane2.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(36, 56, 62));
        jPanel3.setLayout(null);

        btnEditBooks.setBackground(new java.awt.Color(81, 114, 149));
        btnEditBooks.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnEditBooks.setForeground(new java.awt.Color(170, 215, 230));
        btnEditBooks.setText("Edit Books");
        btnEditBooks.setBorder(null);
        btnEditBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditBooksActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditBooks);
        btnEditBooks.setBounds(50, 280, 210, 40);

        btnAddBooks.setBackground(new java.awt.Color(81, 114, 149));
        btnAddBooks.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnAddBooks.setForeground(new java.awt.Color(170, 215, 230));
        btnAddBooks.setText("Add Books");
        btnAddBooks.setBorder(null);
        btnAddBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBooksActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddBooks);
        btnAddBooks.setBounds(50, 160, 210, 40);

        btnDeleteBooks2.setBackground(new java.awt.Color(81, 114, 149));
        btnDeleteBooks2.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnDeleteBooks2.setForeground(new java.awt.Color(170, 215, 230));
        btnDeleteBooks2.setText("Delete Books");
        btnDeleteBooks2.setBorder(null);
        btnDeleteBooks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBooks2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnDeleteBooks2);
        btnDeleteBooks2.setBounds(50, 220, 210, 40);

        btnViewBooks.setBackground(new java.awt.Color(81, 114, 149));
        btnViewBooks.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnViewBooks.setForeground(new java.awt.Color(170, 215, 230));
        btnViewBooks.setText("View Books");
        btnViewBooks.setBorder(null);
        btnViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBooksActionPerformed(evt);
            }
        });
        jPanel3.add(btnViewBooks);
        btnViewBooks.setBounds(50, 100, 210, 40);

        jLabel16.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 237, 235));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Manage & Handle All Types of Books using LibraLog's CRUD operations");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(10, 40, 700, 30);

        jLabel2.setFont(new java.awt.Font("Poppins Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(224, 204, 190));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Documents\\NetBeansProjects\\LibraLog\\src\\libralog\\assets\\home_book.png")); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setDoubleBuffered(true);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(290, 100, 390, 220);

        jTabbedPane2.addTab("Books Management", jPanel3);

        jPanel4.setBackground(new java.awt.Color(36, 56, 62));
        jPanel4.setLayout(null);

        btnAddUsers.setBackground(new java.awt.Color(81, 114, 149));
        btnAddUsers.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnAddUsers.setForeground(new java.awt.Color(170, 215, 230));
        btnAddUsers.setText("Add Users");
        btnAddUsers.setBorder(null);
        btnAddUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUsersActionPerformed(evt);
            }
        });
        jPanel4.add(btnAddUsers);
        btnAddUsers.setBounds(40, 180, 210, 40);

        btnDeleteUsers.setBackground(new java.awt.Color(81, 114, 149));
        btnDeleteUsers.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnDeleteUsers.setForeground(new java.awt.Color(170, 215, 230));
        btnDeleteUsers.setText("Delete Users");
        btnDeleteUsers.setBorder(null);
        btnDeleteUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUsersActionPerformed(evt);
            }
        });
        jPanel4.add(btnDeleteUsers);
        btnDeleteUsers.setBounds(40, 240, 210, 40);

        btnViewUsers.setBackground(new java.awt.Color(81, 114, 149));
        btnViewUsers.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnViewUsers.setForeground(new java.awt.Color(170, 215, 230));
        btnViewUsers.setText("View Users");
        btnViewUsers.setBorder(null);
        btnViewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUsersActionPerformed(evt);
            }
        });
        jPanel4.add(btnViewUsers);
        btnViewUsers.setBounds(40, 120, 210, 40);

        jLabel18.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(238, 237, 235));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Manage All Types of Users In LibraLog with CRUD operations");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(10, 40, 700, 30);

        jLabel4.setFont(new java.awt.Font("Poppins Black", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(224, 204, 190));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Documents\\NetBeansProjects\\LibraLog\\src\\libralog\\assets\\home_book.png")); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.setDoubleBuffered(true);
        jPanel4.add(jLabel4);
        jLabel4.setBounds(290, 100, 390, 220);

        jTabbedPane2.addTab("Users Management", jPanel4);

        jPanel5.add(jTabbedPane2);
        jTabbedPane2.setBounds(10, 10, 720, 400);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(37, 145, 740, 420);

        backBtn.setBackground(new java.awt.Color(60, 54, 51));
        backBtn.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        backBtn.setForeground(new java.awt.Color(170, 204, 230));
        backBtn.setText("Logout");
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn);
        backBtn.setBounds(40, 30, 120, 40);

        jLabel17.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(238, 237, 235));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Here are the staff/admin functionalities to use:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(-80, 100, 600, 30);

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

    private void btnViewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUsersActionPerformed
        ViewUsers vu = new ViewUsers();
        this.setVisible(false);
        vu.setVisible(true);
    }//GEN-LAST:event_btnViewUsersActionPerformed

    private void btnDeleteUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUsersActionPerformed
        DeleteUsers du = new DeleteUsers();
        this.setVisible(false);
        du.setVisible(true);
    }//GEN-LAST:event_btnDeleteUsersActionPerformed

    private void btnAddUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUsersActionPerformed
        AddUsers au = new AddUsers();
        this.setVisible(false);
        au.setVisible(true);
    }//GEN-LAST:event_btnAddUsersActionPerformed

    private void btnViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBooksActionPerformed
        ViewBooks vb = new ViewBooks();
        this.setVisible(false);
        vb.setVisible(true);
    }//GEN-LAST:event_btnViewBooksActionPerformed

    private void btnDeleteBooks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBooks2ActionPerformed
        DeleteBooks db = new DeleteBooks();
        this.setVisible(false);
        db.setVisible(true);
    }//GEN-LAST:event_btnDeleteBooks2ActionPerformed

    private void btnAddBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBooksActionPerformed
        AddBooks ab = new AddBooks();
        this.setVisible(false);
        ab.setVisible(true);
    }//GEN-LAST:event_btnAddBooksActionPerformed

    private void btnEditBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditBooksActionPerformed
        EditBooks eb = new EditBooks();
        this.setVisible(false);
        eb.setVisible(true);
    }//GEN-LAST:event_btnEditBooksActionPerformed

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
            java.util.logging.Logger.getLogger(StaffMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnAddBooks;
    private javax.swing.JButton btnAddUsers;
    private javax.swing.JButton btnDeleteBooks2;
    private javax.swing.JButton btnDeleteUsers;
    private javax.swing.JButton btnEditBooks;
    private javax.swing.JButton btnViewBooks;
    private javax.swing.JButton btnViewUsers;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblwelcomeStaff;
    // End of variables declaration//GEN-END:variables
}
