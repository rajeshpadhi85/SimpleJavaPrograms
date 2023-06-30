package firstjava;

public class ThreadExample extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample obj=new ThreadExample();
		obj.start();

	}
	
	public void run()
	{
		System.out.println("this is my thread");
	}

}
