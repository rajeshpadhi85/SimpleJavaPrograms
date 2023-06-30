package firstjava;

import java.util.Scanner;

public class SwapingofTwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//swapping a number using third veriable
		
		int x,y,temp;
		System.out.println("enter x and y");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("before swap "+x+" & "+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swap "+x+" & "+y);
		
		//swapping a number without using third variable
		
		
//		x=x+y;
//		y=x-y;
//		x=x-y;

	}

}
