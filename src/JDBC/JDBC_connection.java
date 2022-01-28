package JDBC;

import java.sql.*;

public class JDBC_connection {

    public static void main(String[] args) { //throws ClassNotFoundException,SQLException
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://:3306/sectiongdb","root","root");
            System.out.println("connection success");
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Connection failed");
        }
    }
}
