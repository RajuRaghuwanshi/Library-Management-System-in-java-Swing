package librarymanagement;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    public MainFrame(String text) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel11 = new librarymanagement.panel1();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainWindow");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(1360, 758));
        setMinimumSize(new java.awt.Dimension(1360, 758));
        setPreferredSize(new java.awt.Dimension(1360, 758));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("Welcome in Library Management System");

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel11Layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(190, 190, 190))
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(670, Short.MAX_VALUE))
        );

        jMenuBar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jMenuBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuBar2.setMinimumSize(new java.awt.Dimension(56, 35));
        jMenuBar2.setPreferredSize(new java.awt.Dimension(56, 35));

        jMenu3.setText("Menu");
        jMenu3.setActionCommand("Menu    ");
        jMenu3.setBorderPainted(true);
        jMenu3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem7.setText("Students");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(160, 51));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem6.setText("Books");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(160, 51));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Search");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenu6.setForeground(new java.awt.Color(0, 51, 153));
        jMenu6.setText("Students");
        jMenu6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(160, 51));
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem12.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem12.setText("Student ID");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem13.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem13.setText("Student name");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenu4.add(jMenu6);

        jMenu7.setForeground(new java.awt.Color(0, 51, 153));
        jMenu7.setText("Books");
        jMenu7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(141, 51));

        jMenu8.setForeground(new java.awt.Color(0, 51, 153));
        jMenu8.setText("Category");
        jMenu8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(185, 28));

        jMenuItem11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem11.setText("Programming");
        jMenuItem11.setPreferredSize(new java.awt.Dimension(190, 30));
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem11);

        jMenuItem14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem14.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem14.setText("Computer Science(CS/IT)");
        jMenuItem14.setPreferredSize(new java.awt.Dimension(190, 30));
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem15.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem15.setText("Electrical(EE)");
        jMenuItem15.setPreferredSize(new java.awt.Dimension(190, 30));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem16.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem16.setText("Mechanical(ME)");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(190, 30));
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem17.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem17.setText("Electronics(EC)");
        jMenuItem17.setPreferredSize(new java.awt.Dimension(190, 30));
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem17);

        jMenuItem19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem19.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem19.setText("BioTechnology(BT)");
        jMenuItem19.setPreferredSize(new java.awt.Dimension(190, 30));
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem19);

        jMenuItem20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem20.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem20.setText("Chemical(CM)");
        jMenuItem20.setPreferredSize(new java.awt.Dimension(190, 30));
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem20);

        jMenuItem21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem21.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem21.setText("Civil(CE)");
        jMenuItem21.setPreferredSize(new java.awt.Dimension(190, 30));
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem21);

        jMenu7.add(jMenu8);

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem1.setText("Book number");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(185, 28));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem2.setText("Book Title");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(185, 28));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jMenuItem10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem10.setText("Author");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(185, 28));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuItem9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem9.setText("Publisher");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(185, 28));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenu4.add(jMenu7);

        jMenuBar2.add(jMenu4);

        jMenu1.setText("Issue");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Return");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        jMenu5.setText("Report");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu5MouseEntered(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu5);

        jMenu9.setText("LogOut");
        jMenu9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu9);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        BookTable bt = new BookTable();
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        BookSearchCategory bt = new BookSearchCategory(jMenuItem11.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed

        StudentSearchtable st = new StudentSearchtable(jMenuItem12.getText());
        st.setVisible(true);
        st.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        StudentSearchtable st = new StudentSearchtable(jMenuItem13.getText());
        st.setVisible(true);
        st.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        BookSearchCategory bt = new BookSearchCategory(jMenuItem11.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        BookSearchCategory bt = new BookSearchCategory(jMenuItem11.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        BookSearchCategory bt = new BookSearchCategory(jMenuItem11.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        BookSearchCategory bt = new BookSearchCategory(jMenuItem11.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        BookSearchCategory bt = new BookSearchCategory(jMenuItem11.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        BookSearchCategory bt = new BookSearchCategory(jMenuItem11.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        BookSearchCategory bt = new BookSearchCategory(jMenuItem11.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        BookSearchtable bt = new BookSearchtable(jMenuItem1.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        BookSearchtable bt = new BookSearchtable(jMenuItem2.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        BookSearchtable bt = new BookSearchtable(jMenuItem10.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        BookSearchtable bt = new BookSearchtable(jMenuItem9.getText());
        bt.setVisible(true);
        bt.pack();
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

        this.dispose();
        new ReportFrame().setVisible(true);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        ReportFrame r = new ReportFrame();
        r.setVisible(true);
        r.pack();
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new StudentTable().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed

    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
        new IssueRegister().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
     
        new ReturnRegister().setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
      
        new LoginWindow().setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MouseEntered

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private librarymanagement.panel1 panel11;
    // End of variables declaration//GEN-END:variables
}
