package firstjava;

import java.util.Scanner;

public class ScannerclassUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj=new Scanner(System.in);
		System.out.println("enter name, age and salary");
		String name=myobj.nextLine();
		int age=myobj.nextInt();
		double salary=myobj.nextDouble();
		
		System.out.println("name is:"+name+"\n"+"my age is:"+age+"\n"+"my salary is:"+salary);
		

	}

}

