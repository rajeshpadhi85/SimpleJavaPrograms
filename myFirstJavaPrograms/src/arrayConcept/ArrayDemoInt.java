package arrayConcept;

import java.util.Scanner;
import java.util.regex.*;

public class ArrayDemoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("now enter array value");
		for(int i=0;i<size;i++)
		{
			
			a[i]=sc.nextInt();
		}
		System.out.println("now array started printing");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
//		int k[]= {1,2,3,4};
//		int l[]= {5,6,7,8};
//		int m[]= {6,5,2,9};
//		
//		int n[][]= {{1,2,3,4},{5,6,7},{6,5,2,9,5}};  // this is called jagged array
//		
//				
//			
//		for(int i=0;i<n.length;i++)
//		{
//			for(int j=0;j<n[i].length;j++)
//			{
//				System.out.print(" "+n[i][j]);
//			}
//			System.out.println();
//		}
//		
//		// checking the output string value is of xxx.xx format
//		
//		String value="321.35";
//		String pattern = "\\d{3}\\.\\d{2}"; 
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(value);
//        if(matcher.find()==true)
//        {
//        	System.out.println("the input is xxx.xx format");
//        }
//        else
//        {
//        	System.out.println("the format is wrong");
//        }
//
	}

}
