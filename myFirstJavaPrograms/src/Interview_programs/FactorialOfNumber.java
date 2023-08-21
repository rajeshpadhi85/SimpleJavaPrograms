package Interview_programs;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		
		for(int i=number-1;i>=1;i--) {
			number=number*i;
		}
		System.out.println(number);
	}

}
