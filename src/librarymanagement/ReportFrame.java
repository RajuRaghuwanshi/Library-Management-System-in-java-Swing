package librarymanagement;

import java.awt.Point;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReportFrame extends javax.swing.JFrame {

    String header_of_books[] = {"Book Number", "Book Title", "Author", "Publisher", "Copies", "Category"};
    DefaultTableModel BookList = new DefaultTableModel(header_of_books, 0);
   
    String header_of_dailyissueregister[] = {"Student no.", "Student Name", "Accession no.", "Book title", "Expected return date"};
    DefaultTableModel Dailyissueregister = new DefaultTableModel(header_of_dailyissueregister, 0);
    
    String header_of_dailyreturnregister[] = {"Student no.", "Student Name", "Accession no.", "Book title", "Over Days", "Fine Paid", "Fine"};
    DefaultTableModel Dailyreturnregister = new DefaultTableModel(header_of_dailyreturnregister, 0);
        
    String[] rows;
    BooksSearch bs;
    StudentSearch s;
    Reportclass rc;
    byte[] coverpage;
    String fname;
    int selectedrowintable;
    ResultSet rs1, rs2, rs3,rs4;

    public ReportFrame() {
        initComponents();
        try {
            bs = new BooksSearch();
            s = new StudentSearch();
            rc = new Reportclass();
            
            rs1 = bs.get_Books_by_category();
            while (rs1.next()) {

                rows = new String[6];
                rows[0] = rs1.getString(1);
                rows[1] = rs1.getString(2);
                rows[2] = rs1.getString(3);
                rows[3] = rs1.getString(4);
                rows[4] = rs1.getString(5);
                rows[5] = rs1.getString(6);

                BookList.addRow(rows);
            }

             rs2 = rc.get_dailyissue();
             while(rs2.next()) {
             rows = new String[5];
             rows[0] = rs2.getString(1);
             rows[1] = rs2.getString(2);
             rows[2] = rs2.getString(3);
             rows[3] = rs2.getString(4);
             rows[4] = rs2.getString(5);

             Dailyissueregister.addRow(rows);                 
             }  

             rs3 = rc.get_dailyreturn();
             while(rs3.next()) {
 
             rows = new String[7];
             rows[0] = rs3.getString(1);
             rows[1] = rs3.getString(2);
             rows[2] = rs3.getString(3);
             rows[3] = rs3.getString(4);
             rows[4] = rs3.getString(5);
             rows[5] = rs3.getString(6);
             rows[6] = rs3.getString(7);
             
             Dailyreturnregister.addRow(rows);                 
             }    
             rs4 = rc.get_total_fine();
             rs4.next();
            totalfinecollectlabel.setText(rs4.getString(1));
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookListtable = new javax.swing.JTable();
        booklistimage = new librarymanagement.Browse();
        booklistexitbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Dailyissuerecordtable = new javax.swing.JTable();
        dailyissuerecordimage = new librarymanagement.Browse();
        dailyissueregisterexitbutton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dailyreturnrecordtable = new javax.swing.JTable();
        dailyreturnrecordimage = new librarymanagement.Browse();
        jLabel1 = new javax.swing.JLabel();
        totalfinecollectlabel = new javax.swing.JLabel();
        dailyreturnregisterexitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Report in Library Management");
        setPreferredSize(new java.awt.Dimension(1360, 758));
        setResizable(false);

        jTabbedPane1.setForeground(new java.awt.Color(0, 51, 153));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1360, 758));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        BookListtable.setModel(BookList);
        BookListtable.setRowHeight(30);
        BookListtable.setRowMargin(3);
        BookListtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookListtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BookListtable);

        javax.swing.GroupLayout booklistimageLayout = new javax.swing.GroupLayout(booklistimage);
        booklistimage.setLayout(booklistimageLayout);
        booklistimageLayout.setHorizontalGroup(
            booklistimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        booklistimageLayout.setVerticalGroup(
            booklistimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        booklistexitbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        booklistexitbutton.setText("Exit");
        booklistexitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booklistexitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(booklistimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booklistexitbutton))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(booklistimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(booklistexitbutton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Books List", new javax.swing.ImageIcon(getClass().getResource("/2.jpg")), jPanel1); // NOI18N

        Dailyissuerecordtable.setModel(Dailyissueregister);
        Dailyissuerecordtable.setRowHeight(30);
        Dailyissuerecordtable.setRowMargin(3);
        Dailyissuerecordtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DailyissuerecordtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Dailyissuerecordtable);

        javax.swing.GroupLayout dailyissuerecordimageLayout = new javax.swing.GroupLayout(dailyissuerecordimage);
        dailyissuerecordimage.setLayout(dailyissuerecordimageLayout);
        dailyissuerecordimageLayout.setHorizontalGroup(
            dailyissuerecordimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        dailyissuerecordimageLayout.setVerticalGroup(
            dailyissuerecordimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        dailyissueregisterexitbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dailyissueregisterexitbutton.setText("Exit");
        dailyissueregisterexitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyissueregisterexitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dailyissuerecordimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dailyissueregisterexitbutton))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(dailyissuerecordimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(dailyissueregisterexitbutton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Daily Issue Record", new javax.swing.ImageIcon(getClass().getResource("/1.jpg")), jPanel2); // NOI18N

        dailyreturnrecordtable.setModel(Dailyreturnregister);
        dailyreturnrecordtable.setRowHeight(30);
        dailyreturnrecordtable.setRowMargin(3);
        dailyreturnrecordtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dailyreturnrecordtableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(dailyreturnrecordtable);

        javax.swing.GroupLayout dailyreturnrecordimageLayout = new javax.swing.GroupLayout(dailyreturnrecordimage);
        dailyreturnrecordimage.setLayout(dailyreturnrecordimageLayout);
        dailyreturnrecordimageLayout.setHorizontalGroup(
            dailyreturnrecordimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        dailyreturnrecordimageLayout.setVerticalGroup(
            dailyreturnrecordimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Total Fine :");

        totalfinecollectlabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        totalfinecollectlabel.setForeground(new java.awt.Color(0, 51, 153));

        dailyreturnregisterexitbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dailyreturnregisterexitbutton.setText("Exit");
        dailyreturnregisterexitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyreturnregisterexitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dailyreturnrecordimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(totalfinecollectlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(dailyreturnregisterexitbutton))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(dailyreturnrecordimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(totalfinecollectlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(dailyreturnregisterexitbutton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Daily Return Record", new javax.swing.ImageIcon(getClass().getResource("/1.jpg")), jPanel3); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1379, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookListtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookListtableMouseClicked

        Point p = evt.getPoint();
        selectedrowintable = BookListtable.rowAtPoint(p);
        String bno = BookListtable.getValueAt(selectedrowintable, 0).toString();

        try {
            ResultSet rs = bs.getBookImg(bno);
            while (rs.next()) {
                coverpage = rs.getBytes(1);
            }
            FileOutputStream fo = new FileOutputStream("d://temp.jpg");
            fo.write(coverpage);
            fo.close();
            booklistimage.setImage("d://temp.jpg");


        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "no image found !");
        }
    }//GEN-LAST:event_BookListtableMouseClicked

    private void DailyissuerecordtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DailyissuerecordtableMouseClicked

        Point p = evt.getPoint();
        selectedrowintable = Dailyissuerecordtable.rowAtPoint(p);
        String bno = Dailyissuerecordtable.getValueAt(selectedrowintable, 0).toString();

        try {
            ResultSet rs = s.setStudentimage(bno);
            while (rs.next()) {
                coverpage = rs.getBytes(1);
            }
            FileOutputStream fo = new FileOutputStream("d://temp.jpg");
            fo.write(coverpage);
            fo.close();
            dailyissuerecordimage.setImage("d://temp.jpg");


        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "no image found !");
        }
    }//GEN-LAST:event_DailyissuerecordtableMouseClicked

    private void dailyreturnrecordtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dailyreturnrecordtableMouseClicked
        Point p = evt.getPoint();
        selectedrowintable = dailyreturnrecordtable.rowAtPoint(p);
        String bno = dailyreturnrecordtable.getValueAt(selectedrowintable, 0).toString();

        try {
            ResultSet rs = s.setStudentimage(bno);
            while (rs.next()) {
                coverpage = rs.getBytes(1);
            }
            FileOutputStream fo = new FileOutputStream("d://temp.jpg");
            fo.write(coverpage);
            fo.close();
            dailyreturnrecordimage.setImage("d://temp.jpg");


        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "no image found !");
        }

    }//GEN-LAST:event_dailyreturnrecordtableMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void booklistexitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booklistexitbuttonActionPerformed
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_booklistexitbuttonActionPerformed

    private void dailyreturnregisterexitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyreturnregisterexitbuttonActionPerformed
        new MainFrame().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_dailyreturnregisterexitbuttonActionPerformed

    private void dailyissueregisterexitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyissueregisterexitbuttonActionPerformed
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dailyissueregisterexitbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BookListtable;
    private javax.swing.JTable Dailyissuerecordtable;
    private javax.swing.JButton booklistexitbutton;
    private librarymanagement.Browse booklistimage;
    private librarymanagement.Browse dailyissuerecordimage;
    private javax.swing.JButton dailyissueregisterexitbutton;
    private librarymanagement.Browse dailyreturnrecordimage;
    private javax.swing.JTable dailyreturnrecordtable;
    private javax.swing.JButton dailyreturnregisterexitbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel totalfinecollectlabel;
    // End of variables declaration//GEN-END:variables
}
