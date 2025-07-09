package edu.sm.frame;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface SmRepository<V,K> {
    // Database에 CRUD 기능 정의
    // INSERT(C), SELECT(R), UPDATE(U), DELETE(D)
    void insert(V v, Connection conn) throws Exception;
    void update(V v, Connection conn) throws Exception;;
    void delete(K k, Connection conn) throws Exception;;
    List<V> selectAll(Connection conn) throws Exception;;
    V select(K k, Connection conn) throws Exception;;
}