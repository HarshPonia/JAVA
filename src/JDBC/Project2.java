package JDBC;
import java.sql.*;
public class Project2{

    void insert(){

    }
    void delete(){

    }
    void update(){

    }
    void view(){

    }
    void JDBC_connection1(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sectiongDB","root","root");
        }
        catch (Exception e){

        }


    }
    public static void main(String[] args) {

        // Project2 pj = new Project2();
    }
}
