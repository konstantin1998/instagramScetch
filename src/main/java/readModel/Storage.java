package readModel;

import java.util.Collection;

public interface Storage<K, V> {
    void add(K key, V value);
    Collection<V> select(K key);
}
