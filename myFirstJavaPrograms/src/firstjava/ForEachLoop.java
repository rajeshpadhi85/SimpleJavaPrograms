package firstjava;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		for(int k:a)
		{
			System.out.println(k);
		}
		
		int b[][]= {{1,2,3},{4,5},{7,8,9}};
		for(int k[]:b)
		{
			for(int j:k)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}

}
