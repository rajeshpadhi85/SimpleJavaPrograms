package hasMapExample;

import java.util.HashMap;

public class HashMapPutAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> number=new HashMap<>();   
		System.out.println("initial HashMap "+number);
		
		number.put("one", 1);
		number.put("two", 2 );
		number.put("Three", 5);
	
		
		int val=number.get("two");                     // get method to get value
		System.out.println("now HashMap is"+ number);
		System.out.println("HashMap sise is "+ number.size());
		System.out.println(val);
		
		
		HashMap<String, Integer> fruits=new HashMap<>();
		fruits.put("two", 6);
		fruits.put("Three", 3);
		fruits.put("Guava", 3);
		
		
		
		fruits.putAll(number);                      //HashMap putAll()   method
		System.out.println(fruits);
		
		

	}

}
