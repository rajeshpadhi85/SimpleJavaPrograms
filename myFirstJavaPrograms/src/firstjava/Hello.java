package firstjava;



public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello everyone\nmy name is rajesh");


		
//		 below is the program of reverse of a string
		String str="rajesh";
		int k=str.length();
		for(int i=k-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		int table=10;
		for(int i=1;i<=10;i++)
		{
			int tablevalue=table*i;
			System.out.println(table+"*"+i+"="+tablevalue);
		}
		
		int i=10;
		int j=6;
		int p=25;
		
		System.out.println(Math.min(i,j));
		
		if(i>j && i>p)
		{
			System.out.println(i + "is greater");
		}else {
			if(j>i && j>p)
			{
				System.out.println(j+"is greater");
			}
			else {
				if(p>i && p>j)
				{
					System.out.println(p+"is greater");
				}
			}
			
		}

	
	}

}
