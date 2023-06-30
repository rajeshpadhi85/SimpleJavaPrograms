package inheritance;

public class Child1 extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 ch1=new Child1();
		ch1.car();
		ch1.flat();
		Parent p1=new Parent();
		p1.garden();
		//OR
		ch1.garden();
		

	}
	
	void flat()
	{
		System.out.println("Child1 has 2BHK Flat");
	}
	
	// below method is over ridden
	void car()   
	{
		super.car();
		System.out.println("child1 has two cars");
		
	}

}
