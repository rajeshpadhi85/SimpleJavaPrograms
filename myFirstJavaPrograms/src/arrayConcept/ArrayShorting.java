package arrayConcept;

public class ArrayShorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= new int[]{12,5,7,13,25};
		int k=ar.length;
		int temp;
		System.out.println("elements before shorting");
		for(int i=0;i<k;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		
		
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("elements after shorting");
		
		for(int i=0;i<k;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		System.out.println("the second largest number of an array is "+ar[k-2]);
		System.out.println("the second smallest number of an array is "+ar[1]);
		
	}

}
