package Interview_programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="rajesh kumar padhi";
		String[] arr=name.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			char[] charr = arr[i].toCharArray();
			for(int j=charr.length-1;j>=0;j--) {
				System.out.print(charr[j]);
			}
			System.out.print(" ");
		}
	}

}
