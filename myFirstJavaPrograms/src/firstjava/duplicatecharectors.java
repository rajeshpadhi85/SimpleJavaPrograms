package firstjava;

import java.util.*;

public class duplicatecharectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Character> ch=new HashSet<>();
		String str="hi my name is rajesh and how ar u";
		int length=str.length();
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(str.charAt(i)==str.charAt(j)&&str.charAt(i)!=' ')
				{
					ch.add(str.charAt(i));

//					System.out.println(str.charAt(i)+" is a duplicate carector");
				}
			}

		}
		
		System.out.println(ch);
	}
}
