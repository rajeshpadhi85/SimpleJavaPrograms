package firstjava;

public class ThisDemo {
		int a;
		int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo obj=new ThisDemo();
		obj.Demo(10,20);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
	
	void Demo(int a, int b)
	{
		this.a=a;
		this.b=b;
	
	}

}
