package librarymanagement;

import java.sql.*;
import javax.swing.*;
import java.io.*;
import java.awt.Graphics;

public class StudentSearch {

    Connection cn;

    public StudentSearch() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement", "root", "");
    }

    public ResultSet get_students() throws Exception {

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Students");

        return rs;
    }

    public ResultSet get_students_by_id(String id) throws Exception {

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Students WHERE LOWER(S_id) = " + "'" + id.toLowerCase().trim() + "'");

        return rs;
    }

    public ResultSet get_students_name_totalbook_by_id(String id) throws Exception {

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT S_name,totalbooks FROM Students WHERE LOWER(S_id) = " + "'" + id.toLowerCase().trim() + "'");

        return rs;
    }

    public ResultSet get_students_by_name(String name) throws Exception {

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Students WHERE LOWER(S_name) = " + "'" + name.toLowerCase().trim() + "'");
        return rs;
    }

    public int set_students(String S_id, String Sname, String Gender, String DOB, String address, String city, String state, String Phonenumber, String email_id, int Total_Books, String Expiary_date, byte[] image) throws Exception {

        PreparedStatement ps = cn.prepareStatement("INSERT INTO Students(S_id,S_name,Gender,DOB,Address,city,state,Phonenumber,email_id,TotalBooks,Expiary_date,stu_pict) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");

        ps.setString(1, S_id);
        ps.setString(2, Sname);
        ps.setString(3, Gender);
        ps.setString(4, DOB);
        ps.setString(5, address);
        ps.setString(6, city);
        ps.setString(7, state);
        ps.setString(8, Phonenumber);
        ps.setString(9, email_id);
        ps.setInt(10, Total_Books);
        ps.setString(11, Expiary_date);
        ps.setBytes(12, image);

        int temp = ps.executeUpdate();

        return temp;
    }

    public int update_students(String S_id, String Sname, String Gender, String DOB, String address, String city, String state, String Phonenumber, String email_id, int Total_Books, String Expiary_date, byte[] image) throws Exception {

        PreparedStatement ps = cn.prepareStatement("Update Students SET S_name=?,Gender=?,DOB=?,Address=?,city=?,state=?,Phonenumber=?,email_id=?,TotalBooks=?,Expiary_date=?,stu_pict = ? WHERE S_id = ?");

        ps.setString(1, Sname);
        ps.setString(2, Gender);
        ps.setString(3, DOB);
        ps.setString(4, address);
        ps.setString(5, city);
        ps.setString(6, state);
        ps.setString(7, Phonenumber);
        ps.setString(8, email_id);
        ps.setInt(9, Total_Books);
        ps.setString(10, Expiary_date);
        ps.setBytes(11, image);
        ps.setString(12, S_id);

        int temp = ps.executeUpdate();

        return temp;
    }

    public int delete_students(String S_id) throws Exception {
        PreparedStatement ps = cn.prepareStatement("DELETE FROM Students WHERE LOWER(S_id) = ?");

        ps.setString(1, S_id);

        int temp = ps.executeUpdate();

        return temp;
    }

    public ResultSet setStudentimage(String S_id) throws Exception {

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT stu_pict FROM Students where LOWER(S_id)='" + S_id + "'");

        return rs;
    }

    public ResultSet setStudentname() throws Exception {

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT S_name FROM Students");

        return rs;
    }

    public ResultSet getStudent_ID() throws Exception {

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT S_id FROM Students");

        return rs;
    }

    public int update_students(String S_id, int Total_Books) throws Exception {

        PreparedStatement ps = cn.prepareStatement("Update Students SET TotalBooks=? WHERE LOWER(S_id) = ?");

        ps.setInt(1, Total_Books);
        ps.setString(2, S_id.toLowerCase().trim());

        int temp = ps.executeUpdate();

        return temp;
    }
}
