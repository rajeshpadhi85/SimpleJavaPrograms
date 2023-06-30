package firstjava;

public class vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="rajesh";
		int length=str.length();
		int count=0;
		for(int i=0;i<length;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				System.out.println(str.charAt(i)+" is a vowel");
				count=count+1;
				
			}
			else
			{
				System.out.println(str.charAt(i)+" is not a vowel");
			}
		}
		System.out.println("Total number of vowels are "+count);

	}

}
