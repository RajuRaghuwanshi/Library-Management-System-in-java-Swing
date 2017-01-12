package librarymanagement;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UpdateBookcopies extends javax.swing.JFrame {

    ResultSet rs;
    BooksSearch bs;
    DefaultTableModel table;
    int selectedrow;

    public UpdateBookcopies() {
        initComponents();
    }

    public UpdateBookcopies(DefaultTableModel df, int i) {
        try {
            bs = new BooksSearch();
        } catch (Exception ex) {;
        }
        table = df;
        selectedrow = i;
        initComponents();
        updatebookcopiesbookno.setText(df.getValueAt(i, 0).toString());
        updatebookcopiesaccno.setText(df.getValueAt(i, 1).toString());
        updatebookcopiesedition.setText(df.getValueAt(i, 2).toString());
        updatebookcopiesprice.setText(df.getValueAt(i, 4).toString());
        updatebookcopiesstatus.setText(df.getValueAt(i, 5).toString());
        updatebookcopiesbookstatus.setText(df.getValueAt(i, 3).toString());
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
        updatebookcopiesbookno = new javax.swing.JLabel();
        updatebookcopiesaccno = new javax.swing.JLabel();
        updatebookcopiesstatus = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        updatebookcopiesedition = new javax.swing.JTextField();
        updatebookcopiesprice = new javax.swing.JTextField();
        updatebookcopiesbookstatus = new javax.swing.JTextField();
        Updatebookcopiesupdatebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Book copies Update");
        setPreferredSize(new java.awt.Dimension(570, 530));
        setResizable(false);

        setImage1.setPreferredSize(new java.awt.Dimension(570, 530));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Book Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Book no(ISBN) :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Accession no :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Edition :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Status :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Price :");

        updatebookcopiesbookno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updatebookcopiesbookno.setForeground(new java.awt.Color(255, 255, 255));

        updatebookcopiesaccno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updatebookcopiesaccno.setForeground(new java.awt.Color(255, 255, 255));

        updatebookcopiesstatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatebookcopiesstatus.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Book Status:");

        updatebookcopiesedition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        updatebookcopiesprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        updatebookcopiesbookstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Updatebookcopiesupdatebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Updatebookcopiesupdatebutton.setText("Update");
        Updatebookcopiesupdatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebookcopiesupdatebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setImage1Layout = new javax.swing.GroupLayout(setImage1);
        setImage1.setLayout(setImage1Layout);
        setImage1Layout.setHorizontalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(updatebookcopiesaccno, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(updatebookcopiesbookno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatebookcopiesedition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebookcopiesprice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebookcopiesstatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebookcopiesbookstatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(Updatebookcopiesupdatebutton)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(updatebookcopiesbookno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Updatebookcopiesupdatebutton)))
                .addGap(47, 47, 47)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(updatebookcopiesaccno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(updatebookcopiesedition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(updatebookcopiesprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updatebookcopiesstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(updatebookcopiesbookstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdatebookcopiesupdatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebookcopiesupdatebuttonActionPerformed

        try {
            int temp = bs.update_book_details(updatebookcopiesaccno.getText(), Integer.parseInt(updatebookcopiesedition.getText()), Integer.parseInt(updatebookcopiesprice.getText()), updatebookcopiesbookstatus.getText());
            if (temp > 0) {

                JOptionPane.showMessageDialog(null, "Book information updated !");
                table.setValueAt(updatebookcopiesedition.getText(), selectedrow, 2);
                table.setValueAt(updatebookcopiesbookstatus.getText(), selectedrow, 3);
                table.setValueAt(updatebookcopiesprice.getText(), selectedrow, 4);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Book information not updated !");
                this.dispose();
            }
        } catch (Exception ex) {;
        }

    }//GEN-LAST:event_UpdatebookcopiesupdatebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateBookcopies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBookcopies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBookcopies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBookcopies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBookcopies().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Updatebookcopiesupdatebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private librarymanagement.SetImage setImage1;
    private javax.swing.JLabel updatebookcopiesaccno;
    private javax.swing.JLabel updatebookcopiesbookno;
    private javax.swing.JTextField updatebookcopiesbookstatus;
    private javax.swing.JTextField updatebookcopiesedition;
    private javax.swing.JTextField updatebookcopiesprice;
    private javax.swing.JLabel updatebookcopiesstatus;
    // End of variables declaration//GEN-END:variables
}
