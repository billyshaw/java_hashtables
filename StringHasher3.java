////////////////////////////////////////////////////////////////////////////////
//Implements a fairly dumb string hash function
////////////////////////////////////////////////////////////////////////////////

public class StringHasher3 implements Hasher<String> {
    public int getHash(String key) {
	if(key == null || key.length() == 0) {
	    return 0;
	} else {
	    int rval = 0;
	    for (int i = 0; i < key.length(); i++){
		rval += key.charAt(i);
	    }
	    return rval;
	}
    }
}
