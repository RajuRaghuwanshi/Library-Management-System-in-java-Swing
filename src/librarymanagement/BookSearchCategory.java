package librarymanagement;

import java.awt.Point;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookSearchCategory extends javax.swing.JFrame {

    String booksearchchoice;
    BooksSearch bs;
    String[] rows;
    byte[] coverpage;
    String fname;
    int selectedrowintable;
    String header_of_books[] = {"Book Number", "Book Title", "Author", "Publisher", "Copies", "Category"};
    DefaultTableModel df = new DefaultTableModel(header_of_books, 0);

    public BookSearchCategory() {
        initComponents();
    }

    public BookSearchCategory(String temp) {
        this.booksearchchoice = temp;
        try {
            bs = new BooksSearch();
        } catch (Exception ex) {;
        }
        initComponents();
        booksearchcategorylabel.setText("Books Searching by Category : " + this.booksearchchoice);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setImage1 = new librarymanagement.SetImage();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksearchcategorytable = new javax.swing.JTable();
        booksearchcategoryimage = new librarymanagement.Browse();
        booksearchcategorylabel = new javax.swing.JLabel();
        booksearchcategorybutton = new javax.swing.JButton();
        Booksearchokbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Searching ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        booksearchcategorytable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        booksearchcategorytable.setModel(df);
        booksearchcategorytable.setRowHeight(30);
        booksearchcategorytable.setRowMargin(5);
        booksearchcategorytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksearchcategorytableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booksearchcategorytable);

        javax.swing.GroupLayout booksearchcategoryimageLayout = new javax.swing.GroupLayout(booksearchcategoryimage);
        booksearchcategoryimage.setLayout(booksearchcategoryimageLayout);
        booksearchcategoryimageLayout.setHorizontalGroup(
            booksearchcategoryimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        booksearchcategoryimageLayout.setVerticalGroup(
            booksearchcategoryimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        booksearchcategorylabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        booksearchcategorylabel.setForeground(new java.awt.Color(204, 204, 204));

        booksearchcategorybutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        booksearchcategorybutton.setText("Search");
        booksearchcategorybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksearchcategorybuttonActionPerformed(evt);
            }
        });

        Booksearchokbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Booksearchokbutton.setText("Ok");
        Booksearchokbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksearchokbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setImage1Layout = new javax.swing.GroupLayout(setImage1);
        setImage1.setLayout(setImage1Layout);
        setImage1Layout.setHorizontalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(485, 485, 485))
            .addGroup(setImage1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(booksearchcategoryimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Booksearchokbutton))
                .addGap(27, 27, 27))
            .addGroup(setImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(booksearchcategorylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(booksearchcategorybutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booksearchcategorylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booksearchcategorybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(booksearchcategoryimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(Booksearchokbutton)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booksearchcategorybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksearchcategorybuttonActionPerformed

        ResultSet rs;
        rows = new String[6];
        try {

            rs = bs.search_Books_by_category(this.booksearchchoice);

            while (rs.next()) {

                rows[0] = rs.getString(1);
                rows[1] = rs.getString(2);
                rows[2] = rs.getString(3);
                rows[3] = rs.getString(4);
                rows[4] = rs.getString(5);
                rows[5] = rs.getString(6);

                df.addRow(rows);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_booksearchcategorybuttonActionPerformed

    private void booksearchcategorytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksearchcategorytableMouseClicked
        Point p = evt.getPoint();
        selectedrowintable = booksearchcategorytable.rowAtPoint(p);
        String bno = booksearchcategorytable.getValueAt(selectedrowintable, 0).toString();

        try {
            ResultSet rs = bs.getBookImg(bno);
            while (rs.next()) {
                coverpage = rs.getBytes(1);
            }
            FileOutputStream fo = new FileOutputStream("d://temp.jpg");
            fo.write(coverpage);
            fo.close();
            booksearchcategoryimage.setImage("d://temp.jpg");


        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "no image found !");
        }
    }//GEN-LAST:event_booksearchcategorytableMouseClicked

    private void BooksearchokbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksearchokbuttonActionPerformed
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BooksearchokbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(BookSearchCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookSearchCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookSearchCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookSearchCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookSearchCategory().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Booksearchokbutton;
    private javax.swing.JButton booksearchcategorybutton;
    private librarymanagement.Browse booksearchcategoryimage;
    private javax.swing.JLabel booksearchcategorylabel;
    private javax.swing.JTable booksearchcategorytable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private librarymanagement.SetImage setImage1;
    // End of variables declaration//GEN-END:variables
}
