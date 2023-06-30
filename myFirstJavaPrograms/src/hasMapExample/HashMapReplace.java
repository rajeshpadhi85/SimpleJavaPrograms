package hasMapExample;

import java.util.HashMap;

public class HashMapReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// replace method of HashMap
		
				HashMap<Integer, String> fruit=new HashMap<>();
				fruit.put(1, "Apple");
				fruit.put(2, "Orange");
				fruit.put(3, "Guava");
				
				System.out.println(fruit);
				fruit.replace(2, "Tomato");                     //replace method replace the value and enter the new value of the give key
				
				System.out.println(fruit);
				

	}

}
