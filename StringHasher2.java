////////////////////////////////////////////////////////////////////////////////
//Implements a fairly dumb string hash function
////////////////////////////////////////////////////////////////////////////////

public class StringHasher2 implements Hasher<String> {
    public int getHash(String key) {
	if(key == null) {
	    return 0;
	} else {
	    key = key.toUpperCase();
	    int shift = 1;
	    int rval = 0;
	    for(int i = 0; i < 3 && i < key.length(); i++){
		//make a key using the first three characters
		//17K possiblities ought to be lots, right?
		rval += shift * (int) (key.charAt(i));
		shift *= 256;
	    }
	    return rval;
	}
    }
}
