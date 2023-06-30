package firstjava;

public class GetterSetter {
	
	private String name;
	
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		this.name=newName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetter myName=new GetterSetter();
		myName.setName("Rajesh");
		System.out.println(myName.getName());

	}

}
