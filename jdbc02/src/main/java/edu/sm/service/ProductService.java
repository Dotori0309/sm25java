package edu.sm.service;

import eud.sm.dto.Cust;
import eud.sm.dto.Product;
import eud.sm.frame.ConnectionPool;
import eud.sm.frame.SmRepository;
import eud.sm.frame.SmService;
import eud.sm.repository.CustRepository;
import eud.sm.repository.ProductRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProductService implements SmService<Product, Integer> {

    ProductRepository productRepository;
    ConnectionPool connectionPool;

    public ProductService(){
        this.productRepository = new ProductRepository();
        try {
            connectionPool = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void register(Product product) throws Exception {
        Connection conn = connectionPool.getConnection();
        try{
            conn.setAutoCommit(false);
            productRepository.insert(product, conn);
            //custRepository.insert(cust, conn);
            conn.commit();
        }catch(Exception e){
            conn.rollback();
            throw e;
        }finally {
            if (conn != null) {
                connectionPool.releaseConnection(conn);
            }
        }
    }

    @Override
    public void modify(Product product) throws Exception {
        Connection conn = connectionPool.getConnection();
        try{
            conn.setAutoCommit(false);
            productRepository.update(product, conn);
            conn.commit();
        }catch(Exception e){
            conn.rollback();
            throw e;
        }finally {
            if (conn != null) {
                connectionPool.releaseConnection(conn);
            }
        }
    }

    @Override
    public void remove(Integer integer) throws Exception {
        Connection conn = connectionPool.getConnection();
        try{
            conn.setAutoCommit(false);
            productRepository.delete(integer, conn);
            conn.commit();
        }catch(Exception e){
            conn.rollback();
            throw e;
        }finally {
            if (conn != null) {
                connectionPool.releaseConnection(conn);
            }
        }
    }

    @Override
    public List<Product> get() throws Exception {
        List<Product> list = null;
        Connection conn = connectionPool.getConnection();
        try{
            list = productRepository.selectAll(conn);
        }catch(Exception e){
            throw e;
        }finally {
            if (conn != null) {
                connectionPool.releaseConnection(conn);
            }
        }
        return list;
    }

    @Override
    public Product get(Integer integer) throws Exception {
        Product product = null;
        Connection conn = connectionPool.getConnection();
        try{
            product = productRepository.select(integer, conn);
        }catch(Exception e){
            throw e;
        }finally {
            if (conn != null) {
                connectionPool.releaseConnection(conn);
            }
        }
        return product;
    }
}
