package hasMapExample;

import java.util.HashMap;

public class HashMapPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> number=new HashMap<>();                 //put method to put value for string and integer pair
		System.out.println("initial HashMap "+number);
		
		number.put("one", 1);
		number.put("two", 2 );
		number.put("Three", 5);
		int val=number.get("two");                                       // get method to get value
		System.out.println("now HashMap is"+ number);
		System.out.println("HashMap sise is "+ number.size());           // size method says the HashMap size
		System.out.println(val);
		
		
		
		
		//--------------------------------------------------------------
		
		HashMap<Integer, String> language=new HashMap<>();        		// here put method inserts value in integer and string pair
		language.put(1,"One");
		language.put(2,"Two");
		language.put(3, "Three");
		language.put(4, "Three");
		System.out.println("now HashMap is "+language);
		
		String value=language.get(3);                       			// get method to get the value
		System.out.println(value);
		
		//--------------------------------------------------
		

		
	}

}
