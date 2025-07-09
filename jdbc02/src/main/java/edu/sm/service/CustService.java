package edu.sm.service;

import eud.sm.dto.Cust;
import eud.sm.frame.ConnectionPool;
import eud.sm.frame.SmService;
import eud.sm.repository.CustRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustService implements SmService<Cust, String> {

    CustRepository custRepository;
    ConnectionPool connectionPool;

    public CustService() {
        this.custRepository = new CustRepository();
        try {
            connectionPool = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void register(Cust cust) throws Exception {
        Connection conn = connectionPool.getConnection();
        try{
            conn.setAutoCommit(false);
            custRepository.insert(cust, conn);
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
    public void modify(Cust cust) throws Exception {
        Connection conn = connectionPool.getConnection();
        try{
            conn.setAutoCommit(false);
            custRepository.update(cust, conn);
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
    public void remove(String s) throws Exception {
        Connection conn = connectionPool.getConnection();
        try{
            conn.setAutoCommit(false);
            custRepository.delete(s, conn);
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
    public List<Cust> get() throws Exception {
        List<Cust> list = null;
        Connection conn = connectionPool.getConnection();
        try{
            list = custRepository.selectAll(conn);
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
    public Cust get(String s) throws Exception {
        Cust cust = null;
        Connection conn = connectionPool.getConnection();
        try{
            cust = custRepository.select(s, conn);
        }catch(Exception e){
            throw e;
        }finally {
            if (conn != null) {
                connectionPool.releaseConnection(conn);
            }
        }
        return cust;
    }
}