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
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        this.setSize(770, 450);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
        this.setTitle("Main Menu | LibraLog");
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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtStudentID = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(116, 114, 100));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Poppins Black", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(224, 204, 190));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Library Management System");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 30, 640, 40);

        jPanel5.setBackground(new java.awt.Color(60, 54, 51));
        jPanel5.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 237, 235));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Password:");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(60, 80, 100, 30);

        jLabel15.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(238, 237, 235));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Student ID:");
        jLabel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(jLabel15);
        jLabel15.setBounds(50, 30, 110, 30);

        jLabel16.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 237, 235));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("If any problem, email help@libralog.com");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(-80, 190, 600, 30);

        txtPassword.setBackground(new java.awt.Color(116, 114, 100));
        txtPassword.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(224, 205, 210));
        txtPassword.setAlignmentX(0.0F);
        txtPassword.setAlignmentY(-0.0F);
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(txtPassword);
        txtPassword.setBounds(170, 80, 161, 33);

        txtStudentID.setBackground(new java.awt.Color(116, 114, 100));
        txtStudentID.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        txtStudentID.setForeground(new java.awt.Color(224, 205, 210));
        txtStudentID.setAlignmentX(0.0F);
        txtStudentID.setAlignmentY(0.0F);
        txtStudentID.setAutoscrolls(false);
        txtStudentID.setBorder(null);
        jPanel5.add(txtStudentID);
        txtStudentID.setBounds(170, 30, 161, 33);

        submitBtn.setBackground(new java.awt.Color(149, 119, 81));
        submitBtn.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(230, 208, 170));
        submitBtn.setText("Submit");
        submitBtn.setBorder(null);
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel5.add(submitBtn);
        submitBtn.setBounds(130, 140, 170, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(37, 135, 460, 250);

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(224, 205, 210));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("*Only Student Accounts*");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-120, 70, 600, 30);

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

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String studentID = txtStudentID.getText();
        String password = txtPassword.getText();
        registerNewStudent(studentID, password);

        try {
            Statement s = db.mycon().createStatement();
            s.executeUpdate("INSERT INTO users (student_id, password) VALUES ('"+studentID+"', '"+password+"')");
            JOptionPane.showMessageDialog(rootPane, "Your Account Has Been Created.");
            this.setVisible(false);
            new MainMenu().setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_submitBtnActionPerformed

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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
