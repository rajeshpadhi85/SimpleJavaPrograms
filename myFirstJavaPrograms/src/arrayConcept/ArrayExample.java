package arrayConcept;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name="rajesh";
//		int k=name.length();
//		System.out.println(name.indexOf('j'));
//		
//		for(int i=0;i<name.length();i++ )
//		{
//			
//			System.out.print(i);
//
//		}
//		System.out.println();
//		for(int i=0;i<name.length();i++)
//		{
//			System.out.print(name.charAt(i));
//		}
		
		// below code of print Integer Array
//		int size, i;
//		Scanner r=new Scanner(System.in);
//		System.out.println("enter the size of array");
//		size=r.nextInt();
//		int a[]=new int[size];
//		for(i=0;i<size;i++) {
//			a[i]=r.nextInt();
//		}
//		System.out.println("array started printing");
//		for(i=0;i<size;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
		
		
		// below code is printing String Array
		
		String str[]={"selenium","java","testng","cucumber"};
		String st="rajesh,prakash,asish";
		String sr[][]={{"rajesh","praksj","asish"},{"pratap","rohan","yadav"}};
		System.out.println(Arrays.deepToString(sr));                            //the method deepToString(array object) applicable to array only  
		int r=str.length;
		
		System.out.println(r);
		String splt[]=st.split(",");
		
		int j=splt.length;
		System.out.println(Arrays.toString(str));                              //the method toString(array object) applicable for array only

		for(int i=0;i<splt.length;i++)
		{
			System.out.println(splt[i]);
		}
		
		System.out.println("----------------------------");
		
		String str1="rajesh";
		String str2="prakash";
		String str3="asish";
		
		String names=str1.concat(str3).concat(str2);                            // the method concat() use to join two or more strings
		System.out.println(names);
						

	}

}
