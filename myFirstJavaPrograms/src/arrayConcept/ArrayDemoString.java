package arrayConcept;

import java.util.Scanner;

public class ArrayDemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]=new String[3];
		str[0]="Asish";
		str[1]="Prakash";
		str[2]="Rajesh";
		
		String strr[]= {"Asish","Prakash","Rajesh"};
		
		for(int i=0;i<strr.length;i++)
		{
			System.out.println(str[i]);
		}
		
		String str2[]= {"Ashish","Prakash"};
		String str3[]= {"Rajesh","Amresh"};
		String str4[]={"Ashutosh","Mrutyunjay"};
		

		String strn[][]= {
				{"Ashish","Prakash"},
				{"Rajesh"},
				{"Ashutosh","Mrutyunjay"}
				};
		for(int i=0;i<strn.length;i++)
		{
			for(int j=0;j<strn[i].length;j++)
			{
				System.out.print(" "+strn[i][j]);
			}
			System.out.println();
		}
		
	}

}
