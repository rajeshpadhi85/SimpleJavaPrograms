package interfaceExample;

public class Pendemo implements Writerdemo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pendemo pe=new Pendemo();
		pe.writesomething();

	}
	public void writesomething()
	{
		System.out.println("I am a pen");
	}
}
