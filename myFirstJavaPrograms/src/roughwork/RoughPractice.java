package roughwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RoughPractice  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]= {5,-6,7,-9,9,-2};
		int posetive=0;
		int negative=0;
		
		int posetivearray[];
		int negativearray[];
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				posetive=posetive+1;
			}
			else
			{
				negative=negative+1;
			}
		}
		
		posetivearray=new int[posetive];
		negativearray=new int[negative];
		
		posetive=0;
		negative=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				posetivearray[posetive]=ar[i];
				posetive++;
				
			}
			else
			{
				negativearray[negative]=ar[i];
				negative++;
			}
		}
		
		
		
		for(int i=0;i<posetivearray.length;i++)
		{
			System.out.print(posetivearray[i]+" ");
		}
		System.out.println();
		for(int i=0;i<negativearray.length;i++)
		{
			System.out.print(negativearray[i]+" ");
		}
		
				
	}


}
