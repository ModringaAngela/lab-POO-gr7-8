package db;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Connect {


    public static void main(String[] args) {
        try {
            String userName = "system";
            String password = "YourPassword";
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            Connection conn = DriverManager.getConnection(url, userName, password);

            //Inserting data:
            PreparedStatement pstmt = conn.prepareStatement("insert into friends (fname,lname) values ('Imed' , 'Bouch')");
            pstmt.executeUpdate();

            pstmt = conn.prepareStatement("insert into friends (fname,lname) values ('Asma' , 'Bouch')");
            pstmt.executeUpdate();

            //Searching for Data.

            pstmt = conn.prepareStatement("select * from friends");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                System.out.println(fname + "\t\t\t" + lname);
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
