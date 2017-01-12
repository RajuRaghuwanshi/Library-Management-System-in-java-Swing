package librarymanagement;

import java.sql.*;
import javax.swing.*;
import java.io.*;
import java.awt.Graphics;
import java.util.Calendar;

public class BooksSearch {

    Connection cn;

    public BooksSearch() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement", "root", "");
    }

    public ResultSet get_books() throws Exception {

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT B_no,B_title,Author,Publisher,Copies,category FROM Books");

        return rs;
    }

    public int set_books(String Book_no, String Book_title, String Book_Author, String Book_publisher, int no_of_copies, String category, byte[] coverpage) throws Exception {

        PreparedStatement ps = cn.prepareStatement("INSERT INTO Books(B_no, B_title, Author,publisher, copies,category,coverpage) VALUES(?,?,?,?,?,?,?)");

        ps.setString(1, Book_no);
        ps.setString(2, Book_title);
        ps.setString(3, Book_Author);
        ps.setString(4, Book_publisher);
        ps.setInt(5, no_of_copies);
        ps.setString(6, category);
        ps.setBytes(7, coverpage);

        int temp = ps.executeUpdate();

        return (temp);
    }

    public int update_books(String Book_no, String Accession_no, String Book_title, String Book_Author, String Book_publisher, int no_of_copies, String category, int edition, String bookstatus, int price, String status, byte[] coverpage) throws Exception {

        PreparedStatement ps = cn.prepareStatement("UPDATE Books SET B_title = ?,Author = ?,Publisher = ?,Copies = ?,Category = ?,coverpage=? WHERE LOWER(B_no) = ?");

        ps.setString(1, Book_title);
        ps.setString(2, Book_Author);
        ps.setString(3, Book_publisher);
        ps.setInt(4, no_of_copies);
        ps.setString(5, category);
        ps.setBytes(6, coverpage);
        ps.setString(7, Book_no.toLowerCase().toString());

        int temp1 = ps.executeUpdate();

        return (temp1);
    }

    public int delete_books(String Book_no) throws Exception {
        PreparedStatement ps = cn.prepareStatement("DELETE FROM Books WHERE LOWER(B_no) = ?");

        ps.setString(1, Book_no.toLowerCase().trim());

        int temp1 = ps.executeUpdate();

        return (temp1);
    }

    public ResultSet search_Books_by_Bno(String book_no) throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT * FROM Books WHERE LOWER(B_no) = ?");

        ps.setString(1, book_no.toLowerCase().trim());
        ResultSet rs = ps.executeQuery();

        return rs;
    }

    public ResultSet search_Books_by_title(String book_title) throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT * FROM Books WHERE LOWER(B_title) = ?");

        ps.setString(1, book_title.toLowerCase().trim());
        ResultSet rs = ps.executeQuery();

        return rs;
    }

    public ResultSet search_Books_by_Accession_no(String Accession_no) throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT * FROM Books WHERE LOWER(Accession_no) = ?");

        ps.setString(1, Accession_no.toLowerCase().trim());
        ResultSet rs = ps.executeQuery();

        return rs;
    }

    public ResultSet search_Books_by_Publisher(String pubsher) throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT * FROM Books WHERE LOWER(Publisher) = ?");

        ps.setString(1, pubsher.toLowerCase().trim());
        ResultSet rs = ps.executeQuery();

        return rs;
    }

    public ResultSet search_Books_by_author(String author) throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT * FROM Books WHERE LOWER(Author) = ?");

        ps.setString(1, author.toLowerCase().trim());
        ResultSet rs = ps.executeQuery();

        return rs;
    }

    public ResultSet search_Books_by_category(String Category) throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT * FROM Books WHERE LOWER(Category) = ?");

        ps.setString(1, Category.toLowerCase().toString());
        ResultSet rs = ps.executeQuery();

        return rs;
    }

    public ResultSet getBookImg(String bno) throws Exception {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT coverpage FROM Books where LOWER(b_no) = '" + bno.toLowerCase().trim() + "'");

        return rs;
    }

    public ResultSet get_Books_by_Bno(String book_no) throws Exception {


        PreparedStatement ps = cn.prepareStatement("SELECT * FROM Book_details WHERE LOWER(B_no) = ?");

        ps.setString(1, book_no.toLowerCase().trim());
        ResultSet rs = ps.executeQuery();

        return rs;
    }

    public int set_booksDetaits(String Book_no, String Accession_no, int edition, String book_status, int price, String status) throws Exception {

        PreparedStatement ps = cn.prepareStatement("INSERT INTO Book_details(B_no,Accession_no,Edition,BookStatus,price,status) VALUES(?,?,?,?,?,?)");

        ps.setString(1, Book_no);
        ps.setString(2, Accession_no);
        ps.setInt(3, edition);
        ps.setString(4, book_status);
        ps.setInt(5, price);
        ps.setString(6, status);

        int temp = ps.executeUpdate();

        return (temp);
    }

    public ResultSet get_Books_by_category() throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT * FROM Books ORDER BY CATEGORY ASC,B_title ASC");
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public ResultSet get_Books_by_Accession_no_view(String Accession_no) throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT * FROM Book_issue WHERE LOWER(Accession_no) = ?");

        ps.setString(1, Accession_no.toLowerCase().trim());
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    public ResultSet get_all_accession_no() throws Exception {

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT Accession_no FROM book_issue");

        return rs;
    }

    public int set_issue_register(String issue_id, String issue_date, String S_id, String accno, String expecteddate) throws Exception {

        PreparedStatement ps = cn.prepareStatement("INSERT INTO issue_register(Issue_TR_ID, Issuing_date,S_id,Accession_no,Expected_return_date) VALUES(?,?,?,?,?)");

        ps.setString(1, issue_id);
        ps.setString(2, issue_date);
        ps.setString(3, S_id);
        ps.setString(4, accno);
        ps.setString(5, expecteddate);

        int temp = ps.executeUpdate();

        return (temp);
    }

    public int update_book_details(String Accession_no, String status) throws Exception {

        PreparedStatement ps = cn.prepareStatement("UPDATE Book_details SET status = ? WHERE LOWER(Accession_no) = ?");

        ps.setString(1, status);
        ps.setString(2, Accession_no);

        int temp1 = ps.executeUpdate();

        return (temp1);
    }

    public ResultSet get_book_return_register(String accno) throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT b_no,b_title,author,publisher,edition FROM Book_issue WHERE LOWER(Accession_no) = ?");

        ps.setString(1, accno.toLowerCase().trim());
        ResultSet rs = ps.executeQuery();

        return rs;
    }

    public ResultSet get_issue_register_details(String accno) throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT issue_TR_id,issuing_date,S_id,Expected_return_date,Indicator FROM issue_register WHERE LOWER(Accession_no) = ? AND Lower(Indicator)='not return'");

        ps.setString(1, accno.toLowerCase().trim());
        ResultSet rs = ps.executeQuery();

        return rs;
    }

    public int get_overdays(String accno) throws Exception {
        Calendar cl = Calendar.getInstance();
        String temp = cl.get(cl.YEAR) + "-" + (cl.get(cl.MONTH) + 1) + "-" + cl.get(cl.DATE);

        PreparedStatement ps = cn.prepareStatement("SELECT DATEDIFF('" + temp + "',expected_return_date) FROM issue_register WHERE LOWER(Accession_no) = ?");

        ps.setString(1, accno.toLowerCase().trim());
        ResultSet rs = ps.executeQuery();
        rs.next();

        return rs.getInt(1);

    }

    public int set_return_register(String return_TR_id, String issue_TR_ID, String Return_date, String sid, String accno, int overday, String finepaid, int fine) throws Exception {

        PreparedStatement ps = cn.prepareStatement("INSERT INTO return_register(Return_TR_ID,Issue_TR_ID,Return_Date,S_id,Accession_no,Over_days,Fine_paid,Fine_Days) VALUES(?,?,?,?,?,?,?,?)");

        ps.setString(1, return_TR_id);
        ps.setString(2, issue_TR_ID);
        ps.setString(3, Return_date);
        ps.setString(4, sid);
        ps.setString(5, accno);
        ps.setInt(6, overday);
        ps.setString(7, finepaid);
        ps.setInt(8, fine);

        int temp = ps.executeUpdate();

        return (temp);
    }

    public int update_Return_register(String Accession_no, String indi) throws Exception {

        PreparedStatement ps = cn.prepareStatement("UPDATE issue_register SET Indicator = ? WHERE LOWER(Accession_no) = ?");

        ps.setString(1, indi);
        ps.setString(2, Accession_no);

        int temp1 = ps.executeUpdate();

        return (temp1);
    }

    public int update_book_details(String Accession_no, int edition, int price, String bstatus) throws Exception {

        PreparedStatement ps = cn.prepareStatement("UPDATE Book_details SET edition =?,price=?,bookstatus = ? WHERE LOWER(Accession_no) = ?");


        ps.setInt(1, edition);
        ps.setInt(2, price);
        ps.setString(3, bstatus);
        ps.setString(4, Accession_no);

        int temp1 = ps.executeUpdate();

        return (temp1);
    }

    public ResultSet get_student_issue_info(String Accession_no) throws Exception {

        PreparedStatement ps = cn.prepareStatement("SELECT s_id,s_name,address,phonenumber,issuing_date,expected_return_date FROM student_issue_view WHERE LOWER(Accession_no) = ?");

        ps.setString(1, Accession_no.toLowerCase().trim());
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    public int update_books(String Book_no, int no_of_copies) throws Exception {

        PreparedStatement ps = cn.prepareStatement("UPDATE Books SET Copies = ? WHERE LOWER(B_no) = ?");

        ps.setInt(1, no_of_copies);

        ps.setString(2, Book_no.toLowerCase().toString());

        int temp1 = ps.executeUpdate();

        return (temp1);
    }
}
