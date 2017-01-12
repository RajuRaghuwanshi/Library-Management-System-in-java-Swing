package librarymanagement;

import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AddBook extends javax.swing.JFrame {

    String fname;
    byte[] coverpage;
    BooksSearch bs;

    public AddBook() {
        try {
            bs = new BooksSearch();
        } catch (Exception ex) {;
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setImage1 = new librarymanagement.SetImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbookinformationsISBN = new javax.swing.JTextField();
        txtbookinformationsbooktitle = new javax.swing.JTextField();
        txtbookauthor = new javax.swing.JTextField();
        txtbookinformationspublisher = new javax.swing.JTextField();
        txtbookinformationscopies = new javax.swing.JTextField();
        setbookimageondatabase = new librarymanagement.Browse();
        AddnewbookOkbutton = new javax.swing.JButton();
        setimageondatabasebutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        combobookinformationscategory = new javax.swing.JComboBox();
        addbookexitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add new Book");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        setImage1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Add new Book informations");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Enter Book number(ISBN) : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Enter Book title :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Enter Book Author :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Enter Book publisher :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Enter Book coppies :");

        txtbookinformationsISBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbookinformationsISBN.setText("ISBN 13:978-81-7366-602-5");

        txtbookinformationsbooktitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbookinformationsbooktitle.setText("Head First Java");

        txtbookauthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbookauthor.setText("Kathy Sierra & Bert Bates");
        txtbookauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookauthorActionPerformed(evt);
            }
        });

        txtbookinformationspublisher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbookinformationspublisher.setText("Shroff Publishers & Distributors");

        txtbookinformationscopies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbookinformationscopies.setText("3");

        javax.swing.GroupLayout setbookimageondatabaseLayout = new javax.swing.GroupLayout(setbookimageondatabase);
        setbookimageondatabase.setLayout(setbookimageondatabaseLayout);
        setbookimageondatabaseLayout.setHorizontalGroup(
            setbookimageondatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        setbookimageondatabaseLayout.setVerticalGroup(
            setbookimageondatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        AddnewbookOkbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddnewbookOkbutton.setText("OK");
        AddnewbookOkbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddnewbookOkbuttonActionPerformed(evt);
            }
        });

        setimageondatabasebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setimageondatabasebutton.setText("Browse");
        setimageondatabasebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setimageondatabasebuttonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Enter Book category :");

        combobookinformationscategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combobookinformationscategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Programming", "Computer Science(CS)", "Mechanaical(ME)", "Information tachnology(IT)", "Electrical(EE)", "Electronics(EC)", "Civil(CE)", "Chemical(CM)", "BioTechnology(BT)" }));

        addbookexitbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addbookexitbutton.setText("Exit");
        addbookexitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookexitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setImage1Layout = new javax.swing.GroupLayout(setImage1);
        setImage1.setLayout(setImage1Layout);
        setImage1Layout.setHorizontalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel1))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(setImage1Layout.createSequentialGroup()
                                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(setImage1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(61, 61, 61)
                                            .addComponent(txtbookinformationsISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(setImage1Layout.createSequentialGroup()
                                            .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(setImage1Layout.createSequentialGroup()
                                                    .addComponent(AddnewbookOkbutton)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(addbookexitbutton))
                                                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7)))
                                            .addGap(107, 107, 107)
                                            .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtbookinformationspublisher)
                                                .addComponent(txtbookauthor)
                                                .addComponent(txtbookinformationsbooktitle)
                                                .addComponent(txtbookinformationscopies)
                                                .addComponent(combobookinformationscategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addComponent(jLabel4))
                                .addGap(100, 100, 100)
                                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(setbookimageondatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setimageondatabasebutton))))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtbookinformationsISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtbookinformationsbooktitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setbookimageondatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtbookauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(setimageondatabasebutton)))
                .addGap(38, 38, 38)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtbookinformationspublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtbookinformationscopies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combobookinformationscategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddnewbookOkbutton)
                    .addComponent(addbookexitbutton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbookauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookauthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbookauthorActionPerformed

    private void setimageondatabasebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setimageondatabasebuttonActionPerformed
        try {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            fname = fc.getSelectedFile().toString();

            setbookimageondatabase.setImage(fname);
            FileInputStream fi = new FileInputStream(fname);
            coverpage = new byte[fi.available() + 1];
            fi.read(coverpage);
            fi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "not prited");
        }
    }//GEN-LAST:event_setimageondatabasebuttonActionPerformed

    private void AddnewbookOkbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddnewbookOkbuttonActionPerformed

        try {
            int temp = bs.set_books(txtbookinformationsISBN.getText(), txtbookinformationsbooktitle.getText(), txtbookauthor.getText(), txtbookinformationspublisher.getText(), Integer.parseInt(txtbookinformationscopies.getText()), combobookinformationscategory.getSelectedItem().toString(), coverpage);
            if (temp > 0) {
                JOptionPane.showMessageDialog(null, "New Book added !");
                AddBookDetails bk = new AddBookDetails(txtbookinformationsISBN.getText(),Integer.parseInt(txtbookinformationscopies.getText()));
                bk.setVisible(true);
                bk.pack();
            } else {
                JOptionPane.showMessageDialog(null, "New Book not added Prorperly !");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_AddnewbookOkbuttonActionPerformed

    private void addbookexitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookexitbuttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_addbookexitbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddnewbookOkbutton;
    private javax.swing.JButton addbookexitbutton;
    private javax.swing.JComboBox combobookinformationscategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private librarymanagement.SetImage setImage1;
    private librarymanagement.Browse setbookimageondatabase;
    private javax.swing.JButton setimageondatabasebutton;
    private javax.swing.JTextField txtbookauthor;
    private javax.swing.JTextField txtbookinformationsISBN;
    private javax.swing.JTextField txtbookinformationsbooktitle;
    private javax.swing.JTextField txtbookinformationscopies;
    private javax.swing.JTextField txtbookinformationspublisher;
    // End of variables declaration//GEN-END:variables
}
