package inheritance;

public class Teacher extends School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher tec=new Teacher();
		tec.library();
		tec.playground();

	}
	
	void library()
	{
		System.out.println("Teachers are sitting in the library");
	}

}
