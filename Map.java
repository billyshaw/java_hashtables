////////////////////////////////////////////////////////////////////////////////
//The interface for a MAP
////////////////////////////////////////////////////////////////////////////////

public interface Map<K,V> {
    public void put(K key, V value) throws HashTableException;
    public V get(K key) throws HashTableException;
    public boolean remove(K key) throws HashTableException;
    public HashTableStats calculateStats();
}
