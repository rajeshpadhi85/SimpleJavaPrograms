package firstjava;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();

		if(n==0||n==1)
		{
			System.out.println(n+" is not a prime number");
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				flag=1;
				break;
			}}
		if (flag==0){
			System.out.println(n+" is a prime number ");
		}


	}

}
