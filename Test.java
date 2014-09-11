// ***********************************************************************
//
// Test Class -- The main function that registers and executes tests.
//
// ***********************************************************************

public class Test {
    
    public static void main(String [] args) {
	Test1 t1 = new Test1("t1");

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%% Register your new tests here, by extending this method %%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	TestHarness.run();


    }
}
