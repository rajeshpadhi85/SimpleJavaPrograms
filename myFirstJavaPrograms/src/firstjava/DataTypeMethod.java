package firstjava;

import java.util.Scanner;

public class DataTypeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataTypeMethod obj= new DataTypeMethod();
		int value=obj.lecSalary();
		System.out.println("lecture salry is "+value);
		
		int total_salary=obj.bonus(value);
		System.out.println("lecture total salary is "+total_salary);
		
		String collegeName = obj.nameOfCollege();
		System.out.println(collegeName);

	}
	
	String nameOfCollege()
	{
		String college="New Xavior College";
		return college;
	}
	
	int lecSalary()
	{
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter lecture salary");
//		int salary=s.nextInt();
		int salary=40000;
		return salary;
	}
	
	int bonus(int salary)
	{
		int empBonus=10000;
		System.out.println("lecture bonus is "+empBonus);
		int totalsalary=empBonus+salary;
		return totalsalary;
	}

}
