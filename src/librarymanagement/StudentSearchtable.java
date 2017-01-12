package librarymanagement;

import java.awt.Point;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentSearchtable extends javax.swing.JFrame {

    String[] header = {"Student id", "Student name", "Gender", "Date of birth", "Address", "City", "State", "phonenumber", "Email id", "TotalBooks", "Expiary date"};
    DefaultTableModel df = new DefaultTableModel(header, 0);
    String[] rows;
    String jmenuselected;
    StudentSearch s;
    byte[] studentimagearray;
    int selectedrow;

    public StudentSearchtable() {
        try {
            s = new StudentSearch();
        } catch (Exception ex) {;
        }
        initComponents();
    }

    public StudentSearchtable(String temp) {
        try {
            s = new StudentSearch();
        } catch (Exception ex) {;
        }
        initComponents();
        this.jmenuselected = temp;
        studentsearchlabel.setText("Enter " + temp + " :");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        setImage1 = new librarymanagement.SetImage();
        jLabel1 = new javax.swing.JLabel();
        studentsearchimageset = new librarymanagement.Browse();
        studentsearchlabel = new javax.swing.JLabel();
        studentsearchtext = new javax.swing.JTextField();
        studentsearchsearchbuton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsearchtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 600));

        setImage1.setPreferredSize(new java.awt.Dimension(1300, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Students Search details");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        javax.swing.GroupLayout studentsearchimagesetLayout = new javax.swing.GroupLayout(studentsearchimageset);
        studentsearchimageset.setLayout(studentsearchimagesetLayout);
        studentsearchimagesetLayout.setHorizontalGroup(
            studentsearchimagesetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        studentsearchimagesetLayout.setVerticalGroup(
            studentsearchimagesetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        studentsearchlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentsearchlabel.setForeground(new java.awt.Color(204, 204, 204));

        studentsearchtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        studentsearchsearchbuton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentsearchsearchbuton.setText("Search");
        studentsearchsearchbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsearchsearchbutonActionPerformed(evt);
            }
        });

        studentsearchtable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentsearchtable.setModel(df);
        studentsearchtable.setRowHeight(30);
        studentsearchtable.setRowMargin(5);
        studentsearchtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsearchtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentsearchtable);

        javax.swing.GroupLayout setImage1Layout = new javax.swing.GroupLayout(setImage1);
        setImage1.setLayout(setImage1Layout);
        setImage1Layout.setHorizontalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(studentsearchlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(studentsearchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(studentsearchsearchbuton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(setImage1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(studentsearchimageset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentsearchsearchbuton, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addComponent(studentsearchtext))
                    .addComponent(studentsearchlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentsearchimageset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(setImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentsearchsearchbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsearchsearchbutonActionPerformed
        try {
            if (this.jmenuselected.equalsIgnoreCase("Student ID")) {
                ResultSet rs = s.get_students_by_id(studentsearchtext.getText().toLowerCase().trim());
                if(rs.next()) {

                    rows = new String[12];
                    rows[0] = rs.getString(1);
                    rows[1] = rs.getString(2);
                    rows[2] = rs.getString(3);
                    rows[3] = rs.getString(4);
                    rows[4] = rs.getString(5);
                    rows[5] = rs.getString(6);
                    rows[6] = rs.getString(7);
                    rows[7] = rs.getString(8);
                    rows[8] = rs.getString(9);
                    rows[9] = rs.getString(10);
                    rows[10] = rs.getString(11);
                    rows[11] = rs.getString(12);
                    df.addRow(rows);
                } else JOptionPane.showMessageDialog(null,"No record found of this ID !");
            } else {
                ResultSet rs = s.get_students_by_name(studentsearchtext.getText().toLowerCase().trim());
                while (rs.next()) {

                    rows = new String[12];
                    rows[0] = rs.getString(1);
                    rows[1] = rs.getString(2);
                    rows[2] = rs.getString(3);
                    rows[3] = rs.getString(4);
                    rows[4] = rs.getString(5);
                    rows[5] = rs.getString(6);
                    rows[6] = rs.getString(7);
                    rows[7] = rs.getString(8);
                    rows[8] = rs.getString(9);
                    rows[9] = rs.getString(10);
                    rows[10] = rs.getString(11);
                    rows[11] = rs.getString(12);
                    df.addRow(rows);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_studentsearchsearchbutonActionPerformed

    private void studentsearchtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsearchtableMouseClicked
        
        Point p = evt.getPoint();
        selectedrow = studentsearchtable.rowAtPoint(p);

        String S_id = studentsearchtable.getValueAt(selectedrow, 0).toString();
        try {
            ResultSet rs = s.setStudentimage(S_id);
            if (rs.next()) {
                studentimagearray = rs.getBytes(1);
            }
            FileOutputStream fo = new FileOutputStream("d://temp.jpg");
            fo.write(studentimagearray);
            fo.close();
            studentsearchimageset.setImage("d://temp.jpg");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }       
    }//GEN-LAST:event_studentsearchtableMouseClicked

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
            java.util.logging.Logger.getLogger(StudentSearchtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSearchtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSearchtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSearchtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSearchtable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private librarymanagement.SetImage setImage1;
    private librarymanagement.Browse studentsearchimageset;
    private javax.swing.JLabel studentsearchlabel;
    private javax.swing.JButton studentsearchsearchbuton;
    private javax.swing.JTable studentsearchtable;
    private javax.swing.JTextField studentsearchtext;
    // End of variables declaration//GEN-END:variables
}
