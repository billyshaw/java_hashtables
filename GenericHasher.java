////////////////////////////////////////////////////////////////////////////////
//Implements a generic hash function
//Based on the java .hashcode() function for the class
//YOU DO NOT NEED TO MODIFY ANY OTHER FUNCTION
////////////////////////////////////////////////////////////////////////////////


public class GenericHasher<T> implements Hasher<T> {
    public int getHash(T key) {
	if(key == null) return 0;
	else return key.hashCode();
    }
}
