import java.sql.*;

public class Q1 {

        public static void main(String[] args) { //throws ClassNotFoundException,SQLException
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
                System.out.println("connection success");
            }
            catch (Exception e)
            {
                System.out.println(e);
                System.out.println("Connection failed");
            }
        }
    }


