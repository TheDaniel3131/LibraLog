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
public class DeleteUsers extends javax.swing.JFrame {

    /**
     * Creates new form DeleteUsers
     */
    public DeleteUsers() {
        initComponents();
        this.setSize(680, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
        this.setTitle("Delete Users | LibraLog");
        this.setIconImage(new ImageIcon(getClass().getResource("assets/original/books.jpg")).getImage());
        
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
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtBookID = new javax.swing.JTextField();
        btnDeleteBook = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(71, 74, 79));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Poppins Black", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(190, 199, 224));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LibraLog - Delete Users");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 30, 390, 40);

        jPanel5.setBackground(new java.awt.Color(50, 67, 72));
        jPanel5.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(238, 237, 235));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Staff Username: ");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(120, 30, 190, 30);

        txtBookID.setBackground(new java.awt.Color(100, 108, 116));
        txtBookID.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        txtBookID.setForeground(new java.awt.Color(224, 205, 210));
        txtBookID.setAlignmentX(0.0F);
        txtBookID.setAlignmentY(-0.0F);
        txtBookID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(txtBookID);
        txtBookID.setBounds(100, 70, 220, 33);

        btnDeleteBook.setBackground(new java.awt.Color(81, 114, 149));
        btnDeleteBook.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnDeleteBook.setForeground(new java.awt.Color(170, 215, 230));
        btnDeleteBook.setText("Delete");
        btnDeleteBook.setBorder(null);
        btnDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBookActionPerformed(evt);
            }
        });
        jPanel5.add(btnDeleteBook);
        btnDeleteBook.setBounds(130, 130, 170, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(37, 115, 450, 230);

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(101, 106, 184));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Staff / Admin Can Delete User If Granted With Permission");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-20, 70, 660, 30);

        backBtn.setBackground(new java.awt.Color(60, 54, 51));
        backBtn.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        backBtn.setForeground(new java.awt.Color(170, 204, 230));
        backBtn.setText("Back");
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn);
        backBtn.setBounds(510, 120, 120, 40);

        jLabel16.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 237, 235));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("For more information, contact us at email @: library@LibraLog.com");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(30, 360, 540, 30);

        btnLogout.setBackground(new java.awt.Color(60, 54, 51));
        btnLogout.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(170, 204, 230));
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(510, 180, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBookActionPerformed

    }//GEN-LAST:event_btnDeleteBookActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        StaffMainMenu smm = new StaffMainMenu();
        this.setVisible(false);
        smm.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Home hm = new Home();
        this.setVisible(false);
        hm.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnDeleteBook;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtBookID;
    // End of variables declaration//GEN-END:variables
}
