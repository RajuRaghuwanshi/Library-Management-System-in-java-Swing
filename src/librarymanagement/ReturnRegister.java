package librarymanagement;

import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class ReturnRegister extends javax.swing.JFrame {

    BooksSearch bs;
    StudentSearch st;
    ResultSet rs, rs1, rs2;
    Calendar cl;

    public ReturnRegister() {

        cl = Calendar.getInstance();
        try {
            bs = new BooksSearch();
            st = new StudentSearch();
            initComponents();

            ReturnlabelregisterDate.setText(cl.get(cl.YEAR) + "-" + (cl.get(cl.MONTH) + 1) + "-" + cl.get(cl.DATE));
            returnlabelreturnid.setText(cl.getTime().hashCode() + "");
            rs = bs.get_all_accession_no();

            while (rs.next()) {
                returngetaccessionnocombo.addItem(rs.getString(1));
            }
        } catch (Exception ex) {;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setImage3 = new librarymanagement.SetImage();
        jLabel1 = new javax.swing.JLabel();
        returngetaccessionnocombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ReturnlabelregisterDate = new javax.swing.JLabel();
        labelissueregisterID = new javax.swing.JLabel();
        buttonreturnregistersearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        returnlabelreturnid = new javax.swing.JLabel();
        returnbuttonreturn = new javax.swing.JButton();
        returnbuttonexit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        returnlabelbookno = new javax.swing.JLabel();
        returnlabelbooktitle = new javax.swing.JLabel();
        returnlabelauthor = new javax.swing.JLabel();
        returnlabelpublisher = new javax.swing.JLabel();
        returnlabelbookedition = new javax.swing.JLabel();
        returnlabestudentid = new javax.swing.JLabel();
        returnlabestudentname = new javax.swing.JLabel();
        returnlabestudenttotalbook = new javax.swing.JLabel();
        returnlabedateissue = new javax.swing.JLabel();
        returnlabedatereturn = new javax.swing.JLabel();
        returnlabeoverdays = new javax.swing.JLabel();
        returnlabefine = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        returnlabeindicator = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        returnlabelissueid = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        returnlabefinepaid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        setImage3.setPreferredSize(new java.awt.Dimension(1350, 700));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Return Register");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        returngetaccessionnocombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returngetaccessionnocombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returngetaccessionnocomboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Date:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Select Accession number :");

        ReturnlabelregisterDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ReturnlabelregisterDate.setForeground(new java.awt.Color(255, 255, 255));

        labelissueregisterID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelissueregisterID.setForeground(new java.awt.Color(255, 255, 255));

        buttonreturnregistersearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonreturnregistersearch.setText("Search");
        buttonreturnregistersearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonreturnregistersearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Return Id :");

        returnlabelreturnid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabelreturnid.setForeground(new java.awt.Color(255, 255, 255));

        returnbuttonreturn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnbuttonreturn.setText("Return");
        returnbuttonreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonreturnActionPerformed(evt);
            }
        });

        returnbuttonexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnbuttonexit.setText("Exit");
        returnbuttonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonexitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Student ID :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Student Name :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Total Books Issued :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Book No(ISBN) :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Book Title :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Author :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Publisher :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Edition :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Date of issue :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Expected return date :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Over Days :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Fine :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Fine Paid :");

        returnlabelbookno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabelbookno.setForeground(new java.awt.Color(255, 255, 255));

        returnlabelbooktitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabelbooktitle.setForeground(new java.awt.Color(255, 255, 255));

        returnlabelauthor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabelauthor.setForeground(new java.awt.Color(255, 255, 255));

        returnlabelpublisher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabelpublisher.setForeground(new java.awt.Color(255, 255, 255));

        returnlabelbookedition.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabelbookedition.setForeground(new java.awt.Color(255, 255, 255));

        returnlabestudentid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabestudentid.setForeground(new java.awt.Color(255, 255, 255));

        returnlabestudentname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabestudentname.setForeground(new java.awt.Color(255, 255, 255));

        returnlabestudenttotalbook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabestudenttotalbook.setForeground(new java.awt.Color(255, 255, 255));

        returnlabedateissue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabedateissue.setForeground(new java.awt.Color(255, 255, 255));

        returnlabedatereturn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabedatereturn.setForeground(new java.awt.Color(255, 255, 255));

        returnlabeoverdays.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabeoverdays.setForeground(new java.awt.Color(255, 255, 255));

        returnlabefine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabefine.setForeground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Indicator :");

        returnlabeindicator.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabeindicator.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Issue ID :");

        returnlabelissueid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        returnlabelissueid.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setText("@5 Per/Days");

        returnlabefinepaid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        returnlabefinepaid.setText("No");

        javax.swing.GroupLayout setImage3Layout = new javax.swing.GroupLayout(setImage3);
        setImage3.setLayout(setImage3Layout);
        setImage3Layout.setHorizontalGroup(
            setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(returnlabelreturnid, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1115, 1115, 1115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage3Layout.createSequentialGroup()
                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(setImage3Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(setImage3Layout.createSequentialGroup()
                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(setImage3Layout.createSequentialGroup()
                                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(returnlabelpublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(returnlabelbookedition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(returnlabelauthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(returnlabelbookno, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(setImage3Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(returnlabelbooktitle, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(setImage3Layout.createSequentialGroup()
                                                .addComponent(returnlabestudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage3Layout.createSequentialGroup()
                                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(returnlabeindicator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(returnlabestudentname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(returnlabestudenttotalbook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(129, 129, 129)
                                                .addComponent(jLabel14)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(returnlabedateissue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(returnlabedatereturn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(setImage3Layout.createSequentialGroup()
                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(returnlabeoverdays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(returnlabefinepaid, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(returnlabefine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)))
                        .addGap(98, 98, 98))))
            .addGroup(setImage3Layout.createSequentialGroup()
                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addGap(571, 571, 571)
                        .addComponent(jLabel1))
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addGap(564, 564, 564)
                        .addComponent(labelissueregisterID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(returnbuttonreturn)
                        .addGap(194, 194, 194)
                        .addComponent(returnbuttonexit))
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReturnlabelregisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(setImage3Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(returnlabelissueid, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(setImage3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returngetaccessionnocombo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(buttonreturnregistersearch)))
                .addContainerGap())
        );
        setImage3Layout.setVerticalGroup(
            setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setImage3Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(labelissueregisterID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(returnlabelreturnid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95)
                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(returnlabelbookno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnlabestudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnlabedateissue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setImage3Layout.createSequentialGroup()
                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(setImage3Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(returnlabestudentname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(returnlabelbooktitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56)))
                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel15)
                                    .addComponent(returnlabelauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(returnlabeoverdays, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(setImage3Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(returnlabedatereturn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(returnlabestudenttotalbook, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(setImage3Layout.createSequentialGroup()
                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(returnlabelpublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(returnlabeindicator, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(setImage3Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17)
                                            .addComponent(returnlabefinepaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(returnlabelbookedition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(49, 49, 49)
                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(returnbuttonreturn)
                                    .addComponent(returnbuttonexit))
                                .addGap(94, 94, 94))
                            .addGroup(setImage3Layout.createSequentialGroup()
                                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(returnlabefine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(249, 249, 249))))
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addComponent(ReturnlabelregisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(returngetaccessionnocombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonreturnregistersearch))
                        .addGap(42, 42, 42)
                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(returnlabelissueid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(setImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(setImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonreturnregistersearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonreturnregistersearchActionPerformed

        try {
            rs = bs.get_book_return_register(returngetaccessionnocombo.getSelectedItem().toString());
            rs1 = bs.get_issue_register_details(returngetaccessionnocombo.getSelectedItem().toString());

            rs.next();
            rs1.next();
            rs2 = st.get_students_name_totalbook_by_id(rs1.getString(3).toLowerCase().trim());

            rs2.next();
            returnlabelbookno.setText(rs.getString(1));
            returnlabelbooktitle.setText(rs.getString(2));
            returnlabelauthor.setText(rs.getString(3));
            returnlabelpublisher.setText(rs.getString(4));
            returnlabelbookedition.setText(rs.getString(5));

            returnlabelissueid.setText(rs1.getString(1));
            returnlabedateissue.setText(rs1.getString(2));
            returnlabestudentid.setText(rs1.getString(3));
            returnlabedatereturn.setText(rs1.getString(4));
            returnlabeindicator.setText(rs1.getString(5));
            
            returnlabestudentname.setText(rs2.getString(1));
            returnlabestudenttotalbook.setText(rs2.getString(2));

            int temp = bs.get_overdays(returngetaccessionnocombo.getSelectedItem().toString());
            returnlabeoverdays.setText(temp+"");
            if(temp>0)
                returnlabefine.setText(temp*5+"");
            else
                returnlabefine.setText(0+"");
            
        } catch (Exception ex) {;
        }
    }//GEN-LAST:event_buttonreturnregistersearchActionPerformed

    private void returnbuttonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonexitActionPerformed

        this.dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_returnbuttonexitActionPerformed

    private void returngetaccessionnocomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returngetaccessionnocomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returngetaccessionnocomboActionPerformed

    private void returnbuttonreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonreturnActionPerformed
  
        try {
        int temp1 = bs.set_return_register(returnlabelreturnid.getText(),returnlabelissueid.getText(),ReturnlabelregisterDate.getText(),returnlabestudentid.getText(),returngetaccessionnocombo.getSelectedItem().toString(),Integer.parseInt(returnlabeoverdays.getText()), returnlabefinepaid.getText(),Integer.parseInt(returnlabefine.getText()));
        int temp2 = bs.update_book_details(returngetaccessionnocombo.getSelectedItem().toString(),"Available");
        int temp3 = bs.update_Return_register(returngetaccessionnocombo.getSelectedItem().toString(),"Return");
        int temp4 = st.update_students(returnlabestudentid.getText(),Integer.parseInt(returnlabestudenttotalbook.getText())-1);
        if(temp1==1&&temp2==1&&temp3==1&&temp4==1) {
         JOptionPane.showMessageDialog(null,"Book return by "+returnlabestudentname.getText()+" Successfully !");
      //   returnlabestudenttotalbook.setText(Integer.parseInt(returnlabestudenttotalbook.getText())-1+"");
        // returnlabeindicator.setText("Return");
         this.dispose();
         new MainFrame().setVisible(true);
        } else {
        
           JOptionPane.showMessageDialog(null,"Book not return Successfully !"); 
        }
        }catch(Exception ex){;}
    }//GEN-LAST:event_returnbuttonreturnActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnRegister().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReturnlabelregisterDate;
    private javax.swing.JButton buttonreturnregistersearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelissueregisterID;
    private javax.swing.JButton returnbuttonexit;
    private javax.swing.JButton returnbuttonreturn;
    private javax.swing.JComboBox returngetaccessionnocombo;
    private javax.swing.JLabel returnlabedateissue;
    private javax.swing.JLabel returnlabedatereturn;
    private javax.swing.JLabel returnlabefine;
    private javax.swing.JTextField returnlabefinepaid;
    private javax.swing.JLabel returnlabeindicator;
    private javax.swing.JLabel returnlabelauthor;
    private javax.swing.JLabel returnlabelbookedition;
    private javax.swing.JLabel returnlabelbookno;
    private javax.swing.JLabel returnlabelbooktitle;
    private javax.swing.JLabel returnlabelissueid;
    private javax.swing.JLabel returnlabelpublisher;
    private javax.swing.JLabel returnlabelreturnid;
    private javax.swing.JLabel returnlabeoverdays;
    private javax.swing.JLabel returnlabestudentid;
    private javax.swing.JLabel returnlabestudentname;
    private javax.swing.JLabel returnlabestudenttotalbook;
    private librarymanagement.SetImage setImage3;
    // End of variables declaration//GEN-END:variables
}
