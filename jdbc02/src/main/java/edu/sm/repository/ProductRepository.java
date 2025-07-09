package edu.sm.repository;

import eud.sm.dto.Cust;
import eud.sm.dto.Product;
import eud.sm.frame.CustSql;
import eud.sm.frame.ProductSql;
import eud.sm.frame.SmRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements SmRepository<Product, Integer> {
    @Override
    public void insert(Product product, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try{
            psmt = conn.prepareStatement(ProductSql.insert);
            psmt.setString(1, product.getProductName());
            psmt.setInt(2, product.getProductPrice());
            psmt.setDouble(3, product.getDiscountRate());
            psmt.setString(4, product.getProductImg());
            psmt.setInt(5, product.getCateId());
            psmt.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally {
            if (psmt != null) {
                psmt.close();
            }
        }
    }

    @Override
    public void update(Product product, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try{
            psmt = conn.prepareStatement(ProductSql.update);
            psmt.setString(1, product.getProductName());
            psmt.setInt(2, product.getProductPrice());
            psmt.setDouble(3, product.getDiscountRate());
            psmt.setString(4, product.getProductImg());
            psmt.setInt(5, product.getCateId());
            psmt.setInt(6, product.getProductId());
            psmt.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally {
            if (psmt != null) {
                psmt.close();
            }
        }
    }

    @Override
    public void delete(Integer integer, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try{
            psmt = conn.prepareStatement(ProductSql.delete);
            psmt.setInt(1, integer);
            psmt.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally {
            if (psmt != null) {
                psmt.close();
            }
        }
    }

    @Override
    public List<Product> selectAll(Connection conn) throws Exception {
        List<Product> list = new ArrayList<>();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try{
            psmt=conn.prepareStatement(ProductSql.selectAll);
            rs=psmt.executeQuery();
            while(rs.next()){
                Product product = new Product();
                product.setProductId(rs.getInt("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setProductPrice(rs.getInt("product_price"));
                product.setDiscountRate(rs.getDouble("discount_rate"));
                product.setProductImg(rs.getString("product_img"));
                product.setProductRegdate(rs.getTimestamp("product_regdate"));
                product.setProductUpdate(rs.getTimestamp("product_update"));
                product.setCateId(rs.getInt("cate_id"));
                list.add(product);
            }
        }catch (Exception e){
            throw e;
        }finally {
            if (psmt != null) {
                psmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }

        return list;
    }

    @Override
    public Product select(Integer integer, Connection conn) throws Exception {
        Product product = new  Product();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try{
            psmt=conn.prepareStatement(ProductSql.select);
            psmt.setInt(1, integer);
            rs=psmt.executeQuery();
            rs.next();
            product.setProductId(rs.getInt("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductPrice(rs.getInt("product_price"));
            product.setDiscountRate(rs.getDouble("discount_rate"));
            product.setProductImg(rs.getString("product_img"));
            product.setProductRegdate(rs.getTimestamp("product_regdate"));
            product.setProductUpdate(rs.getTimestamp("product_update"));
            product.setCateId(rs.getInt("cate_id"));

        }catch (Exception e){
            throw e;
        }finally {
            if (psmt != null) {
                psmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }

        return product;
    }
}
