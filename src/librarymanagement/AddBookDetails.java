package librarymanagement;

import java.awt.Point;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddBookDetails extends javax.swing.JFrame {

    String ISBNnumber;
    int number_of_copies;
    BooksSearch bs;
    String[] header = {"Book Number", "Accssion number", "Edition", "Book Status", "Price", "Status"};
    DefaultTableModel df = new DefaultTableModel(header, 0);
    String[] rows;
    int temp1;

    public AddBookDetails() {
        try {
            bs = new BooksSearch();
        } catch (Exception ex) {;
        }
        initComponents();
        labelbookdetailsISBN.setText(ISBNnumber);

    }

    public AddBookDetails(String ISBN, int copies) {

        this.ISBNnumber = ISBN;
        this.number_of_copies = copies;
        this.temp1 = copies;
        try {
            bs = new BooksSearch();
        } catch (Exception ex) {;
        }
        initComponents();
        labelbookdetailsISBN.setText(ISBNnumber);
        labeladdbookdetailscopies.setText(copies+"");
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
        jLabel7 = new javax.swing.JLabel();
        txtbookdetailsAccessionnumber = new javax.swing.JTextField();
        txtbookdetailsEdition = new javax.swing.JComboBox();
        txtbookdetailsprice = new javax.swing.JTextField();
        txtbookdetailsstatus = new javax.swing.JTextField();
        txtbookdetailsbookstatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Addbookdetailstable = new javax.swing.JTable();
        close = new javax.swing.JButton();
        labelbookdetailsISBN = new javax.swing.JLabel();
        Addbookdetailsinsertbutton = new javax.swing.JButton();
        addbookdetailsaddbookcopiesbutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        labeladdbookdetailscopies = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 645));
        setResizable(false);

        setImage1.setPreferredSize(new java.awt.Dimension(1100, 645));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Add Book Copies");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Book Number(ISBN) :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Enter Accession number :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Enter Book Edition :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Enter Book price :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Enter Status :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Enter Book Status :");

        txtbookdetailsAccessionnumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbookdetailsAccessionnumber.setText("SC11");
        txtbookdetailsAccessionnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookdetailsAccessionnumberActionPerformed(evt);
            }
        });

        txtbookdetailsEdition.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtbookdetailsEdition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33" }));

        txtbookdetailsprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtbookdetailsstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbookdetailsstatus.setText("Available");

        txtbookdetailsbookstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbookdetailsbookstatus.setText("Present");

        Addbookdetailstable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Addbookdetailstable.setModel(df);
        Addbookdetailstable.setRowHeight(30);
        Addbookdetailstable.setRowMargin(5);
        Addbookdetailstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbookdetailstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Addbookdetailstable);

        close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        labelbookdetailsISBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelbookdetailsISBN.setForeground(new java.awt.Color(255, 255, 255));

        Addbookdetailsinsertbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Addbookdetailsinsertbutton.setText("Insert");
        Addbookdetailsinsertbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbookdetailsinsertbuttonActionPerformed(evt);
            }
        });

        addbookdetailsaddbookcopiesbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addbookdetailsaddbookcopiesbutton.setText("Add Books Copies");
        addbookdetailsaddbookcopiesbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookdetailsaddbookcopiesbuttonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Book Copies :");

        labeladdbookdetailscopies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labeladdbookdetailscopies.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout setImage1Layout = new javax.swing.GroupLayout(setImage1);
        setImage1.setLayout(setImage1Layout);
        setImage1Layout.setHorizontalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtbookdetailsbookstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(137, 137, 137)
                        .addComponent(txtbookdetailsstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addbookdetailsaddbookcopiesbutton)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbookdetailsEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelbookdetailsISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtbookdetailsAccessionnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addComponent(labeladdbookdetailscopies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtbookdetailsprice, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(Addbookdetailsinsertbutton)
                        .addGap(141, 141, 141)
                        .addComponent(close))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(labelbookdetailsISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeladdbookdetailscopies, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtbookdetailsAccessionnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbookdetailsEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbookdetailsprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbookdetailsstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setImage1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel7))
                            .addGroup(setImage1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(txtbookdetailsbookstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)))
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(Addbookdetailsinsertbutton)
                    .addComponent(addbookdetailsaddbookcopiesbutton))
                .addGap(36, 36, 36))
        );

        jLabel8.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbookdetailsAccessionnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookdetailsAccessionnumberActionPerformed
    }//GEN-LAST:event_txtbookdetailsAccessionnumberActionPerformed

    private void AddbookdetailstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbookdetailstableMouseClicked

        Point p = evt.getPoint();
        int selectedrowintable = Addbookdetailstable.rowAtPoint(p);
        JOptionPane.showMessageDialog(null, selectedrowintable + "");
    }//GEN-LAST:event_AddbookdetailstableMouseClicked

    private void AddbookdetailsinsertbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbookdetailsinsertbuttonActionPerformed
        int i = 0;

        while (number_of_copies > 0) {

            try {
                int temp = bs.set_booksDetaits(df.getValueAt(i, 0).toString(), df.getValueAt(i, 1).toString(), Integer.parseInt(df.getValueAt(i, 2).toString()), df.getValueAt(i, 3).toString(), Integer.parseInt(df.getValueAt(i, 4).toString()), df.getValueAt(i, 5).toString());
            } catch (Exception ex) {;
            }
            number_of_copies--;
            i++;
            if(number_of_copies==0){
            
                JOptionPane.showMessageDialog(null, "All Books copies are added !");
                break;
            }
        }
        Addbookdetailsinsertbutton.setEnabled(false);
    }//GEN-LAST:event_AddbookdetailsinsertbuttonActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void addbookdetailsaddbookcopiesbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookdetailsaddbookcopiesbuttonActionPerformed
        if (temp1 == 0) {
            addbookdetailsaddbookcopiesbutton.setEnabled(false);
            JOptionPane.showMessageDialog(null, "All Copies are added !");
        } else {
            rows = new String[6];
            rows[0] = labelbookdetailsISBN.getText();
            rows[1] = txtbookdetailsAccessionnumber.getText();
            rows[2] = txtbookdetailsEdition.getSelectedItem().toString();
            rows[3] = txtbookdetailsbookstatus.getText();
            rows[4] = txtbookdetailsprice.getText();
            rows[5] = txtbookdetailsstatus.getText();

            df.addRow(rows);
            temp1--;
        }
    }//GEN-LAST:event_addbookdetailsaddbookcopiesbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(AddBookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBookDetails().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbookdetailsinsertbutton;
    private javax.swing.JTable Addbookdetailstable;
    private javax.swing.JButton addbookdetailsaddbookcopiesbutton;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labeladdbookdetailscopies;
    private javax.swing.JLabel labelbookdetailsISBN;
    private librarymanagement.SetImage setImage1;
    private javax.swing.JTextField txtbookdetailsAccessionnumber;
    private javax.swing.JComboBox txtbookdetailsEdition;
    private javax.swing.JTextField txtbookdetailsbookstatus;
    private javax.swing.JTextField txtbookdetailsprice;
    private javax.swing.JTextField txtbookdetailsstatus;
    // End of variables declaration//GEN-END:variables
}
