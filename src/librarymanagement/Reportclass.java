package librarymanagement;

import java.sql.*;
import javax.swing.*;
import java.io.*;
import java.awt.Graphics;
import java.util.Calendar;

public class Reportclass {

    Connection cn;
    Calendar cl;
    String date;
    ResultSet rs;

    public Reportclass() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement", "root", "");

        cl = Calendar.getInstance();
        date = cl.get(cl.YEAR) + "-" + (cl.get(cl.MONTH) + 1) + "-" + cl.get(cl.DATE);
    }

    public ResultSet get_dailyissue() throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT s_id,S_name,Accession_no,b_title,expected_return_date FROM student_issueregister WHERE issuing_date = ?");

        ps.setString(1, date);
        rs = ps.executeQuery();

        return rs;
    }

    public ResultSet get_dailyreturn() throws Exception {
        PreparedStatement ps = cn.prepareStatement("SELECT s_id,S_name,Accession_no,b_title,over_days,fine_paid,fine_days FROM student_returnregister WHERE return_date = ?");
        ps.setString(1, date);
        rs = ps.executeQuery();

        return rs;
    }

    public ResultSet get_total_fine() throws Exception {


        Statement st = cn.createStatement();
        rs = st.executeQuery("SELECT SUM(Fine_days) FROM student_returnregister");

        return rs;
    }
}
