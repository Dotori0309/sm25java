package shop.repository;

import shop.dto.ItemDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemMySQLRepository implements SMRepository<ItemDto, Integer> {

    // TODO: Configure your database connection details here
    private static final String URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    @Override
    public void insert(ItemDto itemDto) {
        String sql = "INSERT INTO items (name, price) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, itemDto.getName());
            pstmt.setDouble(2, itemDto.getPrice());
            pstmt.executeUpdate();

            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    itemDto.setId(generatedKeys.getInt(1));
                }
            }
            System.out.println("MySQL: Inserted Item Table: " + itemDto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(ItemDto itemDto) {
        String sql = "UPDATE items SET name = ?, price = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, itemDto.getName());
            pstmt.setDouble(2, itemDto.getPrice());
            pstmt.setInt(3, itemDto.getId());
            pstmt.executeUpdate();
            System.out.println("MySQL: Updated Item Table: " + itemDto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM items WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("MySQL: Deleted Item Table: " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ItemDto> selectAll() {
        String sql = "SELECT * FROM items";
        List<ItemDto> itemDtos = new ArrayList<>();
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                itemDtos.add(new ItemDto(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price")
                ));
            }
            System.out.println("MySQL: Selected All Item Table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemDtos;
    }

    @Override
    public ItemDto select(Integer id) {
        String sql = "SELECT * FROM items WHERE id = ?";
        ItemDto itemDto = null;
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    itemDto = new ItemDto(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getDouble("price")
                    );
                }
            }
            System.out.println("MySQL: Selected Item Table: " + itemDto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemDto;
    }
}