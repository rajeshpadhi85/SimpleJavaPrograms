package firstjava;

public class EncapsulationDemo {
	
	private int rollno;
	private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo obj= new EncapsulationDemo();
		obj.setRollno(20);
		System.out.println(obj.getRollno());
		
		obj.setName("Rajesh");
		System.out.println(obj.getName());

	}
	public void setRollno(int a)
	{
		rollno=a;
	}
	public int getRollno()
	{
		return rollno;
	}
	
	public void setName(String na)
	{
		name=na;
	}
	public String getName()
	{
		return name;
	}

}
