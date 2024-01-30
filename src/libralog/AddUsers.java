/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libralog;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class AddUsers extends javax.swing.JFrame {

    /**
     * Creates new form AddUsers
     */
    public AddUsers() {
        initComponents();
        this.setSize(770, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
        this.setTitle("Add Users | LibraLog");
        this.setIconImage(new ImageIcon(getClass().getResource("assets/original/books.jpg")).getImage());
    }

    private boolean registerNewStaff(String staffUsername, String password){
        // Check if the provided staff username and password are valid
        if (staffUsername.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both staff username and password.", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
s
        // Check the length of the staff username and password
        if (staffUsername.length() < 5 || password.length() < 8) {
            JOptionPane.showMessageDialog(this, "Staff username and the password must be at least 8 characters long with at least one number, one lowercase letter, and one uppercase letter.", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Check if the staff really exists in the database
       try {
           Statement s = db.mycon().createStatement();
           ResultSet rs = s.executeQuery("SELECT * FROM staffs WHERE username = '" + staffUsername + "'");
           if (rs.next()) {
               JOptionPane.showMessageDialog(this, "This staff username is already registered.", "Adding Staff Registration Error", JOptionPane.ERROR_MESSAGE);
               return false;
           }
       } catch (Exception e) {
           System.err.println("Got an exception!");
           System.err.println(e.getMessage());
       }
        return true;
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtAU_u = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnAddNow = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtAU_p = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        backBtn1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnLogout1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(71, 74, 79));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Poppins Black", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(190, 199, 224));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LibraLog - Add Users");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 30, 370, 40);

        jPanel6.setBackground(new java.awt.Color(50, 67, 72));
        jPanel6.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 237, 235));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Password:");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(30, 110, 100, 30);

        txtAU_u.setBackground(new java.awt.Color(100, 108, 116));
        txtAU_u.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        txtAU_u.setForeground(new java.awt.Color(224, 205, 210));
        txtAU_u.setAlignmentX(0.0F);
        txtAU_u.setAlignmentY(-0.0F);
        txtAU_u.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(txtAU_u);
        txtAU_u.setBounds(140, 60, 210, 33);

        jLabel19.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(238, 237, 235));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Username:");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(-80, 60, 320, 30);

        btnAddNow.setBackground(new java.awt.Color(81, 114, 149));
        btnAddNow.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnAddNow.setForeground(new java.awt.Color(170, 215, 230));
        btnAddNow.setText("Add Now");
        btnAddNow.setBorder(null);
        btnAddNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNowActionPerformed(evt);
            }
        });
        jPanel6.add(btnAddNow);
        btnAddNow.setBounds(40, 190, 230, 40);

        jLabel7.setFont(new java.awt.Font("Poppins Black", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(224, 204, 190));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Documents\\NetBeansProjects\\LibraLog\\src\\libralog\\assets\\home_book.png")); // NOI18N
        jLabel7.setToolTipText("");
        jLabel7.setDoubleBuffered(true);
        jPanel6.add(jLabel7);
        jLabel7.setBounds(390, 20, 210, 220);

        txtAU_p.setBackground(new java.awt.Color(100, 108, 116));
        txtAU_p.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        txtAU_p.setForeground(new java.awt.Color(224, 205, 210));
        txtAU_p.setAlignmentX(0.0F);
        txtAU_p.setAlignmentY(-0.0F);
        txtAU_p.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.add(txtAU_p);
        txtAU_p.setBounds(140, 110, 210, 33);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(37, 115, 640, 270);

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(101, 106, 184));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Staffs/Admins Can Add New Staffs/Admins To The Staff DB.");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 70, 610, 28);

        backBtn1.setBackground(new java.awt.Color(60, 54, 51));
        backBtn1.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        backBtn1.setForeground(new java.awt.Color(170, 204, 230));
        backBtn1.setText("Back");
        backBtn1.setBorder(null);
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn1);
        backBtn1.setBounds(470, 20, 120, 40);

        jLabel17.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(238, 237, 235));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("For more information, contact us at email @: library@LibraLog.com");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(40, 410, 540, 30);

        btnLogout1.setBackground(new java.awt.Color(60, 54, 51));
        btnLogout1.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(170, 204, 230));
        btnLogout1.setText("Logout");
        btnLogout1.setBorder(null);
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout1);
        btnLogout1.setBounds(620, 20, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNowActionPerformed
        String staffUsername = txtAU_u.getText();
        String staffPassword = txtAU_p.getText();
        
        boolean registerSuccessful = registerNewStaff(staffUsername, staffPassword);
        
        if (!registerSuccessful){
            return;
        }
        
        try {
            Statement s = db.mycon().createStatement();
            s.executeUpdate("INSERT INTO staffs (username, password) VALUES ('"+staffUsername+"', '"+staffPassword+"')");
            JOptionPane.showMessageDialog(rootPane, "Staff Account Has Been Created.", "Success!", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(rootPane, "The Staff May Now Direct To Login", "Staff Account Information", JOptionPane.YES_OPTION);
            this.setVisible(false);
            new StaffLogin().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Staff Username or Password is Invalid.");
            System.out.println(e);
            txtAU_u.setText(" ");
            txtAU_p.setText(" ");
        }
    }//GEN-LAST:event_btnAddNowActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        StaffMainMenu smm = new StaffMainMenu();
        this.setVisible(false);
        smm.setVisible(true);
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        Home hm = new Home();
        this.setVisible(false);
        hm.setVisible(true);
    }//GEN-LAST:event_btnLogout1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton btnAddNow;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtAU_p;
    private javax.swing.JTextField txtAU_u;
    // End of variables declaration//GEN-END:variables
}