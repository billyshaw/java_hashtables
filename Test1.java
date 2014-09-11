// ***********************************************************************
//
// Test1 -- An example test : confirms that the set is initially of size 0
// ***********************************************************************

public class Test1 extends TestHarness {

    public Test1(String s) { super(s); }

    public boolean test() { 
	Map<Integer, Integer> m = new HashTable<Integer,Integer>
	    (100, new GenericHasher<Integer>());

	try {
	    //Check what happens if we try to get a value from an empty set
	    Integer result = m.get(2);
	    //The result should be null
	    return (result == null);
	} catch (Exception e){
	    //if we catch an exception, something went wrong
	    return false;
	}
    }
}
