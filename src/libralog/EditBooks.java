/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libralog;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class EditBooks extends javax.swing.JFrame {

    /**
     * Creates new form EditBooks
     */
    public EditBooks() {
        initComponents();
        this.setSize(770, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
        this.setTitle("Edit Books | LibraLog");
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
        txtQuantity = new javax.swing.JTextField();
        txtBookTitle = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnModifyBook = new javax.swing.JButton();
        btnDisplayBook = new javax.swing.JButton();
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
        jLabel3.setText("LibraLog - Edit Books");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 30, 350, 40);

        jPanel5.setBackground(new java.awt.Color(50, 67, 72));
        jPanel5.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(238, 237, 235));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Book ID:");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(80, 30, 80, 30);

        txtBookID.setBackground(new java.awt.Color(100, 108, 116));
        txtBookID.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        txtBookID.setForeground(new java.awt.Color(224, 205, 210));
        txtBookID.setAlignmentX(0.0F);
        txtBookID.setAlignmentY(-0.0F);
        txtBookID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(txtBookID);
        txtBookID.setBounds(180, 30, 60, 33);

        txtQuantity.setBackground(new java.awt.Color(100, 108, 116));
        txtQuantity.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(224, 205, 210));
        txtQuantity.setAlignmentX(0.0F);
        txtQuantity.setAlignmentY(-0.0F);
        txtQuantity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(txtQuantity);
        txtQuantity.setBounds(380, 30, 60, 33);

        txtBookTitle.setBackground(new java.awt.Color(100, 108, 116));
        txtBookTitle.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        txtBookTitle.setForeground(new java.awt.Color(224, 205, 210));
        txtBookTitle.setAlignmentX(0.0F);
        txtBookTitle.setAlignmentY(-0.0F);
        txtBookTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(txtBookTitle);
        txtBookTitle.setBounds(180, 80, 290, 33);

        jLabel20.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(238, 237, 235));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Quantity:");
        jPanel5.add(jLabel20);
        jLabel20.setBounds(260, 30, 110, 30);

        jLabel14.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 237, 235));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Book Title:");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(60, 80, 100, 30);

        txtAuthor.setBackground(new java.awt.Color(100, 108, 116));
        txtAuthor.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        txtAuthor.setForeground(new java.awt.Color(224, 205, 210));
        txtAuthor.setAlignmentX(0.0F);
        txtAuthor.setAlignmentY(0.0F);
        txtAuthor.setAutoscrolls(false);
        txtAuthor.setBorder(null);
        jPanel5.add(txtAuthor);
        txtAuthor.setBounds(180, 130, 210, 33);

        jLabel18.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(238, 237, 235));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Author:");
        jLabel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(jLabel18);
        jLabel18.setBounds(70, 130, 110, 30);

        btnModifyBook.setBackground(new java.awt.Color(81, 114, 149));
        btnModifyBook.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnModifyBook.setForeground(new java.awt.Color(170, 215, 230));
        btnModifyBook.setText("Modify Book");
        btnModifyBook.setBorder(null);
        btnModifyBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyBookActionPerformed(evt);
            }
        });
        jPanel5.add(btnModifyBook);
        btnModifyBook.setBounds(260, 190, 210, 40);

        btnDisplayBook.setBackground(new java.awt.Color(81, 114, 149));
        btnDisplayBook.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        btnDisplayBook.setForeground(new java.awt.Color(170, 215, 230));
        btnDisplayBook.setText("Display Details");
        btnDisplayBook.setBorder(null);
        btnDisplayBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayBookActionPerformed(evt);
            }
        });
        jPanel5.add(btnDisplayBook);
        btnDisplayBook.setBounds(30, 190, 200, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(37, 115, 520, 270);

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(101, 106, 184));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Staff / Admin Can Edit Any Book With Confirmation");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-20, 70, 600, 30);

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
        backBtn.setBounds(580, 100, 120, 40);

        jLabel16.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 237, 235));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("For more information, contact us at email @: library@LibraLog.com");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(40, 410, 540, 30);

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
        btnLogout.setBounds(580, 160, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyBookActionPerformed
        try {
            int bookID = Integer.parseInt(txtBookID.getText());

            // Call the getBookDetails method to retrieve book details
            Book book = BookManagement.getBookDetails(bookID);

            if (book != null) {
                // Display book details in text fields or labels
                txtBookTitle.setText(book.getTitle());
                txtAuthor.setText(book.getAuthor());
                txtQuantity.setText(String.valueOf(book.getCopiesAvailable()));

                // Allow the user to modify book details
                int confirmResult = JOptionPane.showConfirmDialog(this, "Do you want to modify this book?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (confirmResult == JOptionPane.YES_OPTION) {
                // Retrieve modified details from the UI
                String modifiedTitle = txtBookTitle.getText();
                String modifiedAuthor = txtAuthor.getText();
                int modifiedCopies = Integer.parseInt(txtQuantity.getText());

                // Debug prints to check values before modification
                System.out.println("Before Modification:");
                System.out.println("Book ID: " + book.getBookID());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Copies Available: " + book.getCopiesAvailable());
                System.out.println("--------------------");

                // Call the modifyBook method to update book details
                BookManagement.modifyBook(bookID, modifiedTitle, modifiedAuthor, modifiedCopies);

                // Debug prints to check values after modification
                System.out.println("After Modification:");
                System.out.println("Book ID: " + bookID);
                System.out.println("Title: " + modifiedTitle);
                System.out.println("Author: " + modifiedAuthor);
                System.out.println("Copies Available: " + modifiedCopies);
                System.out.println("--------------------");

                // Display a success message or perform additional actions if needed
                JOptionPane.showMessageDialog(this, "Book modified successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Clear the input fields or update the UI as needed
                txtBookID.setText("");
                txtBookTitle.setText("");
                txtAuthor.setText("");
                txtQuantity.setText("");
                }
            } else {
                // Display an error message if the book with the given ID was not found
                JOptionPane.showMessageDialog(this, "Book not found. Please enter a valid book ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            JOptionPane.showMessageDialog(this, "Please enter a valid book ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyBookActionPerformed

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
  
    private void btnDisplayBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayBookActionPerformed
        try {
            int bookID = Integer.parseInt(txtBookID.getText());

            // Call the getBookDetails method to retrieve book details
            Book book = BookManagement.getBookDetails(bookID);

            if (book != null) {
                // Display book details in text fields or labels
                txtBookTitle.setText(book.getTitle());
                txtAuthor.setText(book.getAuthor());
                txtQuantity.setText(String.valueOf(book.getCopiesAvailable()));

                // Optionally, you can print the details to the console
                System.out.println("Book ID: " + book.getBookID());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Copies Available: " + book.getCopiesAvailable());
                System.out.println("--------------------");
               
                // Optionally, you can enable/disable components or perform other actions based on the retrieved details
            } else {
                // Display an error message if the book with the given ID was not found
                JOptionPane.showMessageDialog(this, "Book not found. Please enter a valid book ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            JOptionPane.showMessageDialog(this, "Please enter a valid book ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDisplayBookActionPerformed

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
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnDisplayBook;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnModifyBook;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtBookTitle;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
