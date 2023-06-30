package firstjava;

public class MaxAndMinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a=20;
//		int b=30;
//		System.out.println(Math.min(a, b));
//		System.out.println(Math.max(a, b));
		
		int ar[]= {10,20,30,45,12,70};
		int max=ar[0];
		int min=ar[0];
		
		for(int i=0;i<ar.length;i++)
		{  
			
			
					if(ar[i]>max) 
					{
						max=ar[i];
					}
					if(ar[i]<min) {
						min=ar[i];
					}
				
				
			
			
		}
		
		System.out.println("max value "+ max+"and min value "+min);
	}
}
