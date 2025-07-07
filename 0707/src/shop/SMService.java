package shop;
import java.util.List;


public interface SMService<V,K> {
    void register(V v);
    void modify(V v);
    void remove(K k);
    List<V> get();
    V get(K k);
}
