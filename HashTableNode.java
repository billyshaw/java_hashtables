////////////////////////////////////////////////////////////////////////////////
//The node for a hash-table linked list chain
////////////////////////////////////////////////////////////////////////////////

class HashTableNode<K,V> {
    private K key;
    private V value;
    private HashTableNode<K,V> next;
    public HashTableNode(K k, V v, HashTableNode<K,V> n) 
    {    // Constructor
	key=k; value=v; next=n;
    }

    public K getKey() {return key;}
    //no setKey operation
    public V getValue() {return value;}
    public void setValue(V newValue) {value = newValue;}
    public HashTableNode getNext() {return next;}
    public void setNext(HashTableNode<K,V> n) {next = n;}
   
    public String toString() {
	return "Node[" + key +  "|" + value + "]"; 
    }
}
