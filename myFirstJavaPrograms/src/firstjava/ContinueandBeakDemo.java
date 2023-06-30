package firstjava;

public class ContinueandBeakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int table=10;
		for(int i=0; i<table;i++)
		{
			
			if(i==5 || i==7)
			{
				continue;
			}
			System.out.println(i);
		}
		
		for(int i=0;i<table;i++)
		{
			if(i==6)
			{
				break;
			}
			System.out.print(i);
		}

	}

}
