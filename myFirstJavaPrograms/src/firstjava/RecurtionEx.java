package firstjava;

public class RecurtionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=sum(10);
		System.out.println(total);
		
			

	}
	public static int sum(int x)
	{
		if(x>0) {
			return x + sum(x-1);
		}
		else
		{
			return 0;
		}
		
	}

}
