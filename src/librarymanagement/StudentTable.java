package librarymanagement;

import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentTable extends javax.swing.JFrame {

    String[] header = {"Student id", "Student name", "Gender", "Date of birth", "Address", "City", "State", "phonenumber", "Email id", "TotalBooks", "Expiary date"};
    DefaultTableModel studenttable = new DefaultTableModel(header, 0);
    DefaultTableModel studentdelete = new DefaultTableModel(header, 0);
    String[] rows;
    StudentSearch stu_Search;
    byte[] studentimagearray;
    String fname;
    int selectedrow;

    public StudentTable() {

        try {

            stu_Search = new StudentSearch();
            ResultSet rs = stu_Search.get_students();

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
                studenttable.addRow(rows);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllStudenttable = new javax.swing.JTable();
        showstudentimagepanel = new librarymanagement.Browse();
        studentsexitbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        setImage1 = new librarymanagement.SetImage();
        setImage2 = new librarymanagement.SetImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtstudentid = new javax.swing.JTextField();
        txtstudentname = new javax.swing.JTextField();
        txtstudentphone = new javax.swing.JTextField();
        txtstudentemailid = new javax.swing.JTextField();
        Addstudentdata = new javax.swing.JButton();
        setStudentimage = new javax.swing.JButton();
        studentimage = new librarymanagement.Browse();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtstudentaddress = new javax.swing.JTextArea();
        txtstudentdatechoser = new datechooser.beans.DateChooserCombo();
        txtstudentexpiarydatechoser = new datechooser.beans.DateChooserCombo();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txttotlalbook = new javax.swing.JComboBox();
        txtstudentstate1 = new javax.swing.JComboBox();
        txtstudentcity1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        setImage3 = new librarymanagement.SetImage();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        deletegetstudentid = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentdeletetable = new javax.swing.JTable();
        deleteclickhere = new javax.swing.JToggleButton();
        Studentdeleteperformed = new javax.swing.JButton();
        studentupdateperformed = new javax.swing.JButton();
        Studentupdatedeleteimagepanel = new librarymanagement.Browse();
        studentdelteupdatechangephoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Informations");
        setMaximumSize(new java.awt.Dimension(1360, 700));
        setMinimumSize(new java.awt.Dimension(1360, 700));
        setPreferredSize(new java.awt.Dimension(1360, 700));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1365, 700));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(1360, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1360, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 700));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setMaximumSize(new java.awt.Dimension(1360, 758));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1360, 758));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1360, 758));

        AllStudenttable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AllStudenttable.setModel(studenttable);
        AllStudenttable.setMaximumSize(new java.awt.Dimension(1360, 700));
        AllStudenttable.setMinimumSize(new java.awt.Dimension(1360, 700));
        AllStudenttable.setPreferredSize(new java.awt.Dimension(1360, 700));
        AllStudenttable.setRowHeight(30);
        AllStudenttable.setRowMargin(3);
        AllStudenttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllStudenttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AllStudenttable);

        javax.swing.GroupLayout showstudentimagepanelLayout = new javax.swing.GroupLayout(showstudentimagepanel);
        showstudentimagepanel.setLayout(showstudentimagepanelLayout);
        showstudentimagepanelLayout.setHorizontalGroup(
            showstudentimagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        showstudentimagepanelLayout.setVerticalGroup(
            showstudentimagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        studentsexitbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentsexitbutton.setText("Exit");
        studentsexitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsexitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showstudentimagepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentsexitbutton))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(showstudentimagepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(studentsexitbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Students", jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(1360, 700));
        jPanel2.setMinimumSize(new java.awt.Dimension(1360, 700));
        jPanel2.setPreferredSize(new java.awt.Dimension(1360, 700));

        setImage2.setMaximumSize(new java.awt.Dimension(1360, 758));
        setImage2.setMinimumSize(new java.awt.Dimension(1360, 758));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Enter Student id : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Enter Student state : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Enter Student name : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Enter phonenumber : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Enter Student Gender : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Enter email id :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Enter Date of birth :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Enter total books :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Enter student Addrees :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Enter expiary date : ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Enter Student city");

        txtstudentid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtstudentname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtstudentphone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtstudentphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentphoneActionPerformed(evt);
            }
        });

        txtstudentemailid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtstudentemailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentemailidActionPerformed(evt);
            }
        });

        Addstudentdata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Addstudentdata.setText("Save");
        Addstudentdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddstudentdataActionPerformed(evt);
            }
        });

        setStudentimage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setStudentimage.setText("Browse");
        setStudentimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStudentimageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentimageLayout = new javax.swing.GroupLayout(studentimage);
        studentimage.setLayout(studentimageLayout);
        studentimageLayout.setHorizontalGroup(
            studentimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        studentimageLayout.setVerticalGroup(
            studentimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        txtstudentaddress.setColumns(20);
        txtstudentaddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtstudentaddress.setRows(5);
        jScrollPane2.setViewportView(txtstudentaddress);

        txtstudentdatechoser.setCalendarPreferredSize(new java.awt.Dimension(351, 241));
        txtstudentdatechoser.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16));

        txtstudentexpiarydatechoser.setCalendarPreferredSize(new java.awt.Dimension(363, 237));
        txtstudentexpiarydatechoser.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setText("Female");

        txttotlalbook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttotlalbook.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        txtstudentstate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtstudentstate1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MP", "UP", "AP" }));
        txtstudentstate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentstate1ActionPerformed(evt);
            }
        });

        txtstudentcity1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout setImage2Layout = new javax.swing.GroupLayout(setImage2);
        setImage2.setLayout(setImage2Layout);
        setImage2Layout.setHorizontalGroup(
            setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage2Layout.createSequentialGroup()
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, setImage2Layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(Addstudentdata, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setImage2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(txtstudentdatechoser, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtstudentstate1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(setImage2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtstudentname, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(setImage2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(193, 193, 193)
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttotlalbook, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtstudentemailid))
                    .addGroup(setImage2Layout.createSequentialGroup()
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstudentcity1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstudentphone, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(setImage2Layout.createSequentialGroup()
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(setImage2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(studentimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setStudentimage)
                            .addComponent(txtstudentexpiarydatechoser, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))))
                .addGap(256, 256, 256))
        );
        setImage2Layout.setVerticalGroup(
            setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstudentcity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtstudentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtstudentphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtstudentemailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(37, 37, 37)
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txttotlalbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstudentdatechoser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage2Layout.createSequentialGroup()
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setImage2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel9))
                            .addGroup(setImage2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                    .addComponent(txtstudentexpiarydatechoser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setImage2Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(setStudentimage))
                            .addGroup(setImage2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(studentimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(setImage2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(setImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtstudentstate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addComponent(Addstudentdata, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout setImage1Layout = new javax.swing.GroupLayout(setImage1);
        setImage1.setLayout(setImage1Layout);
        setImage1Layout.setHorizontalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Add new Student", jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(1360, 700));
        jPanel3.setMinimumSize(new java.awt.Dimension(1360, 700));
        jPanel3.setPreferredSize(new java.awt.Dimension(1360, 700));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Enter Student id : ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Update or Delete Student Information");

        studentdeletetable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentdeletetable.setModel(studentdelete);
        studentdeletetable.setRowHeight(30);
        studentdeletetable.setRowMargin(3);
        studentdeletetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentdeletetableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(studentdeletetable);

        deleteclickhere.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteclickhere.setText("Click here");
        deleteclickhere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteclickhereActionPerformed(evt);
            }
        });

        Studentdeleteperformed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Studentdeleteperformed.setText("DELETE");
        Studentdeleteperformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentdeleteperformedActionPerformed(evt);
            }
        });

        studentupdateperformed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentupdateperformed.setText("Update");
        studentupdateperformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentupdateperformedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StudentupdatedeleteimagepanelLayout = new javax.swing.GroupLayout(Studentupdatedeleteimagepanel);
        Studentupdatedeleteimagepanel.setLayout(StudentupdatedeleteimagepanelLayout);
        StudentupdatedeleteimagepanelLayout.setHorizontalGroup(
            StudentupdatedeleteimagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        StudentupdatedeleteimagepanelLayout.setVerticalGroup(
            StudentupdatedeleteimagepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        studentdelteupdatechangephoto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentdelteupdatechangephoto.setText("Change photo");
        studentdelteupdatechangephoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentdelteupdatechangephotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setImage3Layout = new javax.swing.GroupLayout(setImage3);
        setImage3.setLayout(setImage3Layout);
        setImage3Layout.setHorizontalGroup(
            setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage3Layout.createSequentialGroup()
                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(deletegetstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(deleteclickhere))
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Studentdeleteperformed)
                        .addGap(40, 40, 40)
                        .addComponent(studentupdateperformed))
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentdelteupdatechangephoto)
                            .addComponent(Studentupdatedeleteimagepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setImage3Layout.setVerticalGroup(
            setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deletegetstudentid, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(deleteclickhere)))
                .addGap(18, 18, 18)
                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addComponent(Studentupdatedeleteimagepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(studentdelteupdatechangephoto)))
                .addGap(57, 57, 57)
                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Studentdeleteperformed)
                    .addComponent(studentupdateperformed))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 1360, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Update or Delete Student information", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setStudentimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setStudentimageActionPerformed

        try {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            fname = fc.getSelectedFile().toString();
            studentimage.setImage(fname);
            FileInputStream fi = new FileInputStream(fname);
            studentimagearray = new byte[fi.available() + 1];
            fi.read(studentimagearray);
            fi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "not image choose !");
        }
    }//GEN-LAST:event_setStudentimageActionPerformed

    private void AddstudentdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddstudentdataActionPerformed

        try {
            String gender;
            Calendar cl = txtstudentdatechoser.getSelectedDate();
            String dateDOB = cl.get(cl.YEAR) + "-" + (cl.get(cl.MONTH) + 1) + "-" + cl.get(cl.DATE);
            Calendar cl1 = txtstudentexpiarydatechoser.getSelectedDate();
            String dateexpiary = cl.get(cl.YEAR) + "-" + (cl.get(cl.MONTH) + 1) + "-" + cl.get(cl.DATE);
            gender = jRadioButton1.isSelected() ? jRadioButton1.getText() : jRadioButton2.getText();

            int x = stu_Search.set_students(txtstudentid.getText(), txtstudentname.getText(), gender, dateDOB, txtstudentaddress.getText(), txtstudentcity1.getSelectedItem().toString(), txtstudentstate1.getSelectedItem().toString(), txtstudentphone.getText(), txtstudentemailid.getText(), Integer.parseInt(txttotlalbook.getSelectedItem().toString()), dateexpiary, studentimagearray);
            if (x > 0) {
                rows = new String[11];

                rows[0] = txtstudentid.getText();
                rows[1] = txtstudentname.getText();
                rows[2] = gender;
                rows[3] = dateDOB;
                rows[4] = txtstudentaddress.getText();
                rows[5] = txtstudentcity1.getSelectedItem().toString();
                rows[6] = txtstudentstate1.getSelectedItem().toString();
                rows[7] = txtstudentphone.getText();
                rows[8] = txtstudentemailid.getText();
                rows[9] = txttotlalbook.getSelectedItem().toString();
                rows[10] = dateexpiary;

                studenttable.addRow(rows);
            }
            JOptionPane.showMessageDialog(null, "Student information is save in database !");
            resetStudentFunction();
            studentimage.setImage("D:\\IconLibrary\\setim.jpg");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Student information is not save in database !");
        }
    }//GEN-LAST:event_AddstudentdataActionPerformed

    private void txtstudentemailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentemailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudentemailidActionPerformed

    private void txtstudentphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudentphoneActionPerformed

    private void AllStudenttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllStudenttableMouseClicked
        Point p = evt.getPoint();
        selectedrow = AllStudenttable.rowAtPoint(p);

        String S_id = AllStudenttable.getValueAt(selectedrow, 0).toString();
        try {
            ResultSet rs = stu_Search.setStudentimage(S_id);
            if (rs.next()) {
                studentimagearray = rs.getBytes(1);
            }
            FileOutputStream fo = new FileOutputStream("d://temp.jpg");
            fo.write(studentimagearray);
            fo.close();
            showstudentimagepanel.setImage("d://temp.jpg");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_AllStudenttableMouseClicked

    private void deleteclickhereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteclickhereActionPerformed
        try {
            ResultSet rs = stu_Search.get_students_by_id(deletegetstudentid.getText().toLowerCase());

            if (rs.next()) {

                rows = new String[11];
                for (int i = 0; i < 11; i++) {
                    rows[i] = rs.getString(i + 1);
                }

                studentdelete.addRow(rows);
            } else {
                JOptionPane.showMessageDialog(null, "no student found of this id !");
                deletegetstudentid.setText(null);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Books informations not deleted by search book title !");
        }
    }//GEN-LAST:event_deleteclickhereActionPerformed

    private void studentdeletetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentdeletetableMouseClicked

        Point p = evt.getPoint();
        selectedrow = studentdeletetable.rowAtPoint(p);

        String S_id = studentdeletetable.getValueAt(selectedrow, 0).toString();
        try {
            ResultSet rs = stu_Search.setStudentimage(S_id);
            if (rs.next()) {
                studentimagearray = rs.getBytes(1);
            }
            FileOutputStream fo = new FileOutputStream("d://temp.jpg");
            fo.write(studentimagearray);
            fo.close();
            Studentupdatedeleteimagepanel.setImage("d://temp.jpg");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_studentdeletetableMouseClicked

    private void StudentdeleteperformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentdeleteperformedActionPerformed

        deletegetstudentid.setText(null);
        try {
            String s_id = studentdeletetable.getValueAt(selectedrow, 0).toString();
            int check = stu_Search.delete_students(s_id);
            if (check > 0) {
                studentdelete.removeRow(selectedrow);
                JOptionPane.showMessageDialog(null, "Student informations deleted successfully !");
            } else {
                JOptionPane.showMessageDialog(null, "Student informations not deleted !");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_StudentdeleteperformedActionPerformed

    private void studentupdateperformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentupdateperformedActionPerformed

        try {
            int temp = stu_Search.update_students(studentdelete.getValueAt(selectedrow, 0).toString(), studentdelete.getValueAt(selectedrow, 1).toString(), studentdelete.getValueAt(selectedrow, 2).toString(), studentdelete.getValueAt(selectedrow, 3).toString(), studentdelete.getValueAt(selectedrow, 4).toString(), studentdelete.getValueAt(selectedrow, 5).toString(), studentdelete.getValueAt(selectedrow, 6).toString(), studentdelete.getValueAt(selectedrow, 7).toString(), studentdelete.getValueAt(selectedrow, 8).toString(), Integer.parseInt(studentdelete.getValueAt(selectedrow, 9).toString()), studentdelete.getValueAt(selectedrow, 10).toString(), studentimagearray);

            if (temp > 0) {
                JOptionPane.showMessageDialog(null, "Student information updated !");
                studentdelete.removeRow(selectedrow);
                Studentupdatedeleteimagepanel.setImage("D:\\IconLibrary\\setim.jpg");
                deletegetstudentid.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "Student information not updated !");
                deletegetstudentid.setText(null);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_studentupdateperformedActionPerformed

    private void studentdelteupdatechangephotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentdelteupdatechangephotoActionPerformed
        try {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            fname = fc.getSelectedFile().toString();
            Studentupdatedeleteimagepanel.setImage(fname);
            FileInputStream fi = new FileInputStream(fname);
            studentimagearray = new byte[fi.available() + 1];
            fi.read(studentimagearray);
            fi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "not image choose !");
        }
    }//GEN-LAST:event_studentdelteupdatechangephotoActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        /*  int x= jTabbedPane1.getSelectedIndex();
         if(x==0)
         {
         DefaultTableModel studenttable = new DefaultTableModel(header, 0);
           
         try {

         stu_Search = new StudentSearch();
         ResultSet rs = stu_Search.get_students();

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
         studenttable.addRow(rows);
         }
         } catch (Exception ex) {
         JOptionPane.showMessageDialog(null, ex.getMessage());
         }
         }
         AllStudenttable.setModel(studenttable);*/
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void txtstudentstate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentstate1ActionPerformed

        String[] mp = {"Bhopal", "Indore", "Shivpuri", "Gwalior", "Guna", "Murena", "Ashoknagar", ""};
        String[] up = {"Agra", "Jhasi"};
        String[] ap = {"Hydrabad"};
        String state = txtstudentstate1.getSelectedItem().toString();
        if (state.equalsIgnoreCase("mp")) {
            for (String temp : mp) {
                txtstudentcity1.addItem(temp);
            }
            ;
        } else if (state.equalsIgnoreCase("up")) {
            for (String temp : up) {
                txtstudentcity1.addItem(temp);
            }
        } else {
            for (String temp : ap) {
                txtstudentcity1.addItem(temp);
            }
        }
    }//GEN-LAST:event_txtstudentstate1ActionPerformed

    private void studentsexitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsexitbuttonActionPerformed
        this.dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_studentsexitbuttonActionPerformed

    public void resetStudentFunction() {

        txtstudentid.setText(null);
        txtstudentname.setText(null);
        txtstudentaddress.setText(null);
        // city.setText(null);
        //cb1.setText(null);
        txtstudentphone.setText(null);
        txtstudentemailid.setText(null);

    }

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
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentTable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addstudentdata;
    private javax.swing.JTable AllStudenttable;
    private javax.swing.JButton Studentdeleteperformed;
    private librarymanagement.Browse Studentupdatedeleteimagepanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton deleteclickhere;
    private javax.swing.JTextField deletegetstudentid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private librarymanagement.SetImage setImage1;
    private librarymanagement.SetImage setImage2;
    private librarymanagement.SetImage setImage3;
    private javax.swing.JButton setStudentimage;
    private librarymanagement.Browse showstudentimagepanel;
    private javax.swing.JTable studentdeletetable;
    private javax.swing.JButton studentdelteupdatechangephoto;
    private librarymanagement.Browse studentimage;
    private javax.swing.JButton studentsexitbutton;
    private javax.swing.JButton studentupdateperformed;
    private javax.swing.JTextArea txtstudentaddress;
    private javax.swing.JComboBox txtstudentcity1;
    private datechooser.beans.DateChooserCombo txtstudentdatechoser;
    private javax.swing.JTextField txtstudentemailid;
    private datechooser.beans.DateChooserCombo txtstudentexpiarydatechoser;
    private javax.swing.JTextField txtstudentid;
    private javax.swing.JTextField txtstudentname;
    private javax.swing.JTextField txtstudentphone;
    private javax.swing.JComboBox txtstudentstate1;
    private javax.swing.JComboBox txttotlalbook;
    // End of variables declaration//GEN-END:variables
}
