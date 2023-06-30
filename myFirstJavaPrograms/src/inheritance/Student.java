package inheritance;

public class Student extends Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std= new Student();
		std.classroom();
		std.library();
		std.playground();
	}
	
	void classroom()
	{
		System.out.println("Student has a nice class room");
	}

}
