////////////////////////////////////////////////////////////////////////////////
// Tests the speed of different hashTable configurations
// You should
//  1. Choose which hash function to use StringHasher[1,2,3,4]
//  2. Choose the hash table size
//  3. Implement the code that updates the word count
//  4. Implement the code that finds the most common Scrabble word
//  5. Run this class to find out how fast your particular configuration is
//  Note that the timing code is done using a loop which repeats the operation
//  several times. This increases the accuracy of the measuered time.
////////////////////////////////////////////////////////////////////////////////


import java.util.Date;
import java.util.List;

public class SpeedTest {
    
    public static void main(String[] args)
    {

	try{
	    //
	    //Change this to change which hash you use
	    //
	    Hasher<String> hasher = new StringHasher1();
	    //	    Hasher<String> hasher = new StringHasher2();
	    //	    Hasher<String> hasher = new StringHasher3();
	    //	    Hasher<String> hasher = new StringHasher4();
	    
	    //
	    //Change this to change the hash table size
	    //
	    int hashTableSize = 1;

	    //Create the hashTable
	    Map<String,Integer> theHashTable = 
		new HashTable<String,Integer>(hashTableSize,
					      hasher);


	    //
	    //Change this to change which input file you use
	    //
	    FileParser fp = new FileParser("WarAndPeace.txt");
	    //	    FileParser fp = new FileParser("RomeoJuliet.txt");


	    List<String> words = fp.getAllWords();
	    Date startTime1 = new Date();
	    //For each word, store in the hashTable how many times it appeared
	    for(String word : words){
		//
		//IMPLEMENT THIS
		// 
	    }
	    Date endTime1 = new Date();
	    System.out.println("Time to add all words in script: " +  
			       (endTime1.getTime() - startTime1.getTime()));


	    //Calculate the stats for the HashTable
	    System.out.println(theHashTable.calculateStats());

	    //Find the most common scrabble word in the script
	    FileParser dict = new FileParser("TWL06.txt");//list of scrabble words
	    List<String> dictWords = dict.getAllWords();

	    String mostCommonWord = "";
	    //
	    // HINT: You might need to add some additional local variables here
	    //
	    Date startTime2 = new Date();
	    for (int i = 0; i < 100; i++){
		for(String word : dictWords){
		    //
		    // IMPLEMENT THIS
		    //
		}
	    }
	    Date endTime2 = new Date();
	    System.out.println("Time to find most common word: " +  
			       (endTime2.getTime() - startTime2.getTime()));

	    System.out.println("The most common Scrabble word in the script is: " 
			       + mostCommonWord);
	} catch (Exception e){e.printStackTrace();}
    }
}


