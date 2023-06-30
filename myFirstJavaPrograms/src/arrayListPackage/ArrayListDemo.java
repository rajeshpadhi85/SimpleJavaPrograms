package arrayListPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<Integer> arlst=new ArrayList<>(8);
//		
//		arlst.add(10);                                       // add method is to insert the value in the arraylist
//		arlst.add(20);
//		arlst.add(5);
//		arlst.add(9);
//		System.out.println(arlst);
//		
//		System.out.println(arlst.size());					// size method get the lengh or size of the array
//		
//		
//		System.out.println(arlst.get(2));                      //get method is to retrieve the value from the arraylist
//		
//		arlst.clone();											//clone methods create a duplicate set of data in arraylist
//		System.out.println(arlst);
//		
////		arlst.clear();                                         // clear method removes all data from the arraylist
////		System.out.println(arlst);
//		
//		//contains method check the perticular object is present in the array or not and it returns boolean value
//		System.out.println(arlst.contains(7));
//		
//
//		arlst.trimToSize();                                   //trimToSize method the trim the aray size from 8 to 4
//		System.out.println(arlst);
//		
//		//remove method remove element of the given index and returns the removed value
//		int removed=arlst.remove(3);
//		System.out.println("after remove"+ arlst+ "and removed object is "+removed );
//		
//		arlst.set(2, 25);										//set method replace a value with new value of a given index
//		System.out.println(arlst);
//		
//		arlst.replaceAll(e-> e*2);								//replaceAll method replace the value by multiplay 2 in it
//		System.out.println(arlst);
		
		
		ArrayList<Integer> array=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of arraylist");
		int k=sc.nextInt();
		System.out.println("enter array values");
		for(int i=0;i<k;i++)
		{
			array.add(sc.nextInt());
		}
		for(int j=0;j<k;j++)
		{
			if(array.get(j)%2==0)
			System.out.println(array.get(j));
		}

	}

}
