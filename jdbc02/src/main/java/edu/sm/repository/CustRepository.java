package edu.sm.repository;

import eud.sm.dto.Cust;
import eud.sm.frame.CustSql;
import eud.sm.frame.SmRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustRepository implements SmRepository<Cust, String> {
    @Override
    public void insert(Cust cust, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try{
            psmt = conn.prepareStatement(CustSql.insert);
            psmt.setString(1, cust.getCustId());
            psmt.setString(2, cust.getCustPwd());
            psmt.setString(3, cust.getCustName());
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
    public void update(Cust cust, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try{
            psmt = conn.prepareStatement(CustSql.update);
            psmt.setString(3, cust.getCustId());
            psmt.setString(1, cust.getCustPwd());
            psmt.setString(2, cust.getCustName());
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
    public void delete(String s, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try{
            psmt = conn.prepareStatement(CustSql.delete);
            psmt.setString(1, s);
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
    public List<Cust> selectAll(Connection conn) throws Exception {
        List<Cust> list = new ArrayList<>();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try{
            psmt=conn.prepareStatement(CustSql.selectAll);
            rs=psmt.executeQuery();
            while(rs.next()){
                Cust cust = new Cust();
                cust.setCustId(rs.getString("cust_id"));
                cust.setCustPwd(rs.getString("cust_pwd"));
                cust.setCustName(rs.getString("cust_name"));
                cust.setCustRegdate(rs.getTimestamp("cust_regdate"));
                cust.setCustUpdate(rs.getTimestamp("cust_update"));
                list.add(cust);
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
    public Cust select(String s, Connection conn) throws Exception {
        Cust cust = new Cust();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try{
            psmt=conn.prepareStatement(CustSql.select);
            psmt.setString(1, s);
            rs=psmt.executeQuery();
            rs.next();
            cust.setCustId(rs.getString("cust_id"));
            cust.setCustPwd(rs.getString("cust_pwd"));
            cust.setCustName(rs.getString("cust_name"));
            cust.setCustRegdate(rs.getTimestamp("cust_regdate"));
            cust.setCustUpdate(rs.getTimestamp("cust_update"));
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

        return cust;
    }
}