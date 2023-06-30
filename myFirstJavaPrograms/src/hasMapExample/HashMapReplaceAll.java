 package hasMapExample;

import java.util.HashMap;

public class HashMapReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> replaceall=new HashMap<>();
		
		replaceall.put(1, "Apple");
		replaceall.put(2, "Orange");
		
		replaceall.replaceAll((key, value) -> value.toUpperCase());
		System.out.print(replaceall);                                // converted all letter to upper case
		replaceall.replaceAll(null);
		
		HashMap<Integer, Integer> replacedemo=new HashMap<>();
		replacedemo.put(1,10);
		replacedemo.put(2,20);
		
		
		replacedemo.replaceAll((key, value) -> key*key);             // here the method multiply all the values to itself 
		
		System.out.println(replacedemo);
		
	}

}
