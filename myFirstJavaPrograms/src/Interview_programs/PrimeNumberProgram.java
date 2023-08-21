package Interview_programs;

import java.util.Scanner;

public class PrimeNumberProgram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		int count=0;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				System.out.println(number+" is not a prime number");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(number+" is a prime number");
		}
						
	}

}
