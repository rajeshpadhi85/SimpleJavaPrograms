package inheritance;

public class Employer {
	
	int companycode=11215;
	String companyname="TechM";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employer obj= new Employer();
		obj.accounting();
		
		Employee obj2=new Employee();
		obj2.salary();
		
		
	}
	
	void accounting()
	{
		System.out.println("We have accounting department");
	}
	
	void hr()
	{
		System.out.println("hr department help on requitment");
	}

}
