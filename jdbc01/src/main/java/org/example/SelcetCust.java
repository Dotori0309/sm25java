package org.example;

import java.sql.*;

public class SelcetCust {
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
        // 3. SQL 문장 조회
        String selectSql = "SELECT * FROM cust WHERE cust_id = ?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = conn.prepareStatement(selectSql);
            pstmt.setString(1, "id01");
            rs = pstmt.executeQuery();
            rs.next();
                // 셀레트된 결과의 명칭을 가져온다
            String cust_id = rs.getString("cust_id");
            String cust_pwd = rs.getString("cust_pwd");
            String cust_name = rs.getString("cust_name");
            Date cust_regdate = rs.getDate("cust_regdate");
            Date cust_update = rs.getDate("cust_update");
            System.out.printf("cust_id = %s, cust_pwd = %s, cust_name = %s, cust_regdate = %s, cust_update = %s\n",
                    cust_id, cust_pwd, cust_name, cust_regdate, cust_update);

        } catch (SQLException e) {
            System.out.println("Fail to select cust");
            e.printStackTrace();
        } finally {  // 5. Close
            if (rs != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
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


