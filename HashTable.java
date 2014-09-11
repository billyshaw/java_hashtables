////////////////////////////////////////////////////////////////////////////////
//Implements a generic hash table
////////////////////////////////////////////////////////////////////////////////

import java.lang.Math;

public class HashTable <K,V> implements Map<K,V> {
    private HashTableNode<K,V>[] table;
    private Hasher<K> hasher;

    //Convert the hash-table to a string
    //suitable for printing to the console (or to a file)
    public String toString() {
	String rval = "";
	for (int i = 0; i < table.length; i++){
	    rval = rval + i + ": ";
	    HashTableNode<K,V> N = table[i];
		while (N != null){ 
		    rval = rval + N.toString() + ", ";
		    N = N.getNext();
		}
		rval = rval + "\n";
	}	
	return rval;
    }



    public HashTable(int size, Hasher<K> h) {   // Constructor
	//This operation is not type safe, but is OK for our purposes
        table = new HashTableNode[size];
	hasher = h;
    }

    // Hashes int x to a value between 0 and L-1;
    private int getIndex(K key) {
	//if we have a negative hashcode,
	//we get problems using it as an index!
	//fix by taking the absolute value
	int hash = Math.abs(hasher.getHash(key));
	return hash % table.length;
    }

    //  Find node for  Key if it exists.
    // Returns null otherwise
    private HashTableNode<K,V> FindNode(K key, int index) throws HashTableException {
	if(key == null)
	    throw new HashTableException("Null keys not allowed in the hash table");

	HashTableNode<K,V> N = table[index];
        while (N != null && !(N.getKey().equals(key))) 
	    //search the linked list until we either reach the end
	    //or find the node we are looking for
	    N = N.getNext(); 
        return N;
    }

    // Add Value V under key Key (updates if exists)
    public void put(K key, V value) throws HashTableException {
	if(key == null)
	    throw new HashTableException("Null keys not allowed in the hash table");
	if(value == null) 
	    throw new HashTableException("Null values not allowed in the hash table");

        int index = getIndex(key);
	HashTableNode<K,V> node = FindNode(key,index);
	if (node != null){
	    //the node already exists, just change its value
	    node.setValue(value);
	} else {
	    //add it to the front of the list
	    table[index] = new HashTableNode<K,V>(key,value,table[index]);
	}
    }

    // Locate the Value associated with key
    // If the key is not in the set, return null
    public V get(K key) throws HashTableException {
	if(key == null)
	    throw new HashTableException("Null keys not allowed in the hash table");

        int index = getIndex(key);
        HashTableNode<K,V> node = FindNode(key,index);
	if(node == null) return null;
	else return node.getValue();
    }

    // If the key is in the set, remove it and return true
    //otherwise return false
    public boolean remove(K key) throws HashTableException {
	//
	//IMPLEMENT THIS FUNCTION
	//
	return false;
    }

    public HashTableStats calculateStats() {
	//
	//IMPLEMENT THIS FUNCTION
	//
	return null;
    }

}
