package UseofSuperKeyWord;

public class B extends A {
	int x=20;
	void Hellow()
	{
		super.Hellow();
		System.out.println(super.x);
		System.out.println("I am from sub class");
	}
	B()
	{
		System.out.println("I am  sub class constructor");
	}

}
