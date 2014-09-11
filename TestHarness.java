// ***********************************************************************
//
// TestHarness Class Interface
//


import java.util.*;

public class TestHarness {
    // One list of tests, initially empty
    static final List<TestHarness> tests =  new ArrayList<TestHarness>();
    // Registration adds to the list
    // protected void register() { tests.add(this); }
    // Each implements a test() function
    public String testName = null;

    public TestHarness() { System.out.print("Error: class must be constructed with a test name\n"); }
    public TestHarness(String nm) {
	testName = nm; tests.add(this);
    }
    public void register(String nm) { testName = nm; tests.add(this); }

    public boolean test() { 
	System.out.print("test is unimplemented.");
	return false;
    }

    public static void run() {
	ListIterator itr = tests.listIterator();
	while(itr.hasNext()) {
	    TestHarness tst = (TestHarness)itr.next();
	    System.out.print("Test " + tst.testName + ": {");
	    if (tst.test()) {
		System.out.print("} PASS.\n");
	    } else {
		System.out.print("} *** TEST FAILED ***\n");
		return;
	    }
	}
	System.out.print("Tests Completed. All passed.\n");
    }

}	