package firstjava;

public class TruncateAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Truncate a string first and last character
		String name="rajesh";
		StringBuilder stringbuilder=new StringBuilder(name);
		stringbuilder.deleteCharAt(0);
		stringbuilder.deleteCharAt(stringbuilder.length()-1);
		String trauncatedstring=stringbuilder.toString();
		System.out.println(trauncatedstring);
		
		//Truncate a length of characters in a string
		String surname="Chohan";
		StringBuilder steb=new StringBuilder(surname);
		steb.delete(2, 4); //the start index is inclusive and end index is exclusive
		String newstring=steb.toString();
		System.out.println(newstring);
		
		//Truncate a character in the whole string
		String sentance="God always great";
		StringBuilder build=new StringBuilder(sentance);
		for(int i=0;i<build.length();i++)
		{
			if(build.charAt(i)=='a') {
				build.deleteCharAt(i);
			}
		}
		System.out.println(build.toString());
		

	}

}
