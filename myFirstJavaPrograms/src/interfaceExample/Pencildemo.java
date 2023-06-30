package interfaceExample;

public class Pencildemo implements Writerdemo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pencildemo pe=new Pencildemo();
		pe.writesomething();

	}
	public void writesomething()
	{
		System.out.println("I am a pencil");
	}
	
}
