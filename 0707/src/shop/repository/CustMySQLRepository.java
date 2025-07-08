package shop.repository;

import shop.dto.CustDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustMySQLRepository implements SMRepository<CustDto, String> {

    // TODO: Configure your database connection details here
    private static final String URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    @Override
    public void insert(CustDto custDto) {
        String sql = "INSERT INTO customers (id, pwd, name) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, custDto.getId());
            pstmt.setString(2, custDto.getPwd());
            pstmt.setString(3, custDto.getName());
            pstmt.executeUpdate();
            System.out.println("MySQL: Inserted Cust Table: " + custDto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(CustDto custDto) {
        String sql = "UPDATE customers SET pwd = ?, name = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, custDto.getPwd());
            pstmt.setString(2, custDto.getName());
            pstmt.setString(3, custDto.getId());
            pstmt.executeUpdate();
            System.out.println("MySQL: Updated Cust Table: " + custDto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM customers WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            pstmt.executeUpdate();
            System.out.println("MySQL: Deleted Cust Table: " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<CustDto> selectAll() {
        String sql = "SELECT * FROM customers";
        List<CustDto> custDtos = new ArrayList<>();
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                custDtos.add(new CustDto(
                        rs.getString("id"),
                        rs.getString("pwd"),
                        rs.getString("name")
                ));
            }
            System.out.println("MySQL: Selected All Cust Table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return custDtos;
    }

    @Override
    public CustDto select(String id) {
        String sql = "SELECT * FROM customers WHERE id = ?";
        CustDto custDto = null;
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    custDto = new CustDto(
                            rs.getString("id"),
                            rs.getString("pwd"),
                            rs.getString("name")
                    );
                }
            }
            System.out.println("MySQL: Selected Cust Table: " + custDto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return custDto;
    }
}