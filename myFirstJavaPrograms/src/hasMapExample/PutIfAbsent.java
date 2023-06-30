package hasMapExample;

import java.util.HashMap;

public class PutIfAbsent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// use of putIfAbsent method , it insert the value if not present in the HashMap object
		
		HashMap<Integer, String> ifAbsent=new HashMap<>();
		ifAbsent.put(1, "java");
		ifAbsent.put(2,"python");
		ifAbsent.put(3, "C++");
		
		System.out.println(ifAbsent);
		
		ifAbsent.putIfAbsent(4, "dot Net");        // as the key & value was not present hence inserted
		System.out.println(ifAbsent);
		
		String check=ifAbsent.putIfAbsent(3, "java script");    //here key is already available in the collection object hence not updated new data
		System.out.println(ifAbsent);
		System.out.println(check);
		

	}

}
