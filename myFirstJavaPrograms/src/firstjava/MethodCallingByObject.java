package firstjava;

public class MethodCallingByObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodCallingByObject obj = new MethodCallingByObject();
		obj.studentClass();
		obj.salaryHeadmaster(20000);
		obj.salaryPrincipal(20000, 50000);
		obj.schoolName("B C Academy");
		
					
	}
	
	void schoolName(String name)
	{
		System.out.println("The school name is "+name);
	}
	void salaryPrincipal(int basicsalary, int fullsalary)
	{
		System.out.println("Basic salary of principal is "+basicsalary+" and full salry is "+fullsalary);
	}
	
	void salaryHeadmaster(int salary)
	{
		System.out.println("Salary of headmaster is "+salary);
	}
	
	public void studentClass()
	{
		System.out.println("I am in Testing class now");
		teacherSalary();
	}
	
	void teacherSalary()
	{
		System.out.println("Teacher salary is 10000");
	}

}
