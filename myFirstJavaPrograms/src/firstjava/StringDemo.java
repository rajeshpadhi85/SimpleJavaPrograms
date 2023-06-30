package firstjava;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name="rajesh kumar";
//		String data="IT IS MY NAME";
//		
//		System.out.println(name.toUpperCase());
//		System.out.println(data.toLowerCase());
//		System.out.println(name.indexOf('j'));
//		
//		for(int i=0;i<name.length();i++)
//		{
//			System.out.print(name.charAt(i));
//		}
//		System.out.println();
//		for(int i=name.length()-1;i>=0;i--)
//		{
//			System.out.print(name.charAt(i));
//		}
//		System.out.println();
//		String village="a,t,i,r,a";
//		String array[]=village.split(",");
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(array[i]);
//		}
//		System.out.println();
//		// below method reverse the string
//		StringBuilder str2=new StringBuilder();
//		str2.append(name);                                       // the method append() add the String object value with StringBuilder object
//		
//		str2=str2.reverse();									// the method reverse() of StringBuilder reverse a string and stores in the same object
//		System.out.println("check this"+str2);
//		System.out.println(str2.getClass());                    // the method getClass() return the object base class
//		
		String str="rajeeshh";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==(str.charAt(j)))
				{
					System.out.println(str.charAt(i));
				}
			}
			
		}
		

	}

}
