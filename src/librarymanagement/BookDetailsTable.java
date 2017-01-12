package librarymanagement;

import java.awt.Point;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookDetailsTable extends javax.swing.JFrame {

    String header_of_books[] = {"Book Numner", "Accession number", "Edition", "Book status", "Price", "status"};
    DefaultTableModel bookdetails = new DefaultTableModel(header_of_books, 0);
    String[] rows;
    BooksSearch bs;
    int selectedrow;

    public BookDetailsTable() {

        try {
            bs = new BooksSearch();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        initComponents();
    }

    public BookDetailsTable(String bno) {

        try {
            bs = new BooksSearch();
            ResultSet rs = bs.get_Books_by_Bno(bno);
            while (rs.next()) {

                rows = new String[6];
                rows[0] = rs.getString(1);
                rows[1] = rs.getString(2);
                rows[2] = rs.getString(3);
                rows[3] = rs.getString(4);
                rows[4] = rs.getString(5);
                rows[5] = rs.getString(6);

                bookdetails.addRow(rows);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setImage1 = new librarymanagement.SetImage();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookdetailstable = new javax.swing.JTable();
        bookdetailsupdatebutton = new javax.swing.JButton();
        bookdetailsokbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 600));

        setImage1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Book Informations");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        bookdetailstable.setModel(bookdetails);
        bookdetailstable.setRowHeight(30);
        bookdetailstable.setRowMargin(5);
        bookdetailstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookdetailstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookdetailstable);

        bookdetailsupdatebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookdetailsupdatebutton.setText("Update copies");
        bookdetailsupdatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookdetailsupdatebuttonActionPerformed(evt);
            }
        });

        bookdetailsokbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookdetailsokbutton.setText("Ok");
        bookdetailsokbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookdetailsokbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setImage1Layout = new javax.swing.GroupLayout(setImage1);
        setImage1.setLayout(setImage1Layout);
        setImage1Layout.setHorizontalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookdetailsupdatebutton)
                            .addComponent(bookdetailsokbutton)))
                    .addComponent(jLabel1))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(bookdetailsupdatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(bookdetailsokbutton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //String isbn, String accno, String edition, String price, String status, String bstatus
    private void bookdetailsupdatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookdetailsupdatebuttonActionPerformed

        new UpdateBookcopies(bookdetails, selectedrow).setVisible(true);
    }//GEN-LAST:event_bookdetailsupdatebuttonActionPerformed

    private void bookdetailstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookdetailstableMouseClicked

        Point p = evt.getPoint();
        selectedrow = bookdetailstable.rowAtPoint(p);

        if (bookdetails.getValueAt(selectedrow, 5).toString().equalsIgnoreCase("Issue") && evt.getModifiers() == 4) {
            CheckIssueStudent chk = new CheckIssueStudent(bookdetails.getValueAt(selectedrow, 1).toString());
            chk.setVisible(true);
            chk.pack();
        } else {
            new IssueRegister().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bookdetailstableMouseClicked

    private void bookdetailsokbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookdetailsokbuttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_bookdetailsokbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(BookDetailsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookDetailsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookDetailsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookDetailsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookDetailsTable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookdetailsokbutton;
    private javax.swing.JTable bookdetailstable;
    private javax.swing.JButton bookdetailsupdatebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private librarymanagement.SetImage setImage1;
    // End of variables declaration//GEN-END:variables
}
