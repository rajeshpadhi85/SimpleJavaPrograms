package hasMapExample;

import java.util.Map.Entry;
import java.util.HashMap;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> iteration=new HashMap<>();
		
		iteration.put(1, "Red");
		iteration.put(2, "Green");
		iteration.put(3, "Blue");
		
		
		// iterate through keys only
		System.out.print("Keys: ");
	    for (Integer key : iteration.keySet()) {                             //keySet() method fetch the keys of HashMap object
	      System.out.print(key);
	      System.out.print(", ");
	    }
	    
	    // iterate through values only
	    System.out.println();
	    
	    for(String value:iteration.values())                                  // values() this method fetch all value of a HashMap
	    {
	    	System.out.print(value);
	    	System.out.print(",");
	    	
	    }
	    
	    System.out.println();
	    // iterate through key/value
	    for(Entry<Integer, String> entry : iteration.entrySet())               //entrySet() this method fetch all the value from HashMap
	    {
	    	System.out.println(entry);
	    	//System.out.print(",");
	    }

	}

} 
