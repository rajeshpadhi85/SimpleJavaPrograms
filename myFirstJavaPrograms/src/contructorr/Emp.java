package contructorr;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp obj= new Emp();
		Emp obj1= new Emp(15,25);
		Emp obj2=new Emp("Rajesh", 30);

	}
	
	Emp()
	{
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("The value of a+b= "+ c);
	}
	Emp(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	Emp(String name, int age)
	{
		System.out.println("The name of student is "+ name+" and  age of student is "+age);
	}
		
}
