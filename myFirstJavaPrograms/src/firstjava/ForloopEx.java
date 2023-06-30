package firstjava;

public class ForloopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String str= "My name is Rajesh";
		
		
		
		//for (int i=1;i<=10; i++) 
		//	System.out.println(str);                              // this will print any given string 10 times
			//System.out.println(i*25);                           // this will print table of any number
			
		/*	{ if (i==5) 
			continue;                                  // use of continue key word. the result will skip 5 and print all 1 to 10 numbers
			System.out.println(i); }  */
		
		/*	int j=2;
		for (int i=1; i<=5; i++, j++) {
			System.out.print(i+j);                        // this will print 3 5 7 9 11  in a column
		System.out.print(",");} */                        // this will print 3,5,7,9,11 in a row
		
	
/////////////////////////////////////////////////////////////////////////////////////////////////		
		/*  for (int i=1; i<=5; i++)
		  {
			  for (int j=1; j<=5; j++)                      // it will print squire of starts
			  {
				  System.out.print(" * ");
			  }
			  System.out.println();
		  }  */
////////////////////////////////////////////////////////////////////////////////////////////////////		
	/*	for (int i=1; i<=5; i++)                           // it will print increasing order of stars 
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();  
		}    */
//////////////////////////////////////////////////////////////////////////////////////////////////////		
	/*	for (int i=1; i<=5; i++)                         // it will print decreasing order of stars
		{
			for (int j=i; j<=5; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}  */
//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		for (int i=1; i<=5; i++)
		{
			for (int j=i; j<=5; j++)
			{
				System.out.print("  ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print(" *");
			}
			for (int m=1; m<i; m++)
			{
				System.out.print(" *");
			}
			for (int n=i; n<=5; n++)
			{
				System.out.print(" ");
			}
					
			System.out.println();
		}
	}

}
