package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCust {
    public static void main(String[] args) {
        // 1. MySQL Driver Loading ...
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found");
            throw new RuntimeException(e);
        }

        // 2. Connection ...
        String url = "jdbc:mysql://localhost:3306/shopdb";
        String user = "smuser";
        String password = "1q2w3e@@";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Success");
        } catch (SQLException e) {
            System.out.println("Connection Fail");
            e.printStackTrace();
        }
        // 3. SQL 문장 생성
        String insertSql = "INSERT INTO cust VALUES (?, ?, ?, NOW(), NOW())";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(insertSql);
            pstmt.setString(1, "id22");
            pstmt.setString(2, "pwd22");
            pstmt.setString(3, "일말숙");

            // 4. SQL 문장 전송
            int result = pstmt.executeUpdate(); // 작성된 문장 SQL에 날림
            System.out.println("result = " + result);

        } catch (SQLException e) {
            System.out.println("Connection Fail");
            e.printStackTrace();
        }   finally {             // 5. Close
            if (pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
