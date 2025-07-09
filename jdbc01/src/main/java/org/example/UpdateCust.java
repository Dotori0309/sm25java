package org.example;

import java.sql.*;

public class UpdateCust {
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
        // 3. SQL 문장 업데이트
        String updateSql = "UPDATE cust SET cust_name = ? WHERE cust_id = ?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = conn.prepareStatement(updateSql);
            pstmt.setString(1, "id011");
            pstmt.setString(2, "pwd11");
            int result = pstmt.executeUpdate();
            System.out.println("result = " + result);
        } catch (SQLException e) {
            System.out.println("Fail to update cust");
            e.printStackTrace();
        } finally {  // 5. Close
            if (rs != null) {
                try {
                    conn.close();
                } catch (SQLException ignored) {
                }
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                    }
                }
            }
        }
    }
}
