package inheritance;

public class Employee extends Employer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1= new Employee();
		
		obj1.accounting();
		obj1.hr();
		
		
		System.out.println("Name of the company is "+obj1.companyname);
		System.out.println("Code of the company is "+obj1.companycode);

	}
	
	void salary()
	{
		System.out.println("salary of employee comes 1st of every month");
	}
	
	void empcode()
	{
		System.out.println("Every employee have a unique employee code");
	}

}
