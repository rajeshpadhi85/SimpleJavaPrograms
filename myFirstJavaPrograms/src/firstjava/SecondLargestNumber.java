package firstjava;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> number=new ArrayList<>();
		int ar[]= {10,12,31,15,21};
		for(int k:ar) {
			number.add(k);
		}
		Collections.sort(number);
		System.out.println(number);
		
		
		System.out.println("the second smallest number is :"+ number.get(1));
		System.out.println("the second largest number is :"+ number.get(ar.length-2));
		

	}

}
