package firstjava;

public class ConstructorDemo {
	
	int val;
	int val1;
	double db;
	String name;
	
	public static void main(String[] args) {
		ConstructorDemo cod=new ConstructorDemo();
		System.out.println(cod.val+" & "+cod.val1);
		
		
		ConstructorDemo code=new ConstructorDemo(50);
		System.out.println(code.val);
		
		ConstructorDemo codet=new ConstructorDemo(20, "Rajesh");
		System.out.println(codet.val+" "+codet.name);
		
		ConstructorDemo coder=new ConstructorDemo(30, 10.5);
		System.out.println(coder.val+" "+coder.db);
	}
	public ConstructorDemo()
	{
		val=10;
		val1=20;
		
	}
	public ConstructorDemo(int a)
	{
		val=a;
	}
	public ConstructorDemo(int a, String b)
	{
		val=a;
		name=b;
		
	}
	public ConstructorDemo(int a, double b)
	{
		val=a;
		db=b;
	}

}
