package librarymanagement;

import java.awt.Point;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookSearchtable extends javax.swing.JFrame {

    String booksearchchoice;
    BooksSearch bs;
    String[] rows;
    byte[] coverpage;
    String fname;
    int selectedrowintable;
    String header_of_books[] = {"Book Number", "Book Title", "Author", "Publisher", "Copies", "Category"};
    DefaultTableModel df = new DefaultTableModel(header_of_books, 0);

    public BookSearchtable() {
        try {
            bs = new BooksSearch();
        } catch (Exception ex) {;
        }
        initComponents();
    }

    public BookSearchtable(String temp) {
        this.booksearchchoice = temp;
         try { bs = new BooksSearch();}catch(Exception ex){;}
        initComponents();
        booksearchlabel.setText("Enter " + temp + " for searching books : ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        setImage1 = new librarymanagement.SetImage();
        jLabel1 = new javax.swing.JLabel();
        booksearchlabel = new javax.swing.JLabel();
        booksearchtxt = new javax.swing.JTextField();
        booksearchimage = new librarymanagement.Browse();
        studentsearchbutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        booksearchtable = new javax.swing.JTable();
        Booksearchokbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Book Search Table");
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 600));

        setImage1.setPreferredSize(new java.awt.Dimension(1100, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9.jpg"))); // NOI18N
        jLabel1.setText("Books Searching");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        booksearchlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        booksearchlabel.setForeground(new java.awt.Color(204, 204, 204));

        booksearchtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        booksearchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksearchtxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout booksearchimageLayout = new javax.swing.GroupLayout(booksearchimage);
        booksearchimage.setLayout(booksearchimageLayout);
        booksearchimageLayout.setHorizontalGroup(
            booksearchimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        booksearchimageLayout.setVerticalGroup(
            booksearchimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        studentsearchbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentsearchbutton.setText("Search");
        studentsearchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsearchbuttonActionPerformed(evt);
            }
        });

        booksearchtable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        booksearchtable.setModel(df);
        booksearchtable.setRowHeight(30);
        booksearchtable.setRowMargin(5);
        booksearchtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksearchtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(booksearchtable);

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
                .addGap(614, 614, 614))
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(booksearchlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(booksearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(studentsearchbutton))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(booksearchimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Booksearchokbutton))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(booksearchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentsearchbutton))
                    .addComponent(booksearchlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(booksearchimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(Booksearchokbutton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booksearchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksearchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booksearchtxtActionPerformed

    private void studentsearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsearchbuttonActionPerformed

        ResultSet rs;
        rows = new String[6];

        switch (this.booksearchchoice) {
            case "Book number":
                try {
                    rs = bs.search_Books_by_Bno(booksearchtxt.getText());
                    if (rs.next()) {

                        rows[0] = rs.getString(1);
                        rows[1] = rs.getString(2);
                        rows[2] = rs.getString(3);
                        rows[3] = rs.getString(4);
                        rows[4] = rs.getString(5);
                        rows[5] = rs.getString(6);

                        df.addRow(rows);
                    } else {
                        JOptionPane.showMessageDialog(null, "No record found of this number !");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;


            case "Book Title":
                try {
                    rs = bs.search_Books_by_title(booksearchtxt.getText());
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
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;

            case "Author":
                try {
                    rs = bs.search_Books_by_author(booksearchtxt.getText());
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
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "Publisher":
                try {
                    rs = bs.search_Books_by_Publisher(booksearchtxt.getText());
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
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;

        }
    }//GEN-LAST:event_studentsearchbuttonActionPerformed

    private void booksearchtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksearchtableMouseClicked
        Point p = evt.getPoint();
        selectedrowintable = booksearchtable.rowAtPoint(p);
        String bno = booksearchtable.getValueAt(selectedrowintable, 0).toString();

        try {
            ResultSet rs = bs.getBookImg(bno);
            while (rs.next()) {
                coverpage = rs.getBytes(1);
            }
            FileOutputStream fo = new FileOutputStream("d://temp.jpg");
            fo.write(coverpage);
            fo.close();
            booksearchimage.setImage("d://temp.jpg");


        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "no image found !");
        }
    }//GEN-LAST:event_booksearchtableMouseClicked

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
            java.util.logging.Logger.getLogger(BookSearchtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookSearchtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookSearchtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookSearchtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookSearchtable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Booksearchokbutton;
    private librarymanagement.Browse booksearchimage;
    private javax.swing.JLabel booksearchlabel;
    private javax.swing.JTable booksearchtable;
    private javax.swing.JTextField booksearchtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private librarymanagement.SetImage setImage1;
    private javax.swing.JButton studentsearchbutton;
    // End of variables declaration//GEN-END:variables
}
