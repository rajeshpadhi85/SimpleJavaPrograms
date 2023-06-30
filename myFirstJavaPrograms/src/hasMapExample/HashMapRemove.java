package hasMapExample;

import java.util.HashMap;

public class HashMapRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> remove=new HashMap<>();
		
		remove.put(1, "Red");
		remove.put(2, "Green");
		remove.put(3, "Blue");
		
		System.out.println("Before remove method "+remove);
		
																	// below remove() method removes the value from the object and returns the removed object value
		String value=remove.remove(3);
		System.out.println(value);
		
		System.out.println("After remove method "+remove);
	}

}
