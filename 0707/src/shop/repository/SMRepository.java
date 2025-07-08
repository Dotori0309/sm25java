package shop.repository;

import java.util.List;

// CustRepository가 들어오기 위한 Frame
public interface SMRepository<V, K> {
    // Database에 CRUD 기능 정의
    // INSERT(C), SELECT(R), UPDATE(U), DELETE(D)
    // 기능을 정의하는 추상, public이 자동 생성됨
    void insert(V v);
    void update(V v);
    void delete(K k);

    // SQL 친화적인
    List<V> selectAll(); // void select();
    V select(K key); // K가 input되면 V가 return


}
