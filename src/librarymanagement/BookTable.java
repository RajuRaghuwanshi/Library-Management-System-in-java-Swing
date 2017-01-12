package librarymanagement;

import java.awt.Point;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookTable extends javax.swing.JFrame {

    String header_of_books[] = {"Book Number", "Book Title", "Author", "Publisher", "Copies", "Category"};
    DefaultTableModel bookinformations = new DefaultTableModel(header_of_books, 0);
    String[] rows;
    BooksSearch bs;
    byte[] coverpage;
    String fname;
    int selectedrowintable = -1;

    public BookTable() {
        try {

            bs = new BooksSearch();
            ResultSet rs = bs.get_books();

            while (rs.next()) {

                rows = new String[6];
                rows[0] = rs.getString(1);
                rows[1] = rs.getString(2);
                rows[2] = rs.getString(3);
                rows[3] = rs.getString(4);
                rows[4] = rs.getString(5);
                rows[5] = rs.getString(6);

                bookinformations.addRow(rows);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        initComponents();
        labelcopies.setText("Enter number of copies :");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setImage1 = new librarymanagement.SetImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookinformationtable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        getbookimagefromdatabase = new librarymanagement.Browse();
        BookAddbutton = new javax.swing.JButton();
        booktableexitbutton = new javax.swing.JButton();
        booktablebuttonaddcopiesexistingbook = new javax.swing.JButton();
        labelcopies = new javax.swing.JLabel();
        copies = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Books Informations");
        setMaximumSize(new java.awt.Dimension(1360, 750));
        setMinimumSize(new java.awt.Dimension(1360, 650));
        setResizable(false);

        setImage1.setPreferredSize(new java.awt.Dimension(1360, 700));

        bookinformationtable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookinformationtable.setModel(bookinformations);
        bookinformationtable.setRowHeight(30);
        bookinformationtable.setRowMargin(5);
        bookinformationtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookinformationtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookinformationtable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Total Books :-");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        javax.swing.GroupLayout getbookimagefromdatabaseLayout = new javax.swing.GroupLayout(getbookimagefromdatabase);
        getbookimagefromdatabase.setLayout(getbookimagefromdatabaseLayout);
        getbookimagefromdatabaseLayout.setHorizontalGroup(
            getbookimagefromdatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        getbookimagefromdatabaseLayout.setVerticalGroup(
            getbookimagefromdatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        BookAddbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BookAddbutton.setText("Add Books");
        BookAddbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookAddbuttonActionPerformed(evt);
            }
        });

        booktableexitbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        booktableexitbutton.setText("Exit");
        booktableexitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booktableexitbuttonActionPerformed(evt);
            }
        });

        booktablebuttonaddcopiesexistingbook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        booktablebuttonaddcopiesexistingbook.setText("Add Copies Existing Book");
        booktablebuttonaddcopiesexistingbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booktablebuttonaddcopiesexistingbookActionPerformed(evt);
            }
        });

        labelcopies.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelcopies.setForeground(new java.awt.Color(102, 0, 0));

        copies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout setImage1Layout = new javax.swing.GroupLayout(setImage1);
        setImage1.setLayout(setImage1Layout);
        setImage1Layout.setHorizontalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getbookimagefromdatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(booktableexitbutton)))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(setImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BookAddbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(booktablebuttonaddcopiesexistingbook)
                .addGap(18, 18, 18)
                .addComponent(labelcopies, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(getbookimagefromdatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(booktableexitbutton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookAddbutton)
                            .addComponent(booktablebuttonaddcopiesexistingbook)
                            .addComponent(labelcopies, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookinformationtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookinformationtableMouseClicked
        Point p = evt.getPoint();
        selectedrowintable = bookinformationtable.rowAtPoint(p);
        String bno = bookinformationtable.getValueAt(selectedrowintable, 0).toString();
        try {
            ResultSet rs = bs.getBookImg(bno);
            while (rs.next()) {
                coverpage = rs.getBytes(1);
            }
            FileOutputStream fo = new FileOutputStream("d://temp.jpg");
            fo.write(coverpage);
            fo.close();
            getbookimagefromdatabase.setImage("d://temp.jpg");


        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "no image found !");
        }

        BookDetailsTable bookdetails = new BookDetailsTable(bno);
        bookdetails.setVisible(true);
        bookdetails.pack();
    }//GEN-LAST:event_bookinformationtableMouseClicked

    private void BookAddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookAddbuttonActionPerformed

        AddBook ad = new AddBook();
        ad.setVisible(true);
        ad.pack();
    }//GEN-LAST:event_BookAddbuttonActionPerformed

    private void booktableexitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booktableexitbuttonActionPerformed

        this.dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_booktableexitbuttonActionPerformed

    private void booktablebuttonaddcopiesexistingbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booktablebuttonaddcopiesexistingbookActionPerformed

        if (Integer.parseInt(copies.getText()) > 0) {
            new AddExistingbookcopies(bookinformations.getValueAt(selectedrowintable, 0).toString(), bookinformations.getValueAt(selectedrowintable, 1).toString(), copies.getText(),bookinformations.getValueAt(selectedrowintable, 4).toString()).setVisible(true);
            this.dispose();
        } else {

            JOptionPane.showMessageDialog(null, "please enter number of copies >0!");
        }

    }//GEN-LAST:event_booktablebuttonaddcopiesexistingbookActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(BookTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookAddbutton;
    private javax.swing.JTable bookinformationtable;
    private javax.swing.JButton booktablebuttonaddcopiesexistingbook;
    private javax.swing.JButton booktableexitbutton;
    private javax.swing.JTextField copies;
    private librarymanagement.Browse getbookimagefromdatabase;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelcopies;
    private librarymanagement.SetImage setImage1;
    // End of variables declaration//GEN-END:variables
}
