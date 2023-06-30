package firstjava;

public class StaticExample {
	
		int a =20;
		static int b=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StaticExample.exNewStatic();
		//StaticExample obj=new StaticExample();
		//obj.nonStatic();// this way we shouldn't call the static method but it is not wrong
		//exNewStatic();
		System.out.println(b);
	}
	static
	{
		System.out.println("this is a static block");
		exNewStatic(); // In the static block we can only call static method
		//nonStatic(); // in the static block we can't call not static method
		
		
	}
	static void exNewStatic()
	{
		StaticExample objc=new StaticExample();
		System.out.println("this is a static method"+" "+objc.a);
		objc.nonStatic();
		
	}
	void nonStatic()
	{
		System.out.println("this a non static method"+" "+b);
	}

}
//a static variable or method can be accessed by a class name directly.
// if variables or methods have common value then we can declare it as static
// static block is executed automatically before main method
// static key word is used in java to manage memory efficiently
// we can't access a non static variable inside the static method