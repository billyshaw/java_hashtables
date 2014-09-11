////////////////////////////////////////////////////////////////////////////////
// Stores the stats about the hash-table
// useful for analyzing the quality of a hash function
////////////////////////////////////////////////////////////////////////////////


public class HashTableStats {
    public double loadFactor;
    public double meanChainLength;
    public double stdevChainLength;
    public int longestChainLength;

    public String toString() {
	return "LoadFactor:\t\t" + loadFactor + "\n"
	    +  "meanChainLength:\t" + meanChainLength + "\n"
	    +  "stdevChainLength:\t" + stdevChainLength + "\n"
	    +  "longestChainLength:\t" + longestChainLength + "\n";
    }
}
