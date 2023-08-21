package Interview_programs;

public class UpperCaseAndLowerCaseCount {

	public static void main(String[] args) {
		
		String name="My Name Is Rajesh195";
		int upper=0;
		int lower=0;
		int number=0;
		int specilaCharector=0;
		char[] arr = name.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='A'&&arr[i]<='Z') {
				upper++;
			}
			else if(arr[i]>='a' && arr[i]<='z') {
				lower++;
			}
			else if(arr[i]>='0' && arr[i]<='9') {
				number++;
			}else {
				specilaCharector++;
			}
		}
		
		System.out.println("capital letters are "+upper);
		System.out.println("small letters are "+lower);
		System.out.println("integers are "+number);
		System.out.println("special charecotrs are "+specilaCharector);


	}

}
