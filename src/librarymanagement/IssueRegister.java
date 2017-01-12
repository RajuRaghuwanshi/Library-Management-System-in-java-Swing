package librarymanagement;

import java.io.FileOutputStream;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;

public class IssueRegister extends javax.swing.JFrame {

    BooksSearch bs;
    ResultSet rs, rs1;
    StudentSearch st;
    Calendar cl;

    public IssueRegister() {

        cl = Calendar.getInstance();
        try {
            bs = new BooksSearch();
            st = new StudentSearch();

            initComponents();

            labelIssueregisterDate.setText(cl.get(cl.YEAR) + "-" + (cl.get(cl.MONTH) + 1) + "-" + cl.get(cl.DATE));
            labelissueregisterID.setText(cl.getTime().hashCode() + "");
            rs = bs.get_all_accession_no();
            rs1 = st.getStudent_ID();
            while (rs.next()) {
                issuegetaccessionnocombo.addItem(rs.getString(1));
            }

            while (rs1.next()) {
                issuestudentidcombo.addItem(rs1.getString(1));
            }
        } catch (Exception ex) {;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        setImage1 = new librarymanagement.SetImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelIssueregisterDate = new javax.swing.JLabel();
        labelissueregisterID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonissueregistersearch = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        imageissueregisterpanel = new librarymanagement.Browse();
        jLabel11 = new javax.swing.JLabel();
        issuegetaccessionnocombo = new javax.swing.JComboBox();
        txtissueregisterisbn = new javax.swing.JLabel();
        txtissueregistertitle = new javax.swing.JLabel();
        txtissueregisterauthor = new javax.swing.JLabel();
        txtissueregisterpublisher = new javax.swing.JLabel();
        txtissueregisteredition = new javax.swing.JLabel();
        txtissueregisterstatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        setImage2 = new librarymanagement.SetImage();
        jLabel12 = new javax.swing.JLabel();
        issuestudentidcombo = new javax.swing.JComboBox();
        issuesearchstudentbutton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        issuelabelissuedate = new javax.swing.JLabel();
        issuelabelreturndate = new javax.swing.JLabel();
        issueButtonIssueBook = new javax.swing.JButton();
        issuebuttonexit = new javax.swing.JButton();
        issuelabelstudentname = new javax.swing.JLabel();
        issuelabeltotalbook = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 700));
        setResizable(false);

        jSplitPane1.setBackground(new java.awt.Color(102, 102, 102));
        jSplitPane1.setDividerLocation(350);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1350, 700));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Issue Register");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Issue Date:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Issue ID :");

        labelIssueregisterDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelIssueregisterDate.setForeground(new java.awt.Color(255, 255, 255));

        labelissueregisterID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelissueregisterID.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Select Accession number :");

        buttonissueregistersearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonissueregistersearch.setText("Search");
        buttonissueregistersearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonissueregistersearchActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Book ISBN Number :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Author Name :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Publisher Name :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Book Title :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Book Edition :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Book Status :");

        javax.swing.GroupLayout imageissueregisterpanelLayout = new javax.swing.GroupLayout(imageissueregisterpanel);
        imageissueregisterpanel.setLayout(imageissueregisterpanelLayout);
        imageissueregisterpanelLayout.setHorizontalGroup(
            imageissueregisterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        imageissueregisterpanelLayout.setVerticalGroup(
            imageissueregisterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Book Images");

        issuegetaccessionnocombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        issuegetaccessionnocombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuegetaccessionnocomboActionPerformed(evt);
            }
        });

        txtissueregisterisbn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtissueregisterisbn.setForeground(new java.awt.Color(255, 255, 255));

        txtissueregistertitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtissueregistertitle.setForeground(new java.awt.Color(255, 255, 255));

        txtissueregisterauthor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtissueregisterauthor.setForeground(new java.awt.Color(255, 255, 255));

        txtissueregisterpublisher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtissueregisterpublisher.setForeground(new java.awt.Color(255, 255, 255));

        txtissueregisteredition.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtissueregisteredition.setForeground(new java.awt.Color(255, 255, 255));

        txtissueregisterstatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtissueregisterstatus.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout setImage1Layout = new javax.swing.GroupLayout(setImage1);
        setImage1.setLayout(setImage1Layout);
        setImage1Layout.setHorizontalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(setImage1Layout.createSequentialGroup()
                                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelissueregisterID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelIssueregisterDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(buttonissueregistersearch)
                            .addGroup(setImage1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(issuegetaccessionnocombo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(145, 145, 145)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtissueregistertitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtissueregisterisbn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtissueregisterauthor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(26, 26, 26))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(txtissueregisterpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)))
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtissueregisteredition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imageissueregisterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtissueregisterstatus, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelIssueregisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(txtissueregisterisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtissueregisteredition, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setImage1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelissueregisterID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(setImage1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtissueregistertitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(issuegetaccessionnocombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 94, Short.MAX_VALUE))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtissueregisterstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(setImage1Layout.createSequentialGroup()
                                .addComponent(imageissueregisterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(setImage1Layout.createSequentialGroup()
                                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(txtissueregisterauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtissueregisterpublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonissueregistersearch)
                .addContainerGap())
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

        jSplitPane1.setTopComponent(jPanel1);

        setImage2.setForeground(new java.awt.Color(255, 0, 153));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Enter Student ID :");

        issuestudentidcombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        issuesearchstudentbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        issuesearchstudentbutton.setText("Search");
        issuesearchstudentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuesearchstudentbuttonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Student name :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Total Books Issued :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Issue Date :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Expected Return Date :");

        issuelabelissuedate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        issuelabelissuedate.setForeground(new java.awt.Color(255, 255, 255));

        issuelabelreturndate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        issuelabelreturndate.setForeground(new java.awt.Color(255, 255, 255));

        issueButtonIssueBook.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        issueButtonIssueBook.setText("Issue Book");
        issueButtonIssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueButtonIssueBookActionPerformed(evt);
            }
        });

        issuebuttonexit.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        issuebuttonexit.setText("Exit");
        issuebuttonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebuttonexitActionPerformed(evt);
            }
        });

        issuelabelstudentname.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        issuelabelstudentname.setForeground(new java.awt.Color(255, 255, 255));

        issuelabeltotalbook.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        issuelabeltotalbook.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout setImage2Layout = new javax.swing.GroupLayout(setImage2);
        setImage2.setLayout(setImage2Layout);
        setImage2Layout.setHorizontalGroup(
            setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage2Layout.createSequentialGroup()
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setImage2Layout.createSequentialGroup()
                                .addComponent(issuestudentidcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(issuesearchstudentbutton))
                            .addComponent(issuelabeltotalbook, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
                    .addGroup(setImage2Layout.createSequentialGroup()
                        .addComponent(issuelabelstudentname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122)))
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage2Layout.createSequentialGroup()
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(issuelabelissuedate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(issuelabelreturndate, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addGap(622, 622, 622))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage2Layout.createSequentialGroup()
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(issuebuttonexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(issueButtonIssueBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(322, 322, 322))))
        );
        setImage2Layout.setVerticalGroup(
            setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(issuestudentidcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issuesearchstudentbutton)
                    .addComponent(issueButtonIssueBook))
                .addGap(67, 67, 67)
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(issuelabelissuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issuelabelstudentname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(issuelabeltotalbook, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(setImage2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(issuebuttonexit)
                        .addGap(25, 25, 25)
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(issuelabelreturndate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonissueregistersearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonissueregistersearchActionPerformed

        try {
            rs = bs.get_Books_by_Accession_no_view(issuegetaccessionnocombo.getSelectedItem().toString());
            if (rs.next()) {

                txtissueregisterisbn.setText(rs.getString(1));
                //   txtissueregisteraccessionno.setText(rs.getString(2));
                txtissueregistertitle.setText(rs.getString(3));
                txtissueregisterauthor.setText(rs.getString(4));
                txtissueregisterpublisher.setText(rs.getString(5));
                txtissueregisteredition.setText(rs.getString(6));
                txtissueregisterstatus.setText(rs.getString(7));

                if (rs.getBytes(8).equals("")); else {
                    byte[] coverpage = rs.getBytes(8);

                    FileOutputStream fo = new FileOutputStream("d://temp.jpg");
                    fo.write(coverpage);
                    fo.close();
                    imageissueregisterpanel.setImage("d://temp.jpg");
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Book Image not available !");
        }
        issueButtonIssueBook.setEnabled(true);

    }//GEN-LAST:event_buttonissueregistersearchActionPerformed

    private void issuegetaccessionnocomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuegetaccessionnocomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issuegetaccessionnocomboActionPerformed

    private void issuesearchstudentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuesearchstudentbuttonActionPerformed

        try {

            rs = st.get_students_name_totalbook_by_id(issuestudentidcombo.getSelectedItem().toString().toLowerCase().trim());
            rs.next();

            issuelabelstudentname.setText(rs.getString(1));
            issuelabeltotalbook.setText(rs.getString(2));
            issuelabelissuedate.setText(labelIssueregisterDate.getText());
            cl.add(cl.DATE, 7);
            issuelabelreturndate.setText(cl.get(cl.YEAR) + "-" + (cl.get(cl.MONTH) + 1) + "-" + cl.get(cl.DATE));

        } catch (Exception ex) {;
        }
        issueButtonIssueBook.setEnabled(true);
    }//GEN-LAST:event_issuesearchstudentbuttonActionPerformed

    private void issueButtonIssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueButtonIssueBookActionPerformed

        if (txtissueregisterstatus.getText().equalsIgnoreCase("Issue") || issuelabeltotalbook.getText().equalsIgnoreCase("5")) {
            issueButtonIssueBook.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Book Can't issue ! ");
        } else {

            try {

                int temp1 = bs.set_issue_register(labelissueregisterID.getText(), issuelabelissuedate.getText(), issuestudentidcombo.getSelectedItem().toString(), issuegetaccessionnocombo.getSelectedItem().toString(), issuelabelreturndate.getText());

                int temp2 = st.update_students(issuestudentidcombo.getSelectedItem().toString(), (Integer.parseInt(issuelabeltotalbook.getText()) + 1));

                int temp3 = bs.update_book_details(issuegetaccessionnocombo.getSelectedItem().toString(), "Issue");

                if (temp1 == 1 && temp2 == 1 && temp3 == 1) {
                    txtissueregisterstatus.setText("Issue");
                    issuelabeltotalbook.setText((Integer.parseInt(issuelabeltotalbook.getText()) + 1) + "");

                    JOptionPane.showMessageDialog(null, "Book Issued for " + issuelabelstudentname.getText());
                    
                    this.dispose();
                    new MainFrame().setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Book not Issued for " + issuelabelstudentname.getText());
                }
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    }//GEN-LAST:event_issueButtonIssueBookActionPerformed

    private void issuebuttonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebuttonexitActionPerformed
        this.dispose();
        new MainFrame().setVisible(true);

    }//GEN-LAST:event_issuebuttonexitActionPerformed

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
            java.util.logging.Logger.getLogger(IssueRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueRegister().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonissueregistersearch;
    private librarymanagement.Browse imageissueregisterpanel;
    private javax.swing.JButton issueButtonIssueBook;
    private javax.swing.JButton issuebuttonexit;
    private javax.swing.JComboBox issuegetaccessionnocombo;
    private javax.swing.JLabel issuelabelissuedate;
    private javax.swing.JLabel issuelabelreturndate;
    private javax.swing.JLabel issuelabelstudentname;
    private javax.swing.JLabel issuelabeltotalbook;
    private javax.swing.JButton issuesearchstudentbutton;
    private javax.swing.JComboBox issuestudentidcombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel labelIssueregisterDate;
    private javax.swing.JLabel labelissueregisterID;
    private librarymanagement.SetImage setImage1;
    private librarymanagement.SetImage setImage2;
    private javax.swing.JLabel txtissueregisterauthor;
    private javax.swing.JLabel txtissueregisteredition;
    private javax.swing.JLabel txtissueregisterisbn;
    private javax.swing.JLabel txtissueregisterpublisher;
    private javax.swing.JLabel txtissueregisterstatus;
    private javax.swing.JLabel txtissueregistertitle;
    // End of variables declaration//GEN-END:variables
}
