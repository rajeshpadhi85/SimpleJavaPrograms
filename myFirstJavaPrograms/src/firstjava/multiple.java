package firstjava;

public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int a = 100;
		int b = 50;
		
		int c = a * b;
		
		System.out.println(c); */
		
//		int a = 100;
//		int b = 30;
//		int c = a-b;
//		System.out.println(c);
		
		// below is the program to find the total vowels from a string
		String name="rajesh kuamr padhi";
		
		int k=0;
		for(int i=0;i<name.length();i++) {
			
			char ch=name.charAt(i);
			
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				
				
				k=k+1;
				
			}
			
		}
		System.out.println("the number of viouls are "+k);
		
		
		// Find a peak element which is not smaller than its neighbours
		
		int[] array= {10,15,20,14};
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>array[i-1]&&array[i]>array[i+1])
			{
				System.out.println(array[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}